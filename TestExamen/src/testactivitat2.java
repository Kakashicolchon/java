import java.util.Scanner;

public class testactivitat2 {

	public static void main(String[] args) {
		int valor;
		Scanner s = new Scanner(System.in);
		boolean esQuadratPerfecte = false;
		int i;
		
		System.out.println("Valor que vols comprovar si és un quadrat perfecte: ");
		valor = s.nextInt();
		
		
		i = 1;
		while (esQuadratPerfecte == false && valor >= i*i) {
			if (valor == i*i) {
				esQuadratPerfecte = true;
			}
			i++;
		}
		if (esQuadratPerfecte == true ) {
			System.out.println("El valor introduït és un quadrat perfecte.");
		}
		else {
			System.out.println("El valor introduït no és un quadrat perfecte.");
		}
		s.close();
	}

}
