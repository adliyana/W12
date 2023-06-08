package exercise5;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * Exercise 5
 * Task B:To demonstrate system using Java I/O Streams
 * 
 * @author Adib Adliyana binti Suparman
 * 
 */

public class DailyRainfallDataGenerator {

	public static void main (String [] args)
	{
		// 1. Declare output file
		String outFile = "DailyRainFall.txt";
		
		try
		{
			// 2. Create an output stream between this program and the output file, outFile
			DataOutputStream Output = new DataOutputStream(new FileOutputStream(outFile));
			
			// 3. Construct output stream object
			Output.write(0);
			Output.write(4);
			Output.write(1);
			Output.write(0);
			Output.write(6);
			Output.write(19);
			
			// 4. Clear the stream
			Output.flush();
			
			// 5. Close the stream
			Output.close(); 
			
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		
		// Indicate end of program - Could be successful
		System.out.println("End of program. Check out " + outFile); 
	}
}