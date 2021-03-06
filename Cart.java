package project;

public class Cart{

	Item[] product; 
	//should receive array of products using different types
	
	public void setArray(Item[] items){
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
			name += "\n" +product[i].getType();  // calls get price method for each object in cart
		}
		
		return name;
	}
	
	public double getTaxes(){
		
		double salesTax = getTotalPrice()*.08;
		
		return salesTax;
	}
	
	
	public double getShipping(){
		
		if (getTotalPrice() > 50.00){
			return 0.0;
		} else
			return 10.0;
	}
	
	
	
	public String toString(){
		String str = "Price of Goods: $"+ Math.round(getTotalPrice()*100.0)/100.0 + "\nNames of Products: "+getNames()+ "\nTaxes: $" 
				+ Math.round(getTaxes()*100.0)/100.0 + " Shipping: $" +getShipping()+ 
				"\n\nTotal Price: $" + Math.round((getTotalPrice() + getTaxes() + getShipping())*100.0)/100.0;
		
		return str;
	}
	
}