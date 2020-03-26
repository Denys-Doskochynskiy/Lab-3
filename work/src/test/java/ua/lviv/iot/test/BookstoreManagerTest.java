package ua.lviv.iot.test;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import ua.lviv.iot.manager.BookstoreManager;
import ua.lviv.iot.rest.RestAplication.model.GenreType;
import ua.lviv.iot.rest.RestAplication.model.Bookstore;;

public class BookstoreManagerTest extends GeneralBookstoreManagerTest {

	public List<Bookstore> result;

	@Test
	public void testFindGoodsCheaperThan() {
		BookstoreManager manager = new BookstoreManager(goods);
		GenreType genreType = GenreType.HORROR;
		result = manager.findGoodsByGenreType(genreType, goods);

		assertEquals(GenreType.HORROR, goods.get(0).getGenreType());
		assertEquals(GenreType.DRAMA, goods.get(1).getGenreType());
		assertEquals(GenreType.TALE, goods.get(2).getGenreType());
		assertEquals(GenreType.CRIME, goods.get(3).getGenreType());

	}

}
