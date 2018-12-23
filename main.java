package system;

import java.util.*;

public class main {
	public static void main(String[] args) {
		User_Controller uc = new User_Controller();
		Scanner input = new Scanner(System.in);	
		int ans =0;
		for (int i = 0; i < 10; i++) {
			System.out.println("Enter your choice:");
			System.out.println("1-Register");
			System.out.println("2-Login");
			System.out.println("3-Post item");
			System.out.println("4-Search");
			System.out.println("5-Exit");
			ans =input.nextInt();
			if (ans == 5) {
				System.exit(0);
			}
			uc.Request(ans);
		}
		
		
	}

}
