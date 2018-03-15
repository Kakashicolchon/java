import java.util.Scanner;

public class Exerci3 {
	public static void main(String[] args) {
		String frase;
		Scanner s = new Scanner(System.in);
		int as = 0;
		int es = 0;
		int is = 0;
		int os = 0;
		int us = 0;
		
		//Demanem la frase a l'usuari.
		System.out.print("Escriu una frase: ");
		frase = s.nextLine().toLowerCase();
		
		//Fem un bucle, per llegir la frase car�ctera car�cter.
		
		for (int i = 0; i < frase.length(); i++) {
			switch (frase.charAt(i)) {
			case 'a':
			case 'à':
			case 'á': as++;
				break;
			case 'e':
			case 'é':
			case 'è': es++;
				break;
			case 'i':
			case 'í':
			case 'ï': is++;
				break;
			case 'o':
			case 'ó':
			case 'ò': os++;
				break;
			case 'u':
			case 'ú':
			case 'ü': us++;
			
				

			default:
				break;
			}
		}
		System.out.println("Total 'as': " +  as);
		System.out.println("Total 'es': " +  es);
		System.out.println("Total 'is': " +  is);
		System.out.println("Total 'os': " +  os);
		System.out.println("Total 'us': " +  us);
	}
}
