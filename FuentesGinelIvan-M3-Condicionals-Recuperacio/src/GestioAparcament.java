import java.util.Scanner;

public class GestioAparcament {

	public static void main(String[] args) {
		//preu de l'estada segons temps d'estacionament, longitud de vehicles i 
		// antiguitat dels clients
		int tempsEstacionament = 0; 
		double longitudVehicle = 0;
		int antiguitatClients = 0;
		boolean t = true;
		Scanner s = new Scanner (System.in);

		while (t == true) {
			System.out.print("Quant de temps estaràs estacionat (Minuts): ");
			tempsEstacionament = s.nextInt();
			System.out.print("Quina es la longitud del teu vehicle (Metres): ");
			longitudVehicle = s.nextDouble();
			System.out.print("Quant portes venint a aquest aparcament?(Anys, xifra entera): ");
			antiguitatClients = s.nextInt();
			t = false;
			if (tempsEstacionament <= 0 || longitudVehicle <= 0 || antiguitatClients <= 0) {
				System.out.println("No heu introduït els valors correctes.");
			} 
			else {
				t = false;
			}
		}
		//dades de l'usuari 
		s.close();
		System.out.println("");
		System.out.printf("Vehicle 1 : (%d minuts d'estada, %.2f  m de longitud i client amb %d anys d'antiguitat)\n", tempsEstacionament, longitudVehicle, antiguitatClients);
		System.out.println("______________________________________________________________________________________");
		
		
	}

}
