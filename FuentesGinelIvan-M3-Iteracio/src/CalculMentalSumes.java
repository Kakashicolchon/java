import java.util.Scanner;

public class CalculMentalSumes {

	public static void main(String[] args) {
		double valorMin = 0; 
		double valorMax = 0;
		
		Scanner s = new Scanner (System.in);
		do {
			System.out.print("Digues el valor m�nim dels numeros en cada operand: ");
			valorMin = s.nextDouble();
			System.out.print("Digues el valor max dels numeros en cada operand: ");
			valorMax = s.nextDouble();
			
			if (valorMin > valorMax || valorMin  <= 0) {
				System.out.println("No heu introdu�t els valors correctes.");
				System.out.println("Recodeu que el 0 tampoc �s un valor acceptat");
				
			}
		} while (valorMin > valorMax || valorMin  <= 0);
		s.close();
		
	}

}
