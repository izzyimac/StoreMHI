package project;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;
import static java.util.Arrays.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ReadFile {
	
	private static ObjectOutputStream output;


public Cart loadAndAnalyzeFile() throws IOException
{
	Cart myCart = new Cart();
	
     String fileName = "items.dat";

	 try {
		 	ClassLoader loader = ReadFile.class.getClassLoader();

		    File classpathRoot = new File(loader.getResource("").getPath());
		 	
	        String path = classpathRoot.getPath() + "/";
	        		        
	       path = path + "../src/project/";
	       
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
	 
       while((itemType = bufferedReader.readLine()) != null && (type = bufferedReader.readLine()) != null  && (brand = bufferedReader.readLine())!= null && (stringPrice = bufferedReader.readLine())!= null ) {
    	   
    	   double price = Double.parseDouble(stringPrice);
    	   
    	if (itemType.equalsIgnoreCase("makeup")){
    		Item oneItem = new Makeup(type, brand, price);
    	 	items[index] = oneItem;
        	
        	index++;
    	}
    	else if (itemType.equalsIgnoreCase("kitchenware")){
    		Item oneItem = new KitchenWare(type, brand, price);
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


// WRITE TO FILE

public void openFile()
{
	
	try {
		output = new ObjectOutputStream( new FileOutputStream("src/project/order.dat"));
	} 
	catch (IOException e) {
		
		e.printStackTrace();
		System.out.println("cannot open file");
	}
	catch (SecurityException securityException)
	{
		System.err.println("no access");
	}
	
	
}
	

 public static void main( String args[] ) throws Exception
   {


		ReadFile myRunner = new ReadFile();
		
		myRunner.openFile();
		
		Cart myCart = myRunner.loadAndAnalyzeFile();
		
		out.println(myCart);
		
		//output.writeObject(myCart);
		
		String out = new String(myCart.toString());
		
		/*for (int i = 0; i < out.length(); i++)
		{
			output.writeChar(out.charAt(i));
		}*/
	   
		
		output.writeObject(out);
		
		
		
		
		
		
		
		
}
 
 
 
 
 
}