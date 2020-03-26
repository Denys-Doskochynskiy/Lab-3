package ua.lviv.iot.manager;

import java.util.LinkedList;
import java.util.List;

import ua.lviv.iot.rest.RestAplication.model.GenreType;
import ua.lviv.iot.rest.RestAplication.model.Bookstore;

public class BookstoreManager {

	public List<Bookstore> goods;

	public BookstoreManager(List<Bookstore> goods) {
		this.goods = goods;
	}

	public List<Bookstore> findGoodsByGenreType(GenreType genreType, List<Bookstore> goods) {
		List<Bookstore> result = new LinkedList<>();
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
