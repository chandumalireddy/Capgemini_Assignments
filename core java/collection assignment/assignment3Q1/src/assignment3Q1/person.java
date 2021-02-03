package assignment3Q1;

public class person {
	  private String moviename;
	  private String actorname;
	  private String actressname;
	  private String genre;
	  private int num;
	  public person(String moviename, String actorname, String actressname, String genre,int num) {
			super();
			this.moviename = moviename;
			this.actorname = actorname;
			this.actressname = actressname;
			this.genre = genre;
			this.num=num;
		}
	  
	public String getMoviename() {
		return moviename;
	}
	public String getnum() {
		return num;
	}
	public void setMoviename(String moviename) {
		this.moviename = moviename;
	}
	public String setnum(int num) {
		 this.num=num;
	}
	public String getActorname() {
		return actorname;
	}
	public void setActorname(String actorname) {
		this.actorname = actorname;
	}
	public String getActressname() {
		return actressname;
	}
	public void setActressname(String actressname) {
		this.actressname = actressname;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	

	    