import java.util.Scanner;

public class CalculMentalSumes {

	public static void main(String[] args) {
		double valorMin = 0; 
		double valorMax = 0;
		
		Scanner s = new Scanner (System.in);
		do {
			System.out.print("Digues el valor mínim dels numeros en cada operand: ");
			valorMin = s.nextDouble();
			System.out.print("Digues el valor max dels numeros en cada operand: ");
			valorMax = s.nextDouble();
			
			if (valorMin > valorMax || valorMin  <= 0) {
				System.out.println("No heu introduït els valors correctes.");
				System.out.println("Recodeu que el 0 tampoc és un valor acceptat");
				
			}
		} while (valorMin > valorMax || valorMin  <= 0);
	}

}
