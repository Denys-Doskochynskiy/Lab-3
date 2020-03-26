package ua.lviv.iot.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import ua.lviv.iot.manager.*;
import ua.lviv.iot.rest.RestAplication.model.*;

class BookstoreUtilsTest extends GeneralBookstoreManagerTest {

	@Test
	public void testSortGoodsByName() {
		BookstoreManagerUtils.sortGoodsByName(goods, SortType.ASCENDING);
		assertEquals("AllIn1", goods.get(0).getName());
		assertEquals("BestRes", goods.get(1).getName());
		assertEquals("Math200", goods.get(2).getName());
		assertEquals("Test", goods.get(3).getName());
	}

	@Test

	public void testSortGoodsByPriceInUAH() {
		BookstoreManagerUtils.sortByPriceInUAH(goods, SortType.ASCENDING);
		assertEquals(28.69, goods.get(0).getPriceInUAH());
		assertEquals(150.55, goods.get(1).getPriceInUAH());
		assertEquals(258.05, goods.get(2).getPriceInUAH());
		assertEquals(1550.65, goods.get(3).getPriceInUAH());
	}

	@Test
	public void testSortGoodsByNuberOfPages() {
		BookstoreManagerUtils.SortByNumberOfPages(goods, SortType.ASCENDING);
		assertEquals(140, goods.get(0).getNumberOfPages());
		assertEquals(256, goods.get(1).getNumberOfPages());
		assertEquals(295, goods.get(2).getNumberOfPages());
		assertEquals(1690, goods.get(3).getNumberOfPages());
	}
	 @Test
	  public void testSortGoodsByGenreType() {
	   BookstoreManagerUtils.sortGoodsByProducer(goods, SortType.ASCENDING);
	    assertEquals("British", goods.get(0).getProducer());
	    assertEquals("MathBest", goods.get(1).getProducer());
	    assertEquals("UATesting100", goods.get(2).getProducer());
	    assertEquals("UaTest", goods.get(3).getProducer());
	  }
	
}
