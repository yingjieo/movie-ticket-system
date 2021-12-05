
//Time represents a time interval
//We are assuming no Time objects with different start time have durations overlapping with each other
public class Time {
	private int month;
	private int date;
	private int time; //in terms of 24 hour, ex: 2:00 PM is represented with number 14, midnight is represented with 0
	//month, date, and time make up the start time of the time interval
	private int duration; //duration of the time interval in terms of hour, ex: 3 hour duration is represented with 3
	//minute and second are not considered
	
	public Time(int month, int date, int time, int duration) {
		if (month < 1 || month > 12) {
            throw new IllegalArgumentException("Month input is invalid");
        }
		if (date < 1 || date > 31) {
            throw new IllegalArgumentException("Date input is invalid");
        }
		if (time < 0 || time > 23) {
            throw new IllegalArgumentException("Time input is invalid");
        }
		if (duration < 0) {
            throw new IllegalArgumentException("Duration input is invalid");
        }
		this.month = month;
	    this.date = date;
	    this.time = time;
	    this.duration = duration;
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
		if (t == null) {
			System.out.println("Time input is null.");
            return false;
        }
		if (this.month == t.getMonth() && this.date == t.getDate() && this.time == t.getTime()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void printTime() {
		System.out.println(this.month+"/"+this.date+" "+this.time+":00-"+this.getEndTime()+":00");
	}
}
