package system;


import java.util.*;
import java.io.*;

public class User_Services {

	boolean verify(String name , String mail)
	{
		boolean enter=true;
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("user_info.txt"));
			String line = reader.readLine();
			while (line != null) {
				String[] check=line.split("\\|");
				if(check[0].equals(name) && check[1].equals(mail))
				{
					enter= false;
					break;
				}
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return enter;
	}
	
	boolean regiteration() {
		boolean correct = true ;
		Dt_access d2 = new Dt_access();
		Scanner input = new Scanner(System.in);
		String name, email, password, gender, birth;
		System.out.println("Enter name: ");
		name = input.nextLine();
		System.out.println("Enter email: ");
		email = input.nextLine();
		System.out.println("Enter password: ");
		password = input.nextLine();
		System.out.println("Enter gender: ");
		gender = input.nextLine();
		System.out.println("Enter birth: ");
		birth = input.nextLine();
		if (verify(name, email)==true)
		d2.save_Usser_info(name, email, password, gender, birth);
		else {
			System.out.println("used name or email please choose another");
			correct=false;
		}
		
		return true;
	}
	
	boolean login() {
		boolean enter= false;
		Dt_access d2 = new Dt_access();
		String name,password;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter name: ");
		name = input.nextLine();
		System.out.println("Enter password: ");
		password = input.nextLine();
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("user_info.txt"));
			String line = reader.readLine();
			while (line != null) {
				String[] check=line.split("\\|");
				if(check[0].equals(name) && check[2].equals(password)  )
				{
					System.out.println("logged in");
					enter= true;
					break;
				}
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
		return enter;
	}
	
	
}
