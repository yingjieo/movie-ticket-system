
public class Seat {
	int ID;
	int theater;
	Time[] reservation;
	int reservationNum;
	
	public Seat(int i, int t) {
		ID = i;
		theater = t;
		reservation = new Time[21];
		reservationNum = 0;
	}
	
	//add a reservation time interval, return true if successfully added, false if array is full
	public boolean addReservation(Time t) {
		if (reservationNum == reservation.length) {
			return false;
		}
		reservation[reservationNum] = t;
		return true;
	}
	
	//delete a reservation time interval, return true if successfully deleted, false if time not found
	public boolean deleteReservation(Time t) {
		int i = 0;
		while (i < reservation.length) {
			if (reservation[i] != null && reservation[i].equals(t)) {
				reservation[i] = null;
				return true;
			}
			i++;
		}
		return false;
	}
}
