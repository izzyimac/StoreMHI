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
	
     String fileName = "items.dat";

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
   
    //        line = bufferedReader.readLine();
            int itemsCount = Integer.parseInt(line);
           System.out.println(itemsCount);
            
           Item[] items = new Item[itemsCount];

           String itemType; 
           String brand;
            String type;
            String stringPrice;
            
            int index = 0;
	 
       while((itemType = bufferedReader.readLine()) != null && (brand = bufferedReader.readLine()) != null  && (type = bufferedReader.readLine())!= null && (stringPrice = bufferedReader.readLine())!= null ) {
    	   
    	   double price = Double.parseDouble(stringPrice);
    	   
    	if (itemType.equalsIgnoreCase("makeup")){
    		Item oneItem = new Makeup(type, brand, price);
    	 	items[index] = oneItem;
        	
        	index++;
    	}
    	else if (itemType.equalsIgnoreCase("kitchenware")){
    		Item oneItem = new Kitchenware(type, brand, price);
    	 	items[index] = oneItem;
        	
        	index++;
    	}
    	else if (itemType.equalsIgnoreCase("clothing")){
    		Item oneItem = new Clothing(type, brand, price);
    	 	items[index] = oneItem;
        	
        	index++;
    	}
    	else if (itemType.equalsIgnoreCase("shoes")){
    		Item oneItem = new Shoes(type, brand, price);
    	 	items[index] = oneItem;
        	
        	index++;
    	}
            	//Item oneItem = new Item(type, brand, Double.parseDouble(stringPrice));
            	 
      
       }
           myCart.setArray(items);;

           
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

        }
	 
	 
	 return myCart;
	
}
	

 public static void main( String args[] ) throws Exception
   {


		ReadFile myRunner = new ReadFile();
		Cart myCart = myRunner.loadAndAnalyzeFile();
		
		out.println(myCart);
		
}
}
