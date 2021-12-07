import java.util.Scanner;

public class MovieTicketSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Theater[] theaters = new Theater[6];
		theaters[0] = new Theater(1);
		theaters[1] = new Theater(2);
		theaters[2] = new Theater(3);
		theaters[3] = new Theater(4);
		theaters[4] = new Theater(5);
		theaters[5] = new Theater(6);

		Movie[] movies = new Movie[6];
	    movies[0] = new Movie("Encanto","PG", "Musical", 109);
        movies[1] = new Movie("House of Gucci", "R", "Drama",  157);
        movies[2] = new Movie("Resident Evil: Welcome to Raccoon City","R","Horror", 107);
        movies[3] = new Movie("Ghostbusters: Afterlife", "PG-13", "Sci-Fi", 124);
        movies[4] = new Movie("King Richard", "PG-13", "Drama",  144);
        movies[5] = new Movie("Eternals", "PG-13", "SuperHero",  157);

		for (int i = 0; i < 6; i++) {
        	for (int j=0; j < 7; j++) {
        		Time newTime = new Time(12, 1+j, 15, 0, movies[i].getLength());
                Showtime newShowtime = new Showtime(movies[i], newTime);
                theaters[i].addShowtime(newShowtime);
                newTime = new Time(12, 1+j, 18, 0, movies[i].getLength());
                newShowtime = new Showtime(movies[i], newTime);
                theaters[i].addShowtime(newShowtime);
                newTime = new Time(12, 1+j, 21, 0, movies[i].getLength());
                newShowtime = new Showtime(movies[i], newTime);
                theaters[i].addShowtime(newShowtime);
        	}
        }

		int MAX_ORDERS = 3;
		int THEATER_NUM = 6;
		int MOVIE_NUM = THEATER_NUM;
		int DEFAULT_TICKET_COST = 10;
		
		int accountCount = 0;
		int MAX_ACCOUNT_NUM = 100;
		Customer[] accountList = new Customer[MAX_ACCOUNT_NUM];
		Customer loggedInAccount = null;

		while (true) {
			System.out.println();
			System.out.println("Welcome to the Movie Theater!");
			System.out.println();
			System.out.println("What would you like to do?");
			System.out.println("(1) Register account"); 
			System.out.println("(2) Login");
			System.out.println("(3) Logout");
			System.out.println("(4) Purchase Ticket");
			System.out.println("(5) Cancel Ticket Order");
			System.out.println("(6) Print Your Ticket Orders");
			System.out.println("(0) Quit");
			if (loggedInAccount == null) {
				System.out.println("You are not logged in");
			} else {
				System.out.println("You are logged in");
				System.out.println("Account ID: " + loggedInAccount.getID());
			}
			
			try {
				Scanner input = new Scanner(System.in);
				int choice = input.nextInt();
				if (choice == 0) {
					System.out.println("Thank you for using the Movie Theater. Goodbye!");
					break;
				} else if (choice == 1) {
					if (loggedInAccount != null){
						System.out.println("User already logged in");
						continue;
					} else{
						if (accountCount >= MAX_ACCOUNT_NUM) {
							System.out.print("Sorry, the system cannot add any more account");
							continue;
						}
						System.out.print("Enter Email Address: ");
						Scanner temp = new Scanner(System.in);
						String emailaddress = temp.nextLine();
						int createID = accountCount;
						System.out.print("Your account ID is: ");
						System.out.println(createID);
						accountList[createID] = new Customer (createID,emailaddress);
						accountCount++;
						continue;
					}
				} else if (choice == 2){
					if (loggedInAccount != null){
						System.out.println("You are already logged in");
						continue;
					} else{
						System.out.print("Enter your account ID: ");
						Scanner temp1 = new Scanner(System.in);
						int customerID = temp1.nextInt();
						if (customerID < 0 || customerID >= MAX_ACCOUNT_NUM || accountList[customerID] == null) {
							System.out.println("Invalid account ID");
							continue;
						}
						System.out.print("Enter Email Address: ");
						Scanner temp2 = new Scanner(System.in);
						String emailaddress = temp2.nextLine();
						String validemail = accountList[customerID].getEmail();
						if(validemail.equals(emailaddress)){
							System.out.println("Succesful Login");
							loggedInAccount = accountList[customerID];
							continue;
						}
						else{
							System.out.println("UserID or email address is incorrect");
							continue;
						}

					}

				} else if (choice == 3){
					if (loggedInAccount == null) {
						System.out.println("You are not logged in");
						continue;
					} else {
						loggedInAccount = null;
						System.out.println("You have successfully logged out");
						continue;
					}
				} else if (choice == 4){
					if (loggedInAccount == null) {
						System.out.println("You are not logged in. Please log in first.");
						continue;
					} else {
						if (loggedInAccount.getOrderNum() >= MAX_ORDERS) {
							System.out.println("You cannot order more than 3 tickets");
							continue;
						}
						System.out.println();
						for (int i = 0; i < MOVIE_NUM; i++) {
							System.out.print(i + ") ");
							movies[i].printMovie();
							System.out.println();
						}
						System.out.print("Please choose a film from above (Enter numbers only): ");
						Scanner temp3 = new Scanner(System.in);
						int moviechoice = temp3.nextInt();
						if (moviechoice < 0 || moviechoice >= MOVIE_NUM) {
							System.out.println("You have entered an invalid input");
							continue;
						}
						
						System.out.println();
						theaters[moviechoice].printSchedule();
						System.out.print("Please choose a showtime from above (Enter numbers only): ");
						Scanner temp4 = new Scanner(System.in);
						int showtimechoice = temp4.nextInt();
						if (showtimechoice < 0 || showtimechoice >= theaters[moviechoice].getShowtimeNum()) {
							System.out.println("You have entered an invalid input");
							continue;
						}
						
						Showtime[] showtimes = theaters[moviechoice].getSchedule();
						Time time = showtimes[showtimechoice].getTime();
						System.out.println();
						theaters[moviechoice].printSeats(time);
						System.out.print("Please choose a seat from above (Enter numbers only): ");
						Scanner temp5 = new Scanner(System.in);
						int seatchoice = temp5.nextInt();
						if (seatchoice < 0 || seatchoice >= theaters[moviechoice].getCapacity()) {
							System.out.println("You have entered an invalid input");
							continue;
						}
						
						Seat orderedseat = theaters[moviechoice].getSeat(seatchoice);
						if (loggedInAccount.orderTicket(showtimes[showtimechoice], orderedseat)) {
							movies[moviechoice].addProfit(DEFAULT_TICKET_COST);
						}
						continue;
					}
					
				} else if (choice == 5) {
					if (loggedInAccount == null) {
						System.out.println("You are not logged in. Please log in first.");
						continue;
					} else {
						if (loggedInAccount.getOrderNum() == 0) {
							System.out.println("You don't have any ticket order right now");
							continue;
						}
						System.out.println();
						loggedInAccount.printTickets();
						System.out.print("Type the ID of ticket you want to cancel: ");
						Scanner deletechoice = new Scanner(System.in);
						choice = deletechoice.nextInt();
						if (choice < 0 || choice >= MAX_ORDERS) {
							System.out.println("You have entered an invalid input");
							continue;
						}
						loggedInAccount.cancelTicket(choice);
						continue;
					}
					
				} else if (choice == 6) {
					if (loggedInAccount == null) {
						System.out.println("You are not logged in. Please log in first.");
						continue;
					} else {
						System.out.println();
						loggedInAccount.printTickets();
						continue;
					}
				} else {
					System.out.println("You have entered an invalid input");
					continue;
				}
			} catch (Exception e) {
				System.out.println("You have entered an invalid input");
				continue;
			}

		}

	}

}