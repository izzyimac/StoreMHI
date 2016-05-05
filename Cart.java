package DepartmentStore;

public class Cart {

	Cart[] product; 
	//should receive array of products using different types
	
	public void setArray(Cart[] items){
		product = items;
	}
	
	
	public double getTotalPrice(){
		
		double sum = 0.0;
		
		for (int i = 0; i < product.length ; i++){
			sum += product[i].getPrice();  // calls get price method for each object in cart
		}
		
		return sum;
	}
	
	public String getNames(){
		
		String name = "";
		
		for (int i = 0; i < product.length ; i++){
			name += "/n" +product[i].getType();  // calls get price method for each object in cart
		}
		
		return name;
	}
	
	public double getTaxes(){
		
		double salesTax = product.length*.08;
		
		return salesTax;
	}
	
	public double getShipping(){
		if (product.getTotalPrice() > 50.00){
			
		}
	}
	
	
}
