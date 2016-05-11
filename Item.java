package project;

public abstract class Item implements Basic {
	

	private String type;
	private String brand;
	private double price;
	//private String material;
	
	public Item()
	{
		brand = "basicbee";
		type = "none";
		price = 0.0;
		//material = "none";
	}
	

	public Item(String t, String b, double p)
	{
		brand = b;
		type = t;
		price = p;
		//material = "none";
	}
	
	
	
	public abstract String getType();
	
	public abstract void setType(String t);
	
	public abstract double getPrice();
	
	public abstract void setPrice(double p);
	
	public abstract String getBrand();
	
	public abstract void setBrand(String b);
	
	
	//public abstract int getRating();
	
	//public abstract void setRating(String r);
	
	
	//public abstract String getMaterial();
	
	//public abstract void setMaterial(String m);
	
	public String toString()
	{
		String output = "";
		
		output += getType() + " " + getBrand() + " $" + getPrice();
		
		return output;
	}
	
	
	
}
