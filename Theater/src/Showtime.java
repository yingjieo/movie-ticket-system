
public class Showtime {
	private Movie movie;
	private Time runtime;
	//private int theaterID;
	
	public Showtime(Movie movie, Time runtime) {
		this.movie = movie;
		this.runtime = runtime;
	}
	
	public Movie getMovie() {
		return movie;
	}
	
	public Time getTime() {
		return runtime;
	}
	
	public void printShowtime() {
		System.out.println(movie.getName());
		runtime.printTime();
	}
	
}
