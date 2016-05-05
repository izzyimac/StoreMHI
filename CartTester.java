package DepartmentStore;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CartTester {

	public static void main( String args[] )// throws FileNotFoundException
	   {
			Cart items = new Cart();
		
			//read items from file to initialize items
			
			String filename = "src/project/cartItems.dat";

			Scanner file = new Scanner (new File(filename));

			int size = file.nextInt();
			file.nextLine();
			
			System.out.println(items.getTotalPrice());
		
		
	   }
	
}
