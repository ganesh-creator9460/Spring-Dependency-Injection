package object;

public class Address {

	private int pincode;
	private String cityname;
	
	public Address(int pincode, String cityname) {
		super();
		this.pincode = pincode;
		this.cityname = cityname;
	}

	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", cityname=" + cityname + "]";
	}
}
