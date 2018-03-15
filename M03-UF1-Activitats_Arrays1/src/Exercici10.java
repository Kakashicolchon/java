import java.util.Arrays;
import java.util.Scanner;

public class Exercici10 {

	public static void main(String[] args) {
		int[] t1 = {5,8,12,3,9,18,1,15,7,6};
		int[] t2 = {3,2,4,1,8,10,11,9,2,6};
		int[] interseccio = new int[t1.length];
		int valorABuscar;
		int posicioResultat = 0;
		
		
		
		//Bucle que recorre tots els elements de la taula t1 per anar coprovant si existeixen dins de t2.
		for (int j = 0; j < t1.length; j++) {
			//Indiquem que el valor que volem buscar a t2 és l'element actual de t1.
			valorABuscar = t1[j];
			
			int i = 0;
			boolean trobat = false;
			while (i < t2.length && trobat == false) {
				if (t2[i] == valorABuscar) {
					trobat = true;
				}
				i++;
				
			}
			if (trobat == true) {
				interseccio[posicioResultat++] = valorABuscar;
			}
		}
		System.out.println(Arrays.toString(interseccio));
	}

}
