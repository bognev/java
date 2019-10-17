package unl.cse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AiroportDemo {
	public static void main(String args[]) {
		Airport lincoln = new Airport("Lincoln Municipal Airport", "LNK", 40.8507, -96.7581);
		Airport omaha = new Airport("Eppley Airport", "OMA", 41.619, -94.640);
		Airport ohare = new Airport("O'Hare Airport", "ORD", 40.456, -87.564);
		System.out.println(lincoln.getCode());
		System.out.println(omaha.getCode());
		System.out.println(ohare.getCode());
		List<Airport> airports = new ArrayList<Airport>();
		airports.add(lincoln);
		airports.add(omaha);
		airports.add(ohare);
		Comparator<Airport> cmpByName = new Comparator<Airport>() {

			@Override
			public int compare(Airport a, Airport b) {
				return -a.getName().compareTo(b.getName());
			}

		};
		System.out.println("-----------------------");
		Collections.sort(airports, cmpByName);
		for (Airport a : airports) {
			System.out.println(a);
		}
		double rad = DistanceUtils.getAirDistance(omaha, lincoln);
		System.out.println(rad);
		System.out.println(lincoln.getAirDustance(omaha));

	}

}
