package exercise7;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Exercise 7 : To demonstrate system using Character-Based Stream
 * 
 * @author Adib Adliyana binti Suparman
 */

public class DailyRainfallCharBSReader {

	   public static void main(String[] args) {
		   
	        try {
	        	
	        	String sourceFile = "DailyRainfall.txt";
	        	String line;
	        	
	            FileReader fileReader = new FileReader(sourceFile);
	            BufferedReader bufferedReader = new BufferedReader(fileReader);

	            while ((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	            }

	            bufferedReader.close();
	            
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
}