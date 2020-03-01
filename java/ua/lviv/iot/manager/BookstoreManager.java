package ua.lviv.iot.manager;

import java.util.LinkedList;
import java.util.List;
import ua.lviv.iot.model.AbstractBookstore;
import ua.lviv.iot.model.GenreType;

public class BookstoreManager {

	public List<AbstractBookstore> goods;

	public BookstoreManager(List<AbstractBookstore> goods) {
		this.goods = goods;
	}

	public List<AbstractBookstore> findGoodsCheaperThan(GenreType genreType, List<AbstractBookstore> goods) {
		List<AbstractBookstore> result = new LinkedList<>();
		for (int goodFromTheList = 0; goodFromTheList < goods.size(); goodFromTheList++) {
			if (goods.get(goodFromTheList).getGenreType() == genreType) {
				result.add(goods.get(goodFromTheList));
				System.out.println("#" + (goodFromTheList + 1) + " matching the criteria" + " with price "
						+ goods.get(goodFromTheList).getGenreType());
			} else {
				System.out.println(" #" + (goodFromTheList + 1) + " does not match the criteria");
			}
		}
		return result;
	}

}
