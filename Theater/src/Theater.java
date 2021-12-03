
public class Theater {
	int ID;
	int capacity;
	Seat[][] seats;
	Time[] schedule;
	Movie[] movieSchedule;
	
	public Theater(int i, int c, Seat[][] s) {
		ID = i;
		capacity = c;
		seats = s;
		schedule = new Time[21];
		movieSchedule = new Movie[21];
	}
	
}

