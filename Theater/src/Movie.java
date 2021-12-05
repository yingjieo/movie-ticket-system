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
	
	public void printMovie() {
		System.out.println(name);
		System.out.println("Rating: " + rating);
		System.out.println("Genre: " + genre);
		System.out.println("Runtime: " + length + " min");
	}

}
