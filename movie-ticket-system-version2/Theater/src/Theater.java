
public class Theater {
	int ID;
	int capacity;
	Seat[][] seats;
	Showtime[] movieSchedule;
	static int seatRows = 5;
	static int seatCols = 5;
	
	public Theater(int id, int cap) {
		ID = id;
		capacity = cap;
		seats = new Seat[seatRows][seatCols];
		
		int seatNum = 0;
		for (int i = 0; i < seatRows; i++) {
			for (int j = 0; j < seatCols; j++) {
				seats[i][j] = new Seat(seatNum, id);
				seatNum++;
			}
		}
		
		movieSchedule = new Showtime[21];
	}
	
}

