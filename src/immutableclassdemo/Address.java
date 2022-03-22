package immutableclassdemo;


public class Address {
	
	String country;
	String city;
	int pin;
	
	
	public Address() {
		super();
	}


	public Address(String country, String city, int pin) {
		super();
		this.country = country;
		this.city = city;
		this.pin = pin;
	}


	
	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public int getPin() {
		return pin;
	}


	public void setPin(int pin) {
		this.pin = pin;
	}


	@Override
	public String toString() {
		return "Address [country=" + country + ", city=" + city + ", pin=" + pin + "]";
	}
	
	
	

}
