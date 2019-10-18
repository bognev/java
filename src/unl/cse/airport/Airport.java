package unl.cse.airport;

public class Airport {

	private String name;
	private String code;
	private double latitude;
	private double longtitude;

	public Airport(String name, String code, double latitude, double longtitude) {
		super();
		this.name = name;
		this.code = code;
		this.latitude = latitude;
		this.longtitude = longtitude;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCode() {
		return code;
	}

	@Override
	public String toString() {
		return "Airport [name=" + name + ", code=" + code + ", latitude=" + latitude + ", longtitude=" + longtitude
				+ "]";
	}

	public void setCode(String code) {
		this.code = code;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongtitude() {
		return longtitude;
	}

	public void setLongtitude(double longtitude) {
		this.longtitude = longtitude;
	}

	public double getAirDustance(Airport that) {
		return DistanceUtils.getAirDistance(this, that);
	}

}
