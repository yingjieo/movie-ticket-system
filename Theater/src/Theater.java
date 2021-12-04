
public class Theater {
	private int ID;
	private int capacity;
	private Seat[][] seats;
	private Showtime[] movieSchedule;
	private int showTimeNum;
	private static int SEAT_ROWS = 5;
	private static int SEAT_COLS = 5;
	private static int MAX_SHOWTIME_COUNT = 21;
	
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
		
		movieSchedule = new Showtime[MAX_SHOWTIME_COUNT];
		showTimeNum = 0;
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
	
	//adds showtime s, returns true if successfully added, false if movieschedule is full or if
	//the time slot is already occupied
	public boolean addShowTime(Showtime s) {
		if (showTimeNum == MAX_SHOWTIME_COUNT) {
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
		movieSchedule[showTimeNum] = s;
		showTimeNum++;
		return true;
	}
	
	//deletes showtime s, returns true if successfully deleted, false if the showtime is not in the schedule
	public boolean deleteShowTime(Showtime s) {
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
					showTimeNum--;
					return true;
				}
			}
		}
		System.out.println("Showtime not found.");
		return false;
	}
	
	//listSeats - lists all the seats in the theater at time t, taken seats are shown as "X,"
	// available seats are shown as seatID
	public void listSeats(Time t) {
		for (int i = 0; i < SEAT_ROWS; i++) {
			for (int j = 0; j < SEAT_COLS; j++) {
				if (seats[i][j].searchReservation(t) == true) {
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
}

