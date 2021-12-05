
public class Theater {
	private int theaterID;
	private int capacity;
	private Seat[][] seats;
	private Showtime[] movieSchedule;
	private int showtimeNum;
	private static int SEAT_ROWS = 5;
	private static int SEAT_COLS = 5;
	private static int MAX_SHOWTIME_COUNT = 21;
	
	public Theater(int theaterID) {
		this.theaterID = theaterID;
		this.capacity = SEAT_ROWS * SEAT_COLS;
		this.seats = new Seat[SEAT_ROWS][SEAT_COLS];
		
		int seatNum = 0;
		for (int i = 0; i < SEAT_ROWS; i++) {
			for (int j = 0; j < SEAT_COLS; j++) {
				this.seats[i][j] = new Seat(seatNum, theaterID);
				seatNum++;
			}
		}
		
		this.movieSchedule = new Showtime[MAX_SHOWTIME_COUNT];
		this.showtimeNum = 0;
	}
	
	public int getID() {
		return theaterID;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	//returns a pointer to a specific seat in the theater
	public Seat getSeat(int seatID) {
		return seats[seatID/SEAT_COLS][seatID%SEAT_COLS];
	}
	
	public Seat[][] getSeats() {
		return seats;
	}
	
	public Showtime[] getSchedule() {
		return movieSchedule;
	}
	
	//adds showtime s, returns true if successfully added, false if movieschedule is full or if
	//the time slot is already occupied
	public boolean addShowtime(Showtime s) {
		if (showtimeNum == MAX_SHOWTIME_COUNT) {
			System.out.println("Max showtime reached.");
			return false;
		}
		
		Time st = s.getTime();
		for (int i = 0; i < MAX_SHOWTIME_COUNT; i++) {
			if (movieSchedule[i] != null) {
				Time currentTime = movieSchedule[i].getTime();
				if (currentTime.equals(st)) {
					System.out.println("Time slot already has a show.");
					return false;
				}
			}
		}
		movieSchedule[showtimeNum] = s;
		showtimeNum++;
		return true;
	}
	
	//deletes showtime s, returns true if successfully deleted, false if the showtime is not in the schedule
	public boolean deleteShowtime(Showtime s) {
		Time st = s.getTime();
		for(int i = 0; i < MAX_SHOWTIME_COUNT; i++) {
			if (movieSchedule[i] != null) {
				Time currentTime = movieSchedule[i].getTime();
				if (currentTime.equals(st)) {
					int j = i;
					while (j < MAX_SHOWTIME_COUNT-1) {
						movieSchedule[j] = movieSchedule[j+1];
						j++;
					}
					movieSchedule[j] = null;
					showtimeNum--;
					return true;
				}
			}
		}
		System.out.println("Showtime not found.");
		return false;
	}
	
	//printSeats - lists all the seats in the theater at time t, taken seats are shown as "X,"
	// available seats are shown as seatID
	public void printSeats(Time t) {
		System.out.println("Theater " + theaterID + " Seat Status");
		for (int i = 0; i < SEAT_ROWS; i++) {
			for (int j = 0; j < SEAT_COLS; j++) {
				if (seats[i][j].hasReservation(t) == true) {
					System.out.print(" X");
				} else {
					int id = seats[i][j].getID();
					if (id < 10) {
						System.out.print(" ");
					}
					System.out.print(id);
				}
				System.out.print(" | ");
			}
			System.out.println();
		} 
	}
	
	//printSchedule - lists the movie schedule of the theater
	public void printSchedule() {
		System.out.println("Theater " + theaterID + " Movie Schedule");
		for (int i = 0; i < MAX_SHOWTIME_COUNT; i++) {
			if (movieSchedule[i] != null) {
				movieSchedule[i].printShowtime();
			}
		}
	}
}

