import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercici1 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner s = new Scanner(new File("C:\\Users\\tonim\\git\\java\\PrietoFuentesAntonioIvan-M3-EstacionsMeteorologiques\\src\\dades.txt"));
		int numEstacions = llegeixNombreEstacions(s);
	}
	/**
	 * M�tode que ens diu el nombre d'estacions sobre les quals tenim dades en l'arxiu
	 * CSV d'entrada.
	 * @param sc Objecte Scanner pr�viament creat i associat a l'arxiu d'entrada. Se
	 * suposa que encara no s'hi ha fet cap lectura i, per tant, el primer
	 * que hi trobarem ser� la l�nia que cont� el nombre d'estacions.
	 * @return Nombre d'estacions meteorol�giques especificades en la primera l�nia de l'arxiu
	 * d'entrada CSV. Si l'arxiu d'entrada no t� el format correcte o b�, hem llegit
	 * pr�viament alguna cosa de l'arxiu i per tant la propera lectura no donar�
	 * la primera l�nia, el m�tode pot generar un error d'execuci�.
	 * @throws FileNotFoundException 
	 */
	 public static int llegeixNombreEstacions(Scanner sc) throws FileNotFoundException {
			String linia;
			linia = sc.nextLine();
			System.out.println(linia);
			return 0;
	 }
	
	
	
	
	// Por acabar funci�n 1
	

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