package model;

public class Zone {
	private int numMovies;
	private static int i = 23;
	private String id;
	private int nomr;
	private int nomd;
	private String movieAndNum ="";
	
	public Zone(int movies) {
		this.numMovies = movies;
		this.id = "Zone-" + Zone.i;
		Zone.i += 11;
	}

	public String getID() {
		return this.id;
	}

	public int getNumberOfMovieRecords() {
		return this.nomr;
	}
	

	public int getNumberOfMovieDVDs() {
		return this.nomd;
	}
	
	public String getStatus() {
		String result = "";
		if (this.nomr != 0 && this.nomd != 0 && this.nomd <= 10) {
			return this.nomr + " records and " + this.nomd + " DVDs: {" + this.movieAndNum + "}";
		} else if (this.nomd > 10) {
			result = "Error: maximum number of movie DVDs (10) reached";
			this.nomr --;
			this.nomd --;
		} else {
			result = this.nomr + " records and " + this.nomd + " DVDs: {}";
		}
		return result;
	}
	
	public void addMovieRecord(MovieRecord r1) {
		if (this.nomr >= 1) {
			this.movieAndNum += ", ";
		}
		this.movieAndNum += r1.getName() + " (" + r1.getNumberOfDVDs() + ")";
		this.nomr ++;
		this.nomd += r1.getNumberOfDVDs();
	}

}
