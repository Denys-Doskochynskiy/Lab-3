package ua.lviv.iot.manager;

import java.util.LinkedList;
import java.util.List;
import ua.lviv.iot.model.AbstractBookstore;

public class BookstoreManager {

	public List<AbstractBookstore> goods;

	public BookstoreManager(List<AbstractBookstore> goods) {
		this.goods = goods;
	}

	public List<AbstractBookstore> findGoodsCheaperThan(double price, List<AbstractBookstore> goods) {
		List<AbstractBookstore> result = new LinkedList<>();
		for (int goodFromTheList = 0; goodFromTheList < goods.size(); goodFromTheList++) {
			if (goods.get(goodFromTheList).getPriceInUAH() < price) {
				result.add(goods.get(goodFromTheList));
				System.out.println("#" + (goodFromTheList + 1) + " matching the criteria" + " with price "
						+ goods.get(goodFromTheList).getPriceInUAH());
			} else {
				System.out.println(" #" + (goodFromTheList + 1) + " does not match the criteria");
			}
		}
		return result;
	}

}