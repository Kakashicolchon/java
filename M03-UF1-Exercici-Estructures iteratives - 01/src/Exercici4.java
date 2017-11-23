import java.util.Scanner;

public class Exercici4 {

	public static void main(String[] args) {
		int suma = 0;
		int quantsValors = 0;
		int valor = 0;
		double mitja;
		Scanner s = new Scanner(System.in);
		
		
		//Preguntem a l'usuari la quantitat de valors que ens donarà.
		System.out.print("De quants valros vols calcular la mitja? : ");
		quantsValors = s.nextInt();
		
		for (int i = 0; i < quantsValors; i++) {
			System.out.print("Introdueix un nou valor a la suma: ");
			valor = s.nextInt();
			
			suma = suma + valor;
				
			}
		//Calculem la mitja dividint la suma entre la quantitat de valor
		mitja = (double)suma / quantsValors;
		System.out.printf("Mitja: %.2f",mitja);
		s.close();
		}
	}

