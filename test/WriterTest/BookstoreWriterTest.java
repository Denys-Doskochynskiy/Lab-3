package ua.lviv.iot.WriterTest;

//import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.FileWriter;
import java.io.IOException;
//import java.io.StringWriter;
import java.io.Writer;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.test.*;
//import ua.lviv.iot.model.*;
import ua.lviv.iot.writer.*;;

public class BookstoreWriterTest extends GeneralBookstoreManagerTest {
	BookstoreWriter bookstoreWriter = new BookstoreWriter();

	@Test
	void writeToFileTest() throws IOException {
		Writer csvWriter = new FileWriter("BookstoreWriter.csv");
		bookstoreWriter.setCsvWriter(csvWriter);
		bookstoreWriter.writeToFile(goods);
	}

}

/*
 * @Test void stringWriterTest() throws IOException { StringBuilder expected =
 * new StringBuilder(); bookstoreWriter.setCsvWriter(new StringWriter());
 * bookstoreWriter.writeToFile(goods);
 * expected.append(goods.get(0).getHeaders()); expected.append("\n"); for
 * (AbstractBookstore listOfGoods : goods) {
 * expected.append(listOfGoods.toCSV()); expected.append("\n"); }
 * assertEquals(expected.toString(), bookstoreWriter.toString());
 * 
 * }
 */