import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercici1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("./dades.txt"));
		int numEstacions = llegeixNombreEstacions(s);
	}
	/**
	 * Mètode que ens diu el nombre d'estacions sobre les quals tenim dades en l'arxiu
	 * CSV d'entrada.
	 * @param sc Objecte Scanner prèviament creat i associat a l'arxiu d'entrada. Se
	 * suposa que encara no s'hi ha fet cap lectura i, per tant, el primer
	 * que hi trobarem serà la línia que conté el nombre d'estacions.
	 * @return Nombre d'estacions meteorològiques especificades en la primera línia de l'arxiu
	 * d'entrada CSV. Si l'arxiu d'entrada no té el format correcte o bé, hem llegit
	 * prèviament alguna cosa de l'arxiu i per tant la propera lectura no donarà
	 * la primera línia, el mètode pot generar un error d'execució.
	 * @throws FileNotFoundException 
	 */
	 public static int llegeixNombreEstacions(Scanner sc) throws FileNotFoundException {
			String linia;
			linia = sc.nextLine();
			System.out.println(linia);
			return 0;
	 }
	
	
	
	
	// Por acabar función 1
	

}







































/*
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercici1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(new File("DadesTemps"));
		String linia;
		int suma=0;
		int valor;
		
		while (s.hasNext() == true) {
			linia = s.nextLine();
			System.out.println(linia);
			//valor = Integer.parseInt(linia);
			//suma = suma + valor;
		}
		
		System.out.println("Suma: " + suma);
		
		
	}

}*/