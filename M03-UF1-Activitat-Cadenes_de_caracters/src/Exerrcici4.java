import java.util.Scanner;

public class Exerrcici4 {

	public static void main(String[] args) {
		String paraula = "";
		Scanner s = new Scanner(System.in);
		//demanem les paraules
		
		while (paraula.equals("final") == false) {
			System.out.print("Escriu una paraula: ");
			paraula = s.nextLine().trim().toLowerCase();
			if (paraula.startsWith("pal")) {
				System.out.println("La paraula comenša per 'pal' " );
			}
			else if (paraula.startsWith("final")) {
				System.err.println("Finalitzaciˇ del programa. ^^");
			}
			else {
				System.out.println("La paraula no comenša per 'pal' ");
			}
		}
		
	}

}
