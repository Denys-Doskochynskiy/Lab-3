package ua.lviv.iot.test;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ua.lviv.iot.manager.BookstoreManager;
import ua.lviv.iot.model.AbstractBookstore;
import ua.lviv.iot.model.GenreType;;

public class BookstoreManagerTest extends GeneralBookstoreManagerTest {

	public List<AbstractBookstore> result;

	@Test
	public void testFindGoodsCheaperThan() {
		BookstoreManager manager = new BookstoreManager(goods);
		GenreType genreType = GenreType.HORROR;
		result = manager.findGoodsByGenreType(genreType, goods);

		assertEquals(null, goods.get(0).getGenreType());
		assertEquals(null, goods.get(1).getGenreType());
		assertEquals(null, goods.get(2).getGenreType());
		assertEquals(GenreType.HORROR, goods.get(3).getGenreType());

	}

}
