
import javax.swing.*;
import java.awt.*;
import java.util.*;
import java.io.*; 


public class Main {
	public static void main(String[] args) throws InterruptedException {
		
		Army Kiora = new Army("gold", "kiora", "Planeswalker", 1, 6, 4, 5, 6, 4, "SeaBorn", 2, 5, 345, 345);
		
		LinkedList<Army> planeswalkers = new LinkedList<Army>();
		
		//ArrayList<Army> Kiora = armyParser("data/students.csv");
	
		PanelUI GUI = new PanelUI();
		//Thread.sleep(100);
		//System.exit(0);
	}
}