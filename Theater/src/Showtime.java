
public class Showtime {
	private Movie movie;
	private Time runtime;
	private int theaterID;
	
	public Showtime(Movie m, Time rt, int t) {
		movie = m;
		runtime = rt;
		theaterID = t;
	}
	
	public Movie getMovie() {
		return movie;
	}
	
	public Time getTime() {
		return runtime;
	}
	
	public int getTheater() {
		return theaterID;
	}
}
