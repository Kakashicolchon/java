import java.util.Scanner;

public class FacToriAl {

	public static void main(String[] args) {
		int entrada;
		Scanner s= new Scanner(System.in);
		
		System.out.print("Donam un numero: ");
		entrada = s.nextInt();
		
		for (int i = entrada-1; i>=1; i--) {
			entrada=entrada*i;
		}
		System.out.println("El resultat del factorial demanat és: " + entrada);
		s.close();
		
		
	}

}
