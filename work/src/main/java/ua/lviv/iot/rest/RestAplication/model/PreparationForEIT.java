package ua.lviv.iot.rest.RestAplication.model;

public class PreparationForEIT extends Bookstore {
	private int yearOfEIT;
	private boolean availabilityOfSolutionsTask;

	public PreparationForEIT(String name, String producer, GenreType genreType, int numberOfPages, String textLanguage,
			boolean newCondition, boolean hardCover, double priceInUAH, int yearOfEIT,
			boolean availabilityOfSolutionsTask) {
		super(name, producer, genreType, numberOfPages, textLanguage, newCondition, hardCover, priceInUAH);
		this.yearOfEIT = yearOfEIT;
		this.availabilityOfSolutionsTask = availabilityOfSolutionsTask;
	}

	public int getYearOfEIT() {
		return yearOfEIT;
	}

	public void setYearOfEIT(int yearOfEIT) {
		this.yearOfEIT = yearOfEIT;
	}

	public boolean isAvailabilityOfSolutionsTask() {
		return availabilityOfSolutionsTask;
	}

	public void setAvailabilityOfSolutionsTask(boolean availabilityOfSolutionsTask) {
		this.availabilityOfSolutionsTask = availabilityOfSolutionsTask;
	}
/*
	public String getHeaders() {
		return super.getHeaders() + "," + "yearOfEIT" + "," + "availabilityOfSolutionsTask";
	}

	public String toCSV() {
		return super.toCSV() + "," + getYearOfEIT() + "," + isAvailabilityOfSolutionsTask() + "\n";
	}*/

}
