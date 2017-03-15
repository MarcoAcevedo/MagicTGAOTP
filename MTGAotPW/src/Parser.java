import java.io.*;
import java.util.*;


public class Parser {
	public static void armyParser(String filename){
		File inputFile = new File(filename);
		try {
			Scanner inputScanner = new Scanner(inputFile);
			int count = 0;
			int sum = 0;
			while (inputScanner.hasNextInt()) {
				int nextNumber = inputScanner.nextInt();
				count++;
				sum += nextNumber;
				System.out.println("Next Number (" + count + "): " + nextNumber);
			}
			System.out.println("Sum =  " + sum);

		}
		catch (FileNotFoundException e) {
			throw new RuntimeException("Fatal Error: File not Found");
		}
	}
	
	public void spellParser(String filename){
		
	}

}
