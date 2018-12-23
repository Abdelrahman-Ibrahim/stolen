package system;
import java.util.*;
import java.io.*;
public class Dt_access {
	static ArrayList<User>user=new ArrayList<User>(); 
	public void save_Usser_info(String name,String email,String password,String gender,String birth_date)
	{
		User u1=new User();
		u1.setName(name);
		u1.setEmail(email);
		u1.setPassword(password);
		u1.setGender(gender);
		u1.setBirth_date(birth_date);
		user.add(u1);
		try {
			File file = new File("user_info.txt");
			FileWriter fr = new FileWriter(file, true);
			fr.write(u1.getName());
			fr.write('|');
			fr.write(u1.getEmail());
			fr.write('|');
			fr.write(u1.getPassword());
			fr.write('|');
			fr.write(u1.getGender());
			fr.write('|');
			fr.write(u1.getBirth_date());
			fr.write("\n");
			fr.close();
			}
			catch(Exception e1)
			{
				System.out.println("Can't lanuch file");
			}
	}
	
	public String  get_User_info(String name) 
	{ 
		BufferedReader reader;
		try {
			reader = new BufferedReader(new FileReader("user_info.txt"));
			String line = reader.readLine();
			while (line != null) {
				String[] check=line.split("\\|");
				if(check[0].equals(name))
				{
					System.out.println(line);
					break;
				}
				line = reader.readLine();
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return "";
	}
	
}
