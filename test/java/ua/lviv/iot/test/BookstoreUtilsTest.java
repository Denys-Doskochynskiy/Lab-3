package ua.lviv.iot.test;

import static org.junit.jupiter.api.Assertions.*;
import ua.lviv.iot.manager.*;
import ua.lviv.iot.model.*;
import org.junit.jupiter.api.Test;

class BookstoreUtilsTest extends GeneralBookstoreManagerTest {

	@Test
	public void testSortGoodsByPrice_ASCENDING() {
		BookstoreManagerUtils.sortGoodsByPriceInUAH_ASCENDING(goods, SortType.ASCENDING);
		assertEquals(1550.65, goods.get(0).getPriceInUAH());
		assertEquals(150.55, goods.get(1).getPriceInUAH());
		assertEquals(28.69, goods.get(2).getPriceInUAH());
		assertEquals(258.05, goods.get(3).getPriceInUAH());
	}

	@Test
	public void testSortGoodsByPrice_DESCENDING() {
		BookstoreManagerUtils.sortGoodsByPriceInUAH_DESCENDING(goods, SortType.DESCENDING);
		assertEquals(1550.65, goods.get(0).getPriceInUAH());
		assertEquals(150.55, goods.get(1).getPriceInUAH());
		assertEquals(28.69, goods.get(2).getPriceInUAH());
		assertEquals(258.05, goods.get(3).getPriceInUAH());
	}
}
