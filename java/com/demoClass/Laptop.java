package com.demoClass;

public class Laptop

{

	public String name;

	public int price;

	public int ram;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Laptop [name=" + name + ", price=" + price + ", ram=" + ram + "]";
	}

	public Laptop() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Laptop(String name, int price, int ram) {
		super();
		this.name = name;
		this.price = price;
		this.ram = ram;
	}

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

//	@Override
//	public int compareTo(Laptop lap1) {
//
//		if (this.getPrice() > lap1.getPrice()) {
//
//			return 1;
//		} else
//
//			return -1;
//	}

}
