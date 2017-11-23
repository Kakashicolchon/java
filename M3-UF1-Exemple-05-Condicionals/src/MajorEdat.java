import java.util.Scanner;

public class MajorEdat {

	public static void main(String[] args) {
		int edat;
		Scanner s = new Scanner(System.in);
		
		//preguntem edat a l'usuari
		
		System.out.print("Quina edat tens?: ");
		edat = s.nextInt();
		
		//comprovem si l'usuari te 18
		
		if (edat >= 18) {
			System.out.println("Ets major d'edat company :D.");

		}
		else {
			System.out.println("pos va a ser que no puedes entrar.");
		}
		s.close();
		System.out.println("exercici24");
		
		
	}
 // Exercici 24
	
}
