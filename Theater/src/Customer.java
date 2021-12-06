
public class Customer {
	private int accountID;
	private String email;
	private Ticket[] ticketOrders;
	private String paymentMethod;
	private int orderNum;
	private static int MAX_ORDERS = 3; // max number of tickets a customer can order
	
	public Customer(int id, String email) {
		if (id < 0) {
            throw new IllegalArgumentException("Account ID cannot be negative");
        }
		this.accountID = id;
		this.email = email;
		this.ticketOrders = new Ticket[MAX_ORDERS];
		this.paymentMethod = "";
		this.orderNum = 0;
		
	}
	
	public int getID() {
		return accountID;
	}
	
	public String getEmail() {
		return email;
	}
	
	public boolean updatePaymentMethod(String paymentMethod) {
		// customer can update payment method. returns true if valid payment method added
		String[] validPaymentMethods = {"credit", "debit"};
		
		String method = paymentMethod.toLowerCase();
		
		for (int i = 0; i < validPaymentMethods.length; i++) {
			if (method.equals(validPaymentMethods[i])) {
				paymentMethod = method;
				return true;
			}
		}
		
		return false;
	}
	
	public boolean updateEmail(String newEmail) {
		email = newEmail;
		return true;
	}
	
	public boolean orderTicket(Showtime showtime, Seat seat) {
		if (showtime == null) {
			System.out.println("Showtime input is null.");
            return false;
        }
		if (seat == null) {
			System.out.println("Seat input is null.");
            return false;
        }
		Time time = showtime.getTime();
		if (seat.addReservation(time)) {
			Ticket newTicket = new Ticket(orderNum, showtime, seat);
			ticketOrders[orderNum] = newTicket;
			orderNum++;
			return true;
		}
		return false;
	}
	
	public boolean cancelTicket(int ticketID) {
		if (ticketID < 0 || ticketID >= ticketOrders.length) {
			System.out.println("TicketID is invalid.");
            return false;
        }
		Ticket ticket = ticketOrders[ticketID];
		if (ticket == null) {
			System.out.println("TicketID is invalid.");
            return false;
		}
		Showtime showtime = ticket.getShowtime();
		Seat seat = ticket.getSeat();
		Time time = showtime.getTime();
		if (seat.deleteReservation(time)) {
			for(int i = 0; i < ticketOrders.length; i++) {
				if (i == ticketID) {
					//shift up the remaining tickets
					int j = i;
					while (j < ticketOrders.length-1) {
						ticketOrders[j] = ticketOrders[j+1];
						j++;
					}
					ticketOrders[j] = null;
					orderNum--;
					return true;
				}
			}
		}
		return false;
	}
	
	public void printTickets() {
		System.out.println("Account " + accountID + " Ticket Orders");
		for (int i = 0; i < ticketOrders.length; i++) {
			if (ticketOrders[i] != null) {
				ticketOrders[i].printTicket();
			}
		}
	}
}
