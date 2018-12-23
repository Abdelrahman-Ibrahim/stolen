package a;
import java.io.*;
import java.util.*;
public class Item_Service {

	static TreeMap<Integer, String> Search() {
		Scanner In = new Scanner(System.in);
		System.out.println("Please Fill the console with what you want to search about");
		String info=In.nextLine();
		Vector<String>info_v=new Vector<>();
		Vector<String>P=new Vector<>();
		P.add("Name:");P.add("Type:");P.add("Place:");P.add("Date_of_found:");

		String []str=info.split(" ");
		for(String i:str)info_v.add(i);

		TreeMap<Integer, String> Indices = new TreeMap<>();
		String fileName = "Posts.txt";
		String line = "";

		try {

			BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName));

			while ((line = bufferedReader.readLine()) != null) {
				String item[]=line.split("\\|");
				boolean f=false;
				String res="";
				for(String i:item)if(info_v.contains(i)){f=true;break;}
                if(f){
                System.out.print(Indices.size()+1+"-");
                for(int i=0;i<item.length;i++){
                	System.out.println(P.get(i)+item[i]);
                	res+=(P.get(i)+item[i]+"\n");}
                Indices.put(Indices.size()+1,res);
                }


			}

			bufferedReader.close();
		} catch (FileNotFoundException ex) {
			System.out.println("Unable to open file '" + fileName + "'");
		} catch (IOException ex) {

			ex.printStackTrace();
		}





		In.close();
		return Indices;
	}

}


