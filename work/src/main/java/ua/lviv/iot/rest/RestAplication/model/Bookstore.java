package ua.lviv.iot.rest.RestAplication.model;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity.BodyBuilder;
import org.springframework.http.ResponseEntity.HeadersBuilder;
public class Bookstore {
	private String name;
	private String producer;
	private GenreType genreType;
	private int numberOfPages;
	private String textLanguage;
	private boolean newCondition;
	private boolean hardCover;
	protected double priceInUAH;	
	public Integer id;


	public boolean isHardCover() {
		return hardCover;
	}


	public void setHardCover(boolean hardCover) {
		this.hardCover = hardCover;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public Bookstore(String name, String producer, GenreType genreType, int numberOfPages, String textLanguage,
			boolean newCondition, boolean hardCover, double priceInUAH) {
		super();
		this.name = name;
		this.producer = producer;
		this.genreType = genreType;
		this.numberOfPages = numberOfPages;
		this.textLanguage = textLanguage;
		this.newCondition = newCondition;
		this.hardCover = hardCover;
		this.priceInUAH = priceInUAH;

	}
	public Bookstore() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public GenreType getGenreType() {
		return genreType;
	}

	public void setGenreType(GenreType genreType) {
		this.genreType = genreType;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public String getTextLanguage() {
		return textLanguage;
	}

	public void setTextLanguage(String textLanguage) {
		this.textLanguage = textLanguage;
	}

	public boolean isNewCondition() {
		return newCondition;
	}

	public void setNewCondition(boolean newCondition) {
		this.newCondition = newCondition;
	}

	public boolean isNardCover() {
		return hardCover;
	}

	public void setNardCover(boolean nardCover) {
		this.hardCover = nardCover;
	}

	public double getPriceInUAH() {
		return priceInUAH;
	}

	public void setPriceInUAH(double priceInUAH) {
		this.priceInUAH = priceInUAH;
	}
/*
	public String getHeaders() {
		return "name" + "," + " producer" + "," + "genreType" + "," + "numberOfPages" + "," + "textLanguage" + ","
				+ "newCondition " + "," + " hardCover" + "," + "priceInUAH";}
	

	public String toCSV() {
		return getName() + "," + getProducer() + "," + getGenreType() + "," + getNumberOfPages() + ","
				+ getTextLanguage() + "," + isNewCondition() + "," + isNardCover() + "," + getPriceInUAH();
	}
*/
}
