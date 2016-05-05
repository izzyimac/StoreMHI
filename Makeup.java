package project;

public class Makeup extends Item{

	private double price;
	private String brand;
	public String type;
	
	
	public Makeup()
	{
		super();
		//rating = "NONE";
	}
	
	public Makeup(String t)
	{
		super(t);
		//rating = "NONE";
	}
	
	public Makeup(String t, String b)
	{
		super(t, b);
		//rating = "NONE";
	}
	
	public Makeup(String t, String b, double p)
	{
		super(t, b, p);
		//rating = "NONE";
	}
	
	public Makeup(String t, String b, double p, String r)
	{
		super(t, b, p);
		//rating = r;
	}
	
	
	public void setPrice(double p){
		price = p;
	}
	
	public void setBrand(String b){
		brand = b;
	}
	
	public void setType(String t){
		type = t;
	}
	
	public double getPrice(){
		
		return price;	
	}
	
	public String getBrand(){
		
		return brand;
	}
	
	public String getType(){
		
		return type;
	}
	
	public String toString(){
		
		return "Brand: " +brand+ " Type: " +type+ " Price: $"+price;
	}
	
}
