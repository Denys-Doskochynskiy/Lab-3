package ua.lviv.iot.test;

import org.junit.jupiter.api.BeforeEach;

import ua.lviv.iot.rest.RestAplication.model.*;

import java.util.LinkedList;
import java.util.List;

public class GeneralBookstoreManagerTest {
	protected List<Bookstore> goods;

	@BeforeEach
	void setUp() {

		this.goods = new LinkedList<Bookstore>();
		this.goods.add(new PreparationForEIT("AllIn1", "UATesting100", GenreType.HORROR, 1690, "Ukraine", true, false, 1550.65,
				2018, true));
		this.goods.add(new PreparationForEIT("Test", "UaTest", GenreType.DRAMA, 256, "Ukraine", true, false, 150.55, 2019, true));
		this.goods.add(new PreparationForEIT("BestRes", "MathBest", GenreType.TALE, 140, "Ua", true, false, 28.69, 2020, false));
		this.goods.add(
				new PreparationForEIT("Math200", "British", GenreType.CRIME, 295, "English", false, true, 258.05, 2015, true));
	}

}
