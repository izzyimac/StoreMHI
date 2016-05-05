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
	
	public Item(String t)
	{
		brand = "basicbee";
		type = t;
		price = 0.0;
		//material = "none";
	}
	
	public Item(String t, String b)
	{
		brand = b;
		type = t;
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
	
	
	
	public String getType()
	{
		return type;
	}
	
	public void setType(String t)
	{
		type = t;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double p)
	{
		price = p;
	}
	
	public abstract String getBrand();
	
	
	public abstract void setBrand(String b);
	
	
	//public abstract String getMaterial();
	
	//public abstract void setMaterial(String m);
	
	public String toString()
	{
		String output = "";
		
		output += getType() + " " + getBrand() + " $" + getPrice();
		
		return output;
	}
	
	
	
}
