
public class Ticket {
	
	private int ticketID;
	private Showtime showtime;
	private Seat seat;
	private int cost; // in dollars
	private static int DEFAULT_TICKET_COST = 10;
	
	public Ticket(int ticketID, Showtime showtime, Seat seat) {
		this.ticketID = ticketID;
		this.showtime = showtime;
		this.seat = seat;
		this.cost = DEFAULT_TICKET_COST;
	}
	
	public Showtime getShowtime() {
		return showtime;
	}
	
	public Seat getSeat() {
		return seat;
	}
	
	public int getCost() {
		return cost;
	}
	
	public void printTicket() {
		System.out.println("Ticket " + ticketID);
		this.showtime.printShowtime();
		System.out.println("Theater " + this.seat.getTheater());
		System.out.println("Seat " + this.seat.getID());
		System.out.println("Cost: $" + this.cost);
	}

}
