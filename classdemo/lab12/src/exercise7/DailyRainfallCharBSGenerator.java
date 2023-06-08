package exercise7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Exercise 7 : To demonstrate system using Character-Based Stream
 * 
 * @author Adib Adliyana binti Suparman
 */

public class DailyRainfallCharBSGenerator {

	public static void main(String[] args) {
        
		try {
        	
			String sourceFile = "DailyRainfall.txt";
			
            FileWriter fileWriter = new FileWriter(sourceFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            PrintWriter printWriter = new PrintWriter(bufferedWriter);

            // Writing data for Station Simpang Ampat in Alor Gajah district
            printWriter.println("Station ID: 2421003");
            printWriter.println("Station Name: Simpang Ampat");
            printWriter.println("District: Alor Gajah");
            printWriter.println("Rainfall Data:");

            // Sample data for 6 days of rainfall
            int[] rainfallReadings = {5, 0, 0, 4, 1, 0};

            for (int i = 0; i < rainfallReadings.length; i++) {
                
            	printWriter.println("Day " + (i + 1) + ": " + rainfallReadings[i]);
            
            }

            printWriter.close();
            
            System.out.println("Data creation has ended.");
       
		} catch (IOException e) {
            e.printStackTrace();
        }
    }
}