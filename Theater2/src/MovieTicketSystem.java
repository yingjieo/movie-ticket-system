import java.util.Scanner;

public class MovieTicketSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theater theater1 = new Theater(1);
		Theater theater2 = new Theater(2);
		Theater theater3 = new Theater(3);
		Theater theater4 = new Theater(4);
		Theater theater5 = new Theater(5);
		Theater theater6 = new Theater(6);
		Movie movie1 = new Movie("Encanto","PG", "Musical", 109);
        Movie movie2 = new Movie("House of Gucci", "R", "Drama",  157);
        Movie movie3 = new Movie("Resident Evil: Welcome to Raccoon City","R","Horror", 107);
        Movie movie4 = new Movie("Ghostbusters: Afterlife", "PG-13", "Sci-Fi", 124);
        Movie movie5 = new Movie("King Richard", "PG-13", "Drama",  144);
        Movie movie6 = new Movie("Eternals", "PG-13", "SuperHero",  157);
		int flag = 0;

		while (true) {
			System.out.println("Welcome to the Movie Theater!");
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println("(1) Register account"); // need to find a way for system to detect if you are logged in or not
			System.out.println("(2) Login");
			System.out.println("(3) Logout");
			System.out.println("(4) Purchase Ticket");
			System.out.println("(5) Cancel Ticket Order");
			System.out.println("(0) Quit");
			
			Scanner input = new Scanner(System.in);
			int choice = input.nextInt();
			
			if (choice == 0) {
				System.out.println("Goodbye!");
				break;
			}
			if (choice == 1) {
				if (flag == 1){
					System.out.println("User already logged in");
					continue;
				}
				else{
					System.out.println("Enter Email Address");
					Scanner temp = new Scanner(System.in);
					String emailaddress = temp.nextString();
					int createID = ThreadLocalRandom.current().nextInt(1000, 10000);
					System.out.print("Your account ID is: ");
					System.out.println(createID);
					Customer customer = new Customer (createID,emailaddress);
					continue;
				}
			}
			if (choice == 2){
				if (flag == 1){
					System.out.println("You are already logged in");
					continue;
				}
				else{
				System.out.println("Enter your account ID");
				Scanner temp1 = new Scanner(System.in);
				int customerID = temp1.nextint();
				System.out.println("Enter Email Address");
				Scanner temp2 = new Scanner(System.in);
				String emailaddress = temp2.nextString();
				if(customer.accountID == customerID && customer.email.equals(emailaddress)){
					System.out.println("Succesful Login");
					flag = 1;
					continue;
				}
				else{
					System.out.println("UserID or emailaddress is incorrect");
					continue;
				}

			}

		}
			if (choice == 3){
				flag = 0;
				System.out.println("User is logged out");
				continue;
			}
			if (choice == 4){
				System.out.println("Choose a Film");
				System.out.println();
				System.out.println("(1)" + movie1.toString());
				System.out.println("(2)" + movie2.toString());
				System.out.println("(3)" + movie3.toString());
				System.out.println("(4)" + movie4.toString());
				System.out.println("(5)" + movie5.toString());
				System.out.println("(6)" + movie6.toString());
				Scanner temp = new Scanner(System.in);
				String moviechoice = temp.nextInt();




			}
		}

	}

}