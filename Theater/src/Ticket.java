
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
		return this.showtime;
	}
	
	public Seat getSeat() {
		return this.seat;
	}
	
	public int getCost() {
		return this.cost;
	}

	public String toString() {
		return ticketID+" "+showtime+" "+seat+" "+cost;
	}

}
