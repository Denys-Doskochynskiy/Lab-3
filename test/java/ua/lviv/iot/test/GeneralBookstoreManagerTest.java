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
		this.goods.add(new PreparationForEIT("AllIn1", "UATesting100", null, 1690, "Ukraine", true, false, 1550.65, 2018, true));
		this.goods.add(new PreparationForEIT("Test", "UaTest", null, 256, "Ukraine", true, false, 150.55, 2019, true));
		this.goods.add(new PreparationForEIT("BestRes", "MathBest", null, 140, "Ua", true, false, 28.69, 2020, false));
		this.goods.add(new PreparationForEIT("Math200", "British", null, 295, "English", false,
				true, 258.05, 2015, true));

	}

}
