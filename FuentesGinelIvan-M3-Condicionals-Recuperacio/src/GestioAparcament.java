import java.util.Scanner;

public class GestioAparcament {

	public static void main(String[] args) {
	//preu de l'estada segons temps d'estacionament, longitud de vehicles i 
	// antiguitat dels clients
		double tempsEstacionament = 0; 
		double longitudVehicle = 0;
		int antiguitatClients;
		
		Scanner s = new Scanner (System.in);
		do {
			System.out.print("Quant de temps estaràs estacionat (Minuts): ");
			tempsEstacionament = s.nextDouble();
			System.out.print("Quina es la longitud del teu vehicle (Metres: ");
			longitudVehicle = s.nextDouble();
			System.out.print("Quant portes venint a aquest aparcament?(Anys, xifra entera): ");
			antiguitatClients = s.nextInt();
			if (tempsEstacionament > longitudVehicle || tempsEstacionament  <= 0) {
				System.out.println("No heu introduït els valors correctes.");
				System.out.println("Recodeu que el 0 tampoc és un valor acceptat");
				
			}
		} while (tempsEstacionament > longitudVehicle || tempsEstacionament  <= 0);
		s.close();
	}

}
