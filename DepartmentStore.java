package project;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Formatter;
import java.util.Scanner;

public class DepartmentStore {
	
	// read/write files https://docs.oracle.com/javase/tutorial/essential/io/file.html
	
	// file attributes https://docs.oracle.com/javase/7/docs/api/java/nio/file/attribute/BasicFileAttributes.html
	
	private Formatter output;

	
	public void openFile()
	{
		try
		{
			output = new Formatter("clients.txt");
		}
		catch (SecurityException securityException)
		{
			System.err.println("no access to file");
			System.exit(1);
		}
		catch (FileNotFoundException fileNotFoundException)
		{
			System.err.println("file not found");
			System.exit(1);
		}
		
	}
	

	public static void main( String args[] ) throws FileNotFoundException
   {
		String filename = "src/project/order.dat";
		String filename2 = "src/project/test.dat";
		File test = new File(filename2);
		//test.
		//Path file = 
		//BasicFileAttributes attrs = Files.readAttributes(file, BasicFileAttributes.class);
		//Files output = Files.createFile(path, );
		//OutputStream out = new BufferedOutputStream()
		//Scanner file = new Scanner (new File(filename));
		//file.write()
		
   }
	
}
