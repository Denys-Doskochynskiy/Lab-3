package ua.lviv.iot.test;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ua.lviv.iot.manager.BookstoreManager;
import ua.lviv.iot.model.AbstractBookstore;;

public class BookstoreManagerTest extends GeneralBookstoreManagerTest {

	public List<AbstractBookstore> result;

	@Test
	public void testFindGoodsCheaperThan() {
		BookstoreManager manager = new BookstoreManager(goods);
		double price = 300;
		result = manager.findGoodsCheaperThan(price, goods);

		assertEquals(1550.65, goods.get(0).getPriceInUAH());
		assertEquals(150.55, goods.get(1).getPriceInUAH());
		assertEquals(28.69, goods.get(2).getPriceInUAH());
		assertEquals(258.05, goods.get(3).getPriceInUAH());

	}

}