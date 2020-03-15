package ua.lviv.iot.writer;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;
import ua.lviv.iot.model.*;

public class BookstoreWriter {
	public Writer csvWriter = new StringWriter();

	public Writer getCsvWriter() {
		return csvWriter;
	}

	public void setCsvWriter(Writer csvWriter) {
		this.csvWriter = csvWriter;
	}

	public void writeToFile(List<AbstractBookstore> listOfGoods) throws IOException {
		csvWriter.write(listOfGoods.get(0).getHeaders());
		csvWriter.write("\n");
		for (AbstractBookstore goods : listOfGoods) {
			csvWriter.write(goods.toCSV());
			csvWriter.write("\n");
		}
		csvWriter.flush();
	}

	@Override
	public String toString() {
		return csvWriter.toString();
	}
}