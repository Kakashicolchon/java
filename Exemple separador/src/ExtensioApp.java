import java.util.Scanner;

public class ExtensioApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String arxiu;
		int posicio;
		
		System.out.println("Escriu el nom del fitxer: ");
		arxiu = s.nextLine();
		
		//busquem la posici� del derrer "." del nom.
		posicio = arxiu.lastIndexOf(".");
		
		//comprovem si te o no te extensi�.
		if (posicio = -1) {
			System.out.println("L'arxiu no te extensi�");
		}
		else {
			System.out.println("");
		}
	
	}

}
