package project;

public class Clothing extends Item implements Basic{
	
	//public String name;
	public double price;
	public String brand;
	public String type;
	public int size;
		
	public Clothing()
	{
		//super();
	}
	
	public Clothing(String type, String brand, double price, int size)
	{
		super(type, brand, price);
		setSize(size);
		
	}
	
	public Clothing(String type, String brand, double price) {
		//super(type, brand, price);
		setType(type);
		setBrand(brand);
		setPrice(price);
	}

	public int getSize(){
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

	public void setSize(int size) {
		this.size = size;
	}

	public String toString(){
		return "Brand: " + getBrand() + " Type: "+ getType()+ " Price: $"+ getPrice() + " Size: "+ getSize();
	}
	
}


