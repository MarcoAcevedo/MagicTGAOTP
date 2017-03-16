import java.io.*;
import java.util.*;


public class Parser {
	
	public static HashMap<String, Army> armyParser(String filename){
		
		String color, name, type, ability;
		int figureQuantity, life, power, move, range, toughness, size, height, cost, PPFcost;
		
		HashMap<String, Army> army = new HashMap<String, Army>();
		
		File inputFile = new File(filename);
		
		try {
			Scanner inputScanner = new Scanner(inputFile);
			String headerLine = inputScanner.nextLine();
			inputScanner.useDelimiter("[,\n]");
			while (inputScanner.hasNextLine()) {
				color = inputScanner.next();
				System.out.println("COLOR: " + color);
				
				name = inputScanner.next();
				System.out.println("NAME: "+ name);
				
				type = inputScanner.next();
				System.out.println("TYPE: "+ type);
				
				figureQuantity = Integer.parseInt(inputScanner.next());
				System.out.println("QUANTITY: "+ figureQuantity);
				
				life = Integer.parseInt(inputScanner.next());
				System.out.println("LIFE: "+life);
				
				power= Integer.parseInt(inputScanner.next());
				System.out.println("POWER: "+power);
				
				move= Integer.parseInt(inputScanner.next());
				System.out.println("MOVE: "+move);
				
				range= Integer.parseInt(inputScanner.next());
				System.out.println("RANGE: "+range);
				
				toughness = Integer.parseInt(inputScanner.next());
				System.out.println("TOUGHNESS: "+toughness);
				
				ability = (inputScanner.next());
				System.out.println("ABILITY: "+ability);
				
				size= Integer.parseInt(inputScanner.next());
				System.out.println("SIZE: "+size);
				
				height= Integer.parseInt(inputScanner.next());
				System.out.println("HEIGHT: "+height);
				
				cost= Integer.parseInt(inputScanner.next());
				System.out.println("COST: "+cost);
				
				PPFcost = Integer.parseInt(inputScanner.next());
				System.out.println("ppfCOST: "+PPFcost);
				
				Army nextArmy = new Army(color, name, type, figureQuantity, life, power, move, range, toughness, ability, size, height, cost, PPFcost);
				army.put(nextArmy.getName(),nextArmy);

		}
		}
		catch (FileNotFoundException e) {
			throw new RuntimeException("Fatal Error: File not Found");
		}
		return army;
	}
	
	public void spellParser(String filename){
		
	}

}
