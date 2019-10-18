package unl.cse.airport;

public class DistanceUtils {
	public static final double EARTH_RADIUS = 6371;

	public static double radiansToDegrees(double radians) {
		return radians / Math.PI * 180.0;
	}

	public static double degreesToRadians(double degree) {
		return (degree / 180.0) * Math.PI;
	}

//	public static double getAirDistance(double latA, double longA,
//										double latB, double longB) {
//		double latitudeA = DistanceUtils.degreesToRadians(latA);
//		double longtitudeA = DistanceUtils.degreesToRadians(longA);
//		double latitudeB = DistanceUtils.degreesToRadians(longB);
//		double longtitudeB = DistanceUtils.degreesToRadians(longB);
//		return Math.acos(Math.sin(latitudeA)*Math.sin(latitudeB) + Math.cos(latitudeA)*Math.cos(latitudeB)
//				*Math.cos(longtitudeB-longtitudeA));
//	}
	public static double getAirDistance(Airport a, Airport b) {
		double latitudeA = DistanceUtils.degreesToRadians(a.getLatitude()),
				longtitudeA = DistanceUtils.degreesToRadians(a.getLongtitude()),
				latitudeB = DistanceUtils.degreesToRadians(b.getLatitude()),
				longtitudeB = DistanceUtils.degreesToRadians(b.getLongtitude());
		return Math
				.acos(Math.sin(latitudeA) * Math.sin(latitudeB)
						+ Math.cos(latitudeA) * Math.cos(latitudeB) * Math.cos(longtitudeB - longtitudeA))
				* EARTH_RADIUS;
	}

}
