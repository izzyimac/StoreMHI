package DepartmentStore;

import java.awt.Color;



public class Clothing extends Item implements Basic{

public String name;
public double price;
public String brand;
public String type;
public double size;
	
	public Clothing(){
		
	}
	public Clothing(String name, double price, String brand, String type, double size){
		setName(name);
		
	}
	
	public double getSize(){
		return size;
	}
	
	public String getName() {
		return name;
	}

	public String getBrand() {
		return brand;
	}

	public String getType() {
		return type;
	}
	
	public double getPrice(){
		return price;
	}

	public void setName(String name) {
		this.name = name;
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

	public String toString(){
		return "Name: " + getName() + "Brand: " + getBrand() + "Type: "+ getType()+ "Price: "+ getPrice() + "Size: "+ getSize();
	}
	
}
