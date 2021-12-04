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
		}

	}

}