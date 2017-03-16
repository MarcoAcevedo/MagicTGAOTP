
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*; 


public class Main extends Parser{
	public static void main(String[] args) throws InterruptedException{
		
		HashMap<String, Army> allArmyCards = armyParser("cards/army/kiora");
		
		System.out.println(allArmyCards.get("kiora").getName());
		
		//Army kiora = new Army("gold", "kiora", "Planeswalker", 1, 6, 4, 5, 6, 4, "SeaBorn", 2, 5, 345, 345);
		
		//HashMap<String, Army> planeswalkers = new HashMap<String, Army>();
		
		//planeswalkers.put("kiora", kiora);
		
		//System.out.println(planeswalkers.get("kiora").getName());
		
		//Army kiora = new Army("gold", "kiora", "Planeswalker", 1, 6, 4, 5, 6, 4, "SeaBorn", 2, 5, 345, 345);
		//HashMap<String, Army> kiora = armyParser("cards/army/kiora");
	
		//PanelUI GUI = new PanelUI();
		//Thread.sleep(100);
		//System.exit(0);
	}
}