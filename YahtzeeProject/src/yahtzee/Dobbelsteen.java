package yahtzee;

import java.util.Random;

public class Dobbelsteen {
	
	//Doelstelling 3
	void werpen() {
		Random rn = new Random();
		int range = 6 - 1 + 1;
		int randomNum =  rn.nextInt(range) + 1;
		System.out.println("Het random getal is: " + randomNum);
	}
}
	

