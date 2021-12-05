public class Movie {
	private String name;
	private String rating;
	private String genre;
	private int length; // in minutes
	
	public Movie(String name, String rating, String genre, int length) {
		if (name == null) {
            throw new IllegalArgumentException("Movie name cannot be null");
        } 
		if (length < 0) {
            throw new IllegalArgumentException("Movie length cannot be negative");
        }
		this.name = name;
		this.rating = rating;
		this.genre = genre;
		this.length = length;
		
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
