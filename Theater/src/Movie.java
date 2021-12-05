public class Movie {
	private String name;
	private String rating;
	private String genre;
	private int length; // in minutes
	
	public Movie(String n, String r, String g, int l) {
		name = n;
		rating = r;
		genre = g;
		length = l;
		
	}
	
	public String getName() {
		return name;
	}
	
	public String getRating() {
		return rating;
	}
	
	public String getGenre() {
		return genre;
	}
	
	public int getLength() {
		return length;
	}

}
