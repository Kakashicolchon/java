import java.util.Scanner;

public class GestioAparcament {

	public static void main(String[] args) {
		//preu de l'estada segons temps d'estacionament, longitud de vehicles i 
		// antiguitat dels clients
		double tempsEstacionament = 0; 
		double longitudVehicle = 0;
		double antiguitatClients = 0;
		boolean t = true;
		Scanner s = new Scanner (System.in);

		while (t == true) {
			System.out.print("Quant de temps estar�s estacionat (Minuts): ");
			tempsEstacionament = s.nextInt();
			if (tempsEstacionament > 1440) {
				//1440min = 24 hores
				System.out.println("");
				System.out.println("##################################################################################################");
				System.out.println("Contacti amb l'administrador del servei per contractar abonaments especials. (+24h d'estacionament)");
				System.out.println("##################################################################################################");
				System.exit(1);
			}
			System.out.print("Quina es la longitud del teu vehicle (Metres): ");
			longitudVehicle = s.nextDouble();
			System.out.print("Quant portes venint a aquest aparcament?(Anys, xifra entera): ");
			antiguitatClients = s.nextInt();
			t = false;
			if (tempsEstacionament <= 0 || longitudVehicle <= 0 || antiguitatClients <= 0) {
				System.out.println("No heu introdu�t els valors correctes.");
			} 
			else {
				t = false;
			}
		}
		  
		s.close();
		//Calculem el preu del temps d'estacionament
		if (tempsEstacionament <= 120 ) {
			//Temps en el cas de 1 a 120 min
			tempsEstacionament = 0.04 * tempsEstacionament;
		}
		else if (tempsEstacionament <= 121 && tempsEstacionament >= 600) {
			//Temps en el cas de 121 a 600
			tempsEstacionament = (0.04 * tempsEstacionament) + (0.027 * (tempsEstacionament-120)); 
		}
		else {
			//Temps en el cas de + de 600 (fins a 24 hores)
			tempsEstacionament = 17.76; 
		}
		
		//Calculem el preu de la longitud del vehicle
		if ( longitudVehicle > 4.5) {
			
		}
		 
		
		//mostrem els resultats a l'usuari
		System.out.println("");
		System.out.printf("Vehicle 1 : (%.2f minuts d'estada, %.2f  m de longitud i client amb %.2f anys d'antiguitat)\n", tempsEstacionament, longitudVehicle, antiguitatClients);
		System.out.println("______________________________________________________________________________________");
		System.out.println("Preu per temps                                   = " + " � x " + " minuts = " + "" );
		System.out.println("Rec�rrec per longitud del vehicle                = " + "");
		System.out.println("Preu amb rec�rrec per longitud                   = " + "");
		System.out.println("Descompte per fidelitat                          = " + "");
		System.out.println("Preu final                                       = " + "");
		
		
		
	}

}
