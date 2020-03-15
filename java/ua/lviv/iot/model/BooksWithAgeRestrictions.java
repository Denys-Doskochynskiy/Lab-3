package ua.lviv.iot.model;

public class BooksWithAgeRestrictions extends AbstractBookstore {

	private int ageRestrictons;
	private boolean foulLanguage;

	public BooksWithAgeRestrictions(String name, String producer, GenreType genreType, int numberOfPages,
			String textLanguage, boolean newCondition, boolean hardCover, double priceInUAH, int ageRestrictons,
			boolean foulLanguage) {
		super(name, producer, genreType, numberOfPages, textLanguage, newCondition, hardCover, priceInUAH);

		this.ageRestrictons = ageRestrictons;
		this.foulLanguage = foulLanguage;
	}

	public boolean getFoulLanguage() {
		return foulLanguage;
	}

	public void setFoulLanguage(boolean foulLanguage) {
		this.foulLanguage = foulLanguage;
	}

	public int getAgeRestrictons() {
		return ageRestrictons;
	}

	public void setAgeRestrictons(int ageRestrictons) {
		this.ageRestrictons = ageRestrictons;
	}
	 public String getHeaders() { return super.getHeaders() + "," +
	  "ageRestrictions"+","+"foulLanguage"; }
	  
	  public String toCSV() { return super.toCSV() + "," +
	  getAgeRestrictons()+","+getFoulLanguage()+"\n"; }
}
