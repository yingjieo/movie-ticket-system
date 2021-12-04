
public class Movie {
	private String name;
	private String rating;
	private String genre;
	private int length; // in minutes
	
	public Movie(String name, String rating, String genre, int length) {
		this.name = name;
		this.rating = rating;
		this.genre = genre;
		this.length = length;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getRating() {
		return this.rating;
	}
	
	public String getGenre() {
		return this.genre;
	}
	
	public int getLength() {
		return this.length;
	}

	public String toString() {
		return name+" "+rating+" "+genre+" "+length;
	}
}

