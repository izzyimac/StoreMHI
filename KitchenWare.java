package project;

public class KitchenWare extends Item{

	private double price;
	private String brand;
	public String type;
	public String rating;
	
	public KitchenWare()
	{
		//super();
		//rating = "NONE";
	}
	
	public KitchenWare(String t)
	{
		type = t;
		rating = "NONE";
	}
	
	public KitchenWare(String t, String b)
	{
		type = t;
		brand = b;
		rating = "NONE";
	}
	
	public KitchenWare(String t, String b, double p)
	{
		type = t;
		brand = b;
		price = p;		
		rating = "NONE";
	}
	
	public KitchenWare(String t, String b, double p, String r)
	{
		type = t;
		brand = b;
		price = p;
		rating = r;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String t) {
		type = t;
	}

	
	public double getPrice() {
		return price;
	}

	
	public void setPrice(double p) {
		price = p;
	}

	public String getBrand() {
		return brand;
	}

	
	public void setBrand(String b) {
		brand = b;
	}
	
	public void setRating(String r){
		rating = r;
	}
	
	public int getRating(){
		int value = 0;
		if (rating.equals("five")){
			value  = 5;
		} else if (rating.equals("four")){
			value = 4;
		} else if (rating.equals("three")){
			value = 3;
		} else if (rating.equals("two")){
			value = 2;
		} else 
			value = 1;
		
		
		return value ; 
	}

	public String toString(){
		
		return "Brand: " +brand+ " Type: " +type+ " Price: $"+price+ " Rating: " +rating;
		
	}
	
}
