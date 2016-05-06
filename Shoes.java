package project;

import java.awt.Color;

public class Shoes {

	public double price;
	public String brand;
	public String type;
	public double size;

	public Shoes() {

	}
	public Shoes (String type, String brand, double price){
	this.type = type;
	this.brand = brand;
	this.price = price;
	}
	public Shoes(double p, String b, String t,
			double s) {
		price = p;
		brand = b;
		type = t;
		size = s;
	}

	public double getSize() {
		return size;
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}

	public double getPrice() {
		return price;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public void setSize(double size) {
		this.size = size;
	}

	public String toString() {
		return " Brand: " + getBrand() + "Type: "
				+ getType() + "Price: " + getPrice() + "Size: " + getSize();
	}

}
