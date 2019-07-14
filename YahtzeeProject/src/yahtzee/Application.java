package yahtzee;

import java.util.ArrayList;

public class Application {

	public static void main(String[] args) {
		
		//Doelstelling 4
		ArrayList<String> dobbelStenen = new ArrayList<String>();

		System.out.println("Press Enter to continue.");
		System.out.println("Press Q to leave.");
		
		//Doelstelling 2
		YahtzeeSpel yahtzeespel = new YahtzeeSpel();
		yahtzeespel.spelen();

		//Doelstelling 3
		Dobbelsteen dobbelsteen = new Dobbelsteen();
		dobbelsteen.werpen();
	}


 	void vasthouden () {
 		
 	}
 	
}


