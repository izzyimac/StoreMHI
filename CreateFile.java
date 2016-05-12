package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Formatter;

public class CreateFile {

	private ObjectOutputStream output;
	
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
	
	
	public void addCart() throws IOException
	{
		ReadFile test = new ReadFile();
		
		//openFile();
		
		test.loadAndAnalyzeFile();
		
	}
	
	public CreateFile() throws IOException
	{
		FileWriter tester = new FileWriter(new File("src/project/order.dat"));
	}
	
	
}
