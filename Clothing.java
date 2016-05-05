package project;

public class Clothing extends Item{
	
	//public String name;
	public double price;
	public String brand;
	public String type;
	public double size;
		
	public Clothing()
	{
		super();
	}
	
	public Clothing(String type, String brand, double price, double size)
	{
		super(type, brand, price);
		setSize(size);
		
	}
	
	public double getSize(){
		return size;
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
		return "Brand: " + getBrand() + " Type: "+ getType()+ " Price: $"+ getPrice() + " Size: "+ getSize();
	}
	
}


