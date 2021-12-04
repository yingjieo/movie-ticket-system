
//Time represents a time interval
//We are assuming no Time objects with different start time have durations overlapping with each other
public class Time {
	private int month;
	private int date;
	private int time; //in terms of 24 hour, ex: 2:00 PM is represented with number 14
	//month, date, and time make up the start time of the time interval
	private int duration; //duration of the time interval in terms of hour, ex: 3 hour duration is represented with 3
	//minute and second are not considered
	
	public Time(int m, int d, int t, int du) {
		month = m;
	    date = d;
	    time = t;
	    duration = du;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDate() {
		return date;
	}
	
	public int getTime() {
		return time;
	}
	
	public int getDuration() {
		return duration;
	}
	
	public int getEndTime() {
		return time + duration;
	}
	
	//checks if this time and the input time are equal
	public boolean equals(Time t) {
		if (this.month == t.getMonth() && this.date == t.getDate() && this.time == t.getTime()) {
			return true;
		} else {
			return false;
		}
	}
}
