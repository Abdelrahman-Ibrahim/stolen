package system;

public class User_Controller {
	int request;
	public User_Services us = new User_Services();
	public Item_Controller ic = new Item_Controller();

	void Request(int r) {
		request = r;
		Respond();
	}

	void Respond() {

		if (request == 1) {
			while (true) {
				if (us.regiteration() == true)
					break;
				us.regiteration();
			}
		} else if (request == 2) {
			int tries = 0;
			while (tries < 3) {
				if (us.login() == true)
					break;
				else
				{
					if(tries==2)
					{
						System.out.println("sorry...try another time!");
						System.exit(0);
					}
					else
					{
						System.out.println("Invalid Login...Please Try again!");
					}
				}
				tries++;
			}
		} else if (request == 3) {
			search();
		} else if (request == 4) {
			post();
		}
	}

	void search() {
		ic.Requeset(request);
	}

	void post() {
		ic.Requeset(request);
	}

}
