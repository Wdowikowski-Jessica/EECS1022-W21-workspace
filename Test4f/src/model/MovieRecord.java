package model;

public class MovieRecord {
	private String movieName;
	private int numMovies;
	private Zone z1;
	private static int i = 23;
	private String id;
	private static int n = 1; 
	private int num;
	
	public MovieRecord(String movieName, int numMovies, Zone z1) {
		this.movieName = movieName;
		this.numMovies = numMovies;
		this.z1 = z1;
		this.id = "Zone-" + MovieRecord.i;
		MovieRecord.i += 11;
		this.num = MovieRecord.n;
		MovieRecord.n += 1;
	}

	public String getName() {
		return this.movieName;
	}

	public int getNumberOfDVDs() {
		return this.numMovies;
	}

	public Zone getZone() {
		return this.z1;
	}

	public String getID() {
		return this.id+"-"+this.movieName+"-"+this.num;
	}

}
