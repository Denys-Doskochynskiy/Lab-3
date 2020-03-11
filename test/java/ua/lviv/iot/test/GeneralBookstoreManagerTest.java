package ua.lviv.iot.test;

import ua.lviv.iot.model.*;

import org.junit.jupiter.api.BeforeEach;

import java.util.LinkedList;
import java.util.List;

class GeneralBookstoreManagerTest {
	List<AbstractBookstore> goods;

	@BeforeEach
	void setUp() {

		this.goods = new LinkedList<AbstractBookstore>();
		this.goods.add(new GoodsForChildren("100", "UAGame", null, 1, "Ukraine", true, false, 1550.65, true, true));
		this.goods.add(new PreparationForEIT("Test", "UaTest", null, 256, "Ukraine", true, false, 150.55, 2019, true));
		this.goods.add(new Calendar("Calendar", "UACalendar", null, 14, "Ua", true, false, 28.69, 2020, true));
		this.goods.add(new BooksWithAgeRestrictions("It", "Stephan King", GenreType.HORROR, 1138, "English", false,
				true, 258.05, 18, true));
	}

}
