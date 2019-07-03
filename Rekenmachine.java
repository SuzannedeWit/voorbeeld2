import java.util.Scanner;

public class Rekenmachine {
	
	public static void main(String[] args) {
		
		int num1;
		int num2;
		String operation;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Type hier het eerste getal:");
		num1 = input.nextInt();
		
		System.out.println("Type hier het tweede getal: ");
		num2 = input.nextInt();
		
		Scanner op = new Scanner(System.in);
        System.out.println("Type hier + of - : ");
        operation = op.next();

        if (operation.equals("+")) {
        		    System.out.println("Het antwoord is: " + (num1 + num2));
        		}
        if (operation.equals("-")) {
        		    System.out.println("Het antwoord is: " + (num1 - num2));
        		}
        }

}

	class Getal {
		int getal;
	}

		
		
		
		

			
			
	



