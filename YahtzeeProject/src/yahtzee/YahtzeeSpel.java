package yahtzee;

import java.util.ArrayList;
import java.util.Scanner;

public class YahtzeeSpel {

	
	Scanner userInput = new Scanner(System.in);
	String input = userInput.nextLine();
	
	void spelen() {
		
		//Doelstelling 1
		do {
			System.out.println(input);
		}
		while((input.equals("q"))); 
			input = userInput.nextLine();
			System.out.println("Gestopt."); 
	}
	
	void werpen() {
		
	}
	
	void get.dobbelStenen() {
		
	}
}
	


