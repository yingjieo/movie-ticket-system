
public class Showtime {
	private Movie movie;
	private Time runtime;
	private Theater theater;
	
	public Showtime(Movie m, Time rt, Theater t) {
		movie = m;
		runtime = rt;
		theater = t;
	}
	
	public Movie getMovie() {
		return movie;
	}
	
	public Time getTime() {
		return runtime;
	}
	
	public Theater getTheater() {
		return theater;
	}
}
