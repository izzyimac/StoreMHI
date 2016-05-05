package project;

public class ItemsTester {

	public static void main(String[] args) {

		System.out.println("TESTING KITCHENWARE");
		KitchenWare fork = new KitchenWare();
		System.out.println(fork);
		fork.setBrand("KitchenBasics");
		fork.setPrice(2.01);
		fork.setType("fork");
		fork.setRating("one");
		System.out.println(fork);
		
		System.out.println();
		
		System.out.println("TESTING MAKEUP");
		Makeup mascara = new Makeup();
		System.out.println(mascara);
		mascara.setPrice(3.99);
		mascara.setBrand("Maybelline");
		mascara.setType("mascara");
		System.out.println(mascara);
		
		
		System.out.println();
		
		System.out.println("TESTING SHOES");
		Shoes shoe = new Shoes();
		System.out.println(shoe);
		shoe.setPrice(40.99);
		shoe.setBrand("Adidas");
		shoe.setType("sneakers");
		shoe.setSize(12.0);
		System.out.println(shoe);
		

	}

}
