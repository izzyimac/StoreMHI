package DepartmentStore;

public class Makeup implements Basic{

	private double price;
	private String brand;
	public String type;
	
	
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
		
		return "Brand: " +brand+ " Type: " +type+ "Price: "+price;
	}
	
}
