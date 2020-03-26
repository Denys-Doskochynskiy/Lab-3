package ua.lviv.iot.writer;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;

import ua.lviv.iot.rest.RestAplication.model.*;

public class BookstoreWriter {
	public Writer csvWriter = new StringWriter();

	public Writer getCsvWriter() {
		return csvWriter;
	}

	public void setCsvWriter(Writer csvWriter) {
		this.csvWriter = csvWriter;
	}
/*
	public void writeToFile(List<Bookstore> listOfGoods) throws IOException {
		csvWriter.write(listOfGoods.get(0).getHeaders());
		csvWriter.write("\n");
		for (Bookstore goods : listOfGoods) {
			csvWriter.write(goods.toCSV());
			csvWriter.write("\n");
		}
		csvWriter.flush();
	}
*/

}