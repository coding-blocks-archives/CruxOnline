package Lecture14.GenericsDemo.GenericFxn;

import java.util.Comparator;

/**
 * @author Garima Chhikara
 * @email garima.chhikara@codingblocks.com
 */

public class CarPriceComparator implements Comparator<Car> {

	@Override
	public int compare(Car tcar, Car ocar) {
		return ocar.price - tcar.price;
	}

}
