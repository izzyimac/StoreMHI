package DepartmentStore;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;





import static java.lang.System.*;
import static java.util.Arrays.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {


public Cart loadAndAnalyzeFile() throws IOException
{
	Cart myCart = new Cart();
	
     String fileName = "Item.dat";

	 try {
		 	ClassLoader loader = ReadFile.class.getClassLoader();

		    File classpathRoot = new File(loader.getResource("").getPath());
		 	
	        String path = classpathRoot.getPath() + "/";
	        		        
	       path = path + "../src/DepartmentStore/";
	       
            FileReader fileReader = 
                new FileReader(path + fileName);

            BufferedReader bufferedReader = 
                new BufferedReader(fileReader);
            
            String line = bufferedReader.readLine();
    
            
           // System.out.println("The class name =" + line);
            
            line = bufferedReader.readLine();
            int itemsCount = Integer.parseInt(line);
            
           // System.out.println("The class student count =" + studentCount);
            
           Item[] items = new Item[itemsCount];

            String brand;
            String type;
            String stringPrice;
            
            int index = 0;
	 
       while( (brand = bufferedReader.readLine()) != null  && (type = bufferedReader.readLine())!= null && (stringPrice = bufferedReader.readLine())!= null ) {
    	   
    	 //  double price = Double.parseDouble(stringPrice);
    	   
            	Item oneItem = new Item(type, brand, Double.parseDouble(stringPrice));
            	
            
            	items[index] = oneItem;
            	
            	index++;
            	
       }
	 
           myCart.setArray(items);;

            // Always close files.
            bufferedReader.close();         
        }
        catch(FileNotFoundException ex) {
            System.out.println(
                "Unable to open file '" + 
                fileName + "'");                
        }
        catch(IOException ex) {
            System.out.println(
                "Error reading file '" 
                + fileName + "'");                  
            // Or we could just do this: 
            // ex.printStackTrace();
        }
	 
	 
	 return myCart;
	
}
	

 public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		//Scanner file = new Scanner(new File("gradebook.dat"));
		ReadFile myRunner = new ReadFile();
		Cart myCart = myRunner.loadAndAnalyzeFile();
		
		out.println(myCart);
		
}
}