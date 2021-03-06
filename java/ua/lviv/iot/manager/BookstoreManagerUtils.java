package ua.lviv.iot.manager;

import ua.lviv.iot.model.SortType;
import ua.lviv.iot.model.AbstractBookstore;

import java.io.Serializable;
import java.util.Comparator;
import java.util.List;



public class BookstoreManagerUtils {


//Sort with anonym class//////////////////////////////////////////////////////////////////////
	public static void sortGoodsByName(List<AbstractBookstore> goods, SortType sortType) {
		Comparator<AbstractBookstore> comparator = new Comparator<AbstractBookstore>() {
			@Override
			public int compare(AbstractBookstore firstItem, AbstractBookstore secondItem) {
				return firstItem.getName().compareTo(secondItem.getName());
			}
		};
		goods.sort(sortType == SortType.ASCENDING ? comparator : comparator.reversed());
	}

	/////////////////////////////////////////////////////////////////////////////////////////
//Static inner class
	static class GoodsByNumberOfPages implements Comparator<AbstractBookstore>, Serializable {
		/**
				 * 
				 */
		private static final long serialVersionUID = 1L;

		@Override
		public int compare(AbstractBookstore firstGood, AbstractBookstore secondGood) {
			return firstGood.getNumberOfPages() - secondGood.getNumberOfPages();
		}
	}

	private static final GoodsByNumberOfPages GOODS_SORTER_BY_OF_PAGES = new GoodsByNumberOfPages();

//sort using static inner class
	public static void SortByNumberOfPages(List<AbstractBookstore> goods, SortType sortType) {
		goods.sort(sortType == SortType.ASCENDING ? GOODS_SORTER_BY_OF_PAGES : GOODS_SORTER_BY_OF_PAGES.reversed());
	}

//inner class
	class SortGoodsByPriceInUAH implements Comparator<AbstractBookstore> {
		@Override
		public int compare(AbstractBookstore firstGood, AbstractBookstore secondGood) {
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
	public static void sortByPriceInUAH(List<AbstractBookstore> goods, SortType sortType) {
		BookstoreManagerUtils manager = new BookstoreManagerUtils();
		SortGoodsByPriceInUAH sortGoodsByPriceInUAH = manager.new SortGoodsByPriceInUAH();
		goods.sort(sortType == SortType.ASCENDING ? sortGoodsByPriceInUAH : sortGoodsByPriceInUAH.reversed());
	}

}
