package ua.lviv.iot.model;

public class Calendar extends AbstractBookstore {
	private boolean leakyCalendar;
	private int year;

	public Calendar(String name, String producer, GenreType genreType, int numberOfPages, String textLanguage,
			boolean newCondition, boolean hardCover, double priceInUAH, int year, boolean leakyCalendar) {
		super(name, producer, genreType, numberOfPages, textLanguage, newCondition, hardCover, priceInUAH);

		this.leakyCalendar = leakyCalendar;
		this.year = year;
	}

	public boolean getLeakyCalendar() {
		return leakyCalendar;
	}

	public void setLeakyCalendar(boolean leakyCalendar) {
		this.leakyCalendar = leakyCalendar;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	 public String getHeaders() { return super.getHeaders() + "," +
	  "leakyCalendar"+ "," + "year"; }
	  
	  public String toCSV() { return super.toCSV() + "," +
	  getLeakyCalendar()+","+getYear()+"\n"; }
}
