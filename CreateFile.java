package project;

import java.io.FileNotFoundException;
import java.util.Formatter;

public class CreateFile {

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
	
	
	/*public void addRecords()
	{
		AccountRecord record = new AccountRecord();
	}*/
}
