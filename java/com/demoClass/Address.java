package com.demoClass;

public class Address  implements Cloneable{
	
	String city;
	
	int pin;

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
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

	@Override
	public String toString() {
		return "Address [city=" + city + ", pin=" + pin + "]";
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public Address(String city, int pin) {
		super();
		this.city = city;
		this.pin = pin;
	}

}
