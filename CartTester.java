package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CartTester {

	public static void main( String args[] ) // throws FileNotFoundException
	   {
			Cart items = new Cart();
		
			//read items from file to initialize items
			
			String filename = "src/project/items.dat";

			Scanner file = null;
			try {
				file = new Scanner (new File(filename));
			} catch (FileNotFoundException e) {
				System.out.println("File not found");
			}

			int size = file.nextInt();
			file.nextLine();
			
			System.out.println(items.getTotalPrice());
		
		
	   }
	
}
