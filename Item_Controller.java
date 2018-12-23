package a;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.TreeMap;

public class Item_Controller {

	
		int Request_num;

		void Requeset(int req) {
			Request_num = req;
			Respond();
		}

		void Respond() {
			if (Request_num == 3){
				Ex4();
			} else if (Request_num == 4) {
				Ex3();
							}

		}

		void Ex3() {
			Scanner In = new Scanner(System.in);

			TreeMap<Integer, String> Indices = Item_Service.Search();
			System.out.println("Please Enter Your Choice");
			int num = In.nextInt();
			System.out.println(Indices.get(num));
			In.close();
		}

		void Ex4() {
			Scanner In = new Scanner(System.in);
            System.out.println("Enter The Name of the Item");
			String Name = In.nextLine();
			System.out.println("Enter The Type of the Item");
			String Type = In.nextLine();
			System.out.println("Enter The Place where you found of the Item");
			String Place = In.nextLine();
			System.out.println("Enter The Date on which you have found the Item");
			String Date_of_found = In.nextLine();
			String I = Name + "|" + Type + "|" + Place + "|" + Date_of_found + "\n";
//Append in Posts File
			try {
				File file = new File("Posts.txt");
				FileWriter fr = new FileWriter(file, true);
				fr.write(I);

				fr.close();
			} catch (Exception e1) {
				System.out.println("Can't lanuch file");
			}


	In.close();}
}

