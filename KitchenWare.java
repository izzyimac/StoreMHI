package DepartmentStore;

public class KitchenWare implements Basic{

	private double price;
	private String brand;
	public String type;
	public String rating;
	
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
	
	public void setRatings(String r){
		rating = r;
	}
	
	public int getRatings(){
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
		
		return "Brand: " +brand+ " Type: " +type+ "Price: "+price+ "Rating: " +rating;
		
	}
	
}
