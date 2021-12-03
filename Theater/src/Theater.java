
public class Theater {
	int capacity;
	Seat[] seats;
	Time[] schedule;
	Movie[] movieSchedule;
	
	public Theater(int c, Seat[] s) {
		capacity = c;
		seats = s;
		schedule = new Time[21];
		movieSchedule = new Movie[21];
	}
	
}
