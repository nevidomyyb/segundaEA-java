package entities;

public class Movie {

	private String name;
	private String director;
	private String description;
	private String genrer;
	private String duration;
	
	public Movie (String name, String director, String description, String genrer, String duration) {
		this.name = name;
		this.director = director;
		this.description = description;
		this.genrer = genrer;
		this.duration = duration;
	}

	public String toStrign() {
		return this.name;
	}
	
}
