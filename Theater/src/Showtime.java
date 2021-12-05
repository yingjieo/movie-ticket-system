
public class Showtime {
	private Movie movie;
	private Time runtime;

	
	public Showtime(Movie movie, Time runtime) {
		this.movie = movie;
		this.runtime = runtime;
	}
	
	public Movie getMovie() {
		return this.movie;
	}
	
	public Time getTime() {
		return this.runtime;
	}
	
	void printShowTime() {
		System.out.println(movie.getName());
		System.out.println(runtime.toString());
	}
}
