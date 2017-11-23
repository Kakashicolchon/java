import java.util.Scanner;

public class Condicionals {

	public static void main(String[] args) {
		double notaNumerica;
		Scanner s = new	Scanner(System.in);
		//Demanem a l'usuari que ens digui una nota numèrica
		System.out.print("Digues la teva nota: ");
		notaNumerica = s.nextDouble();
		
		if (notaNumerica<0||notaNumerica>10) {
			System.out.println("La nota no està entre 0 i 10.");
			
		}
		else if (notaNumerica<5) 
			{
			System.out.println("Compañero, tas suspendioh");
			}
		else if (notaNumerica<7) {
			System.out.println("Aprovaicoh por los pelos, de hecho entre 5 y  7, no ta mal");
		}
		else if (notaNumerica<9) {
			System.out.println("CCCCCCompañero estas bastante a tope");
		}
		else if (notaNumerica<10) {
			System.out.println("EEXXXCELENTEEEE");
		}
		else if (notaNumerica==10) {
			System.out.println("MATRICULA DE HONOR CHAMPION");
		}
		else {
			System.out.println("");
		}
		}
			

	}

