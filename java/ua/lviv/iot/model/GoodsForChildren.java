package ua.lviv.iot.model;

public class GoodsForChildren extends AbstractBookstore {
	private boolean availabilityOfColringBooks;
	private boolean educationalToys;

	public GoodsForChildren(String name, String producer, GenreType genreType, int numberOfPages, String textLanguage,
			boolean newCondition, boolean hardCover, double priceInUAH, boolean educationalToys,
			boolean availabilityOfColringBooks) {
		super(name, producer, genreType, numberOfPages, textLanguage, newCondition, hardCover, priceInUAH);
		this.educationalToys = educationalToys;
		this.availabilityOfColringBooks = availabilityOfColringBooks;
	}

	public boolean getAvailabilityOfColringBooks() {
		return availabilityOfColringBooks;
	}

	public void setAvailabilityOfColringBooks(boolean availabilityOfColringBooks) {
		this.availabilityOfColringBooks = availabilityOfColringBooks;
	}

	public boolean getEducationalToys() {
		return educationalToys;
	}

	public void setEducationalToys(boolean educationalToys) {
		this.educationalToys = educationalToys;
	}
}