
public class Showtime {
	private Movie movie;
	private Time runtime;
	private int theaterID;
	
	public Showtime(Movie movie, Time runtime, int theaterID) {
		this.movie = movie;
		this.runtime = runtime;
		this.theaterID = theaterID;
	}
	
	public Movie getMovie() {
		return this.movie;
	}
	
	public Time getTime() {
		return this.runtime;
	}
	
	public int getTheater() {
		return this.theaterID;
	}

	public String toString() {
		return movie+" "+runtime+" "+theaterID;
	}
}
