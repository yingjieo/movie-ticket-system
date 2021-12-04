
public class Seat {
	private int ID;
	private int theaterID;
	private Time[] reservation;
	private int reservationNum;
	private static int MAX_SLOTS = 21;
	
	public Seat(int id, int t) {
		ID = id;
		theaterID = t;
		reservation = new Time[MAX_SLOTS];
		reservationNum = 0;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getTheater() {
		return theaterID;
	}
	
	public Time[] getReservation() {
		return reservation;
	}
	
	//add a reservation time interval, return true if successfully added, false if array is full or the time slot is already booked
	public boolean addReservation(Time t) {
		if (reservationNum == reservation.length) {
			System.out.println("All time slots booked.");
			return false;
		}
		
		for (int i = 0; i < reservation.length; i++) {
			if (reservation[i] != null && reservation[i].equals(t)) {
				System.out.println("Time slot already booked.");
				return false;
			}
		}
		reservation[reservationNum] = t;
		reservationNum++;
		return true;
	}
	
	//delete a reservation time interval, return true if successfully deleted, false if time not found
	public boolean deleteReservation(Time t) {
		for(int i = 0; i < reservation.length; i++) {
			if (reservation[i] != null && reservation[i].equals(t)) {
				//shift up the remaining reservations
				int j = i;
				while (j < reservation.length-1) {
					reservation[j] = reservation[j+1];
					j++;
				}
				reservation[j] = null;
				reservationNum--;
				return true;
			}
		}
		System.out.println("Time not found.");
		return false;
	}
	
	//searches for whether or not time t is reserved, returns true if time t is booked, false otherwise
	public boolean searchReservation(Time t) {
		for(int i = 0; i < reservation.length; i++) {
			if (reservation[i] != null && reservation[i].equals(t)) {
				return true;
			}
		}
		return false;
	}
}
