package ua.lviv.iot.manager;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;

import ua.lviv.iot.rest.RestAplication.model.SortType;
import ua.lviv.iot.rest.RestAplication.model.Bookstore;

public class BookstoreManagerUtils {

//Sort with anonym class//////////////////////////////////////////////////////////////////////
	public static void sortGoodsByName(List<Bookstore> goods, SortType sortType) {
		Comparator<Bookstore> comparator = new Comparator<Bookstore>() {
			@Override
			public int compare(Bookstore firstItem, Bookstore secondItem) {
				return firstItem.getName().compareTo(secondItem.getName());
			}
		};
		goods.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
	}

	/////////////////////////////////////////////////////////////////////////////////////////
//Static inner class
	static class GoodsByNumberOfPages implements Comparator<Bookstore>, Serializable {

		private static final long serialVersionUID = 1L;

		@Override
		public int compare(Bookstore firstGood, Bookstore secondGood) {
			return firstGood.getNumberOfPages() - secondGood.getNumberOfPages();
		}
	}

	private static final GoodsByNumberOfPages GOODS_SORTER_BY_OF_PAGES = new GoodsByNumberOfPages();

//sort using static inner class
	public static void SortByNumberOfPages(List<Bookstore> goods, SortType sortType) {
		goods.sort(sortType == SortType.ASCENDING ? GOODS_SORTER_BY_OF_PAGES : GOODS_SORTER_BY_OF_PAGES.reversed());
	}

//inner class
	class SortGoodsByPriceInUAH implements Comparator<Bookstore> {
		@Override
		public int compare(Bookstore firstGood, Bookstore secondGood) {
			if (Double.compare(firstGood.getPriceInUAH(), secondGood.getPriceInUAH()) < 0) {
				return -1;
			}
			if (Double.compare(firstGood.getPriceInUAH(), secondGood.getPriceInUAH()) > 0) {
				return 1;
			}
			return 0;
		}
	}

//sort using inner class
	public static void sortByPriceInUAH(List<Bookstore> goods, SortType sortType) {
		BookstoreManagerUtils manager = new BookstoreManagerUtils();
		SortGoodsByPriceInUAH sortGoodsByPriceInUAH = manager.new SortGoodsByPriceInUAH();
		goods.sort(sortType == SortType.ASCENDING ? sortGoodsByPriceInUAH : sortGoodsByPriceInUAH.reversed());
	}
	//лямбда вираз
	  public static void sortGoodsByProducer(List<Bookstore> goods, SortType sortType) {
		    Comparator<Bookstore> comparator =
		        (firstGood, secondGood) -> firstGood.getProducer().compareTo(secondGood.getProducer());
		    goods.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
		  }

}
