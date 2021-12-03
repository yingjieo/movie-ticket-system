
public class Theater {
	private int ID;
	private int capacity;
	private Seat[][] seats;
	private Showtime[] movieSchedule;
	private static int SEAT_ROWS = 5;
	private static int SEAT_COLS = 5;
	
	public Theater(int id) {
		ID = id;
		capacity = SEAT_ROWS * SEAT_COLS;
		seats = new Seat[SEAT_ROWS][SEAT_COLS];
		
		int seatNum = 0;
		for (int i = 0; i < SEAT_ROWS; i++) {
			for (int j = 0; j < SEAT_COLS; j++) {
				seats[i][j] = new Seat(seatNum, id);
				seatNum++;
			}
		}
		
		movieSchedule = new Showtime[21];
	}
	
	public int getID() {
		return ID;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public Seat[][] getSeats() {
		return seats;
	}
	
	public Showtime[] getSchedule() {
		return movieSchedule;
	}
	
	public void listSeats() {
		// method to list all the seats in the theater
		// seats listed should have seatID if not taken, "X" if taken
	}
	
}

