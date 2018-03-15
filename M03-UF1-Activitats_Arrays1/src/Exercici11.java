import java.util.Scanner;

public class Exercici11 {

	public static void main(String[] args) {
		int[] valors = {5,16,7,4,18,9,11,3,22,25,26,6,13,20,17};
		Scanner s = new Scanner(System.in);
		int valorMaxim;
		int posicioMaxim;
		int resultat = 0;
		//comencçarem el procés considerant que el primer màxim és el valor de la primera posició de la taula
		valorMaxim = valors[0];
		posicioMaxim = 0;   //no lo inicializamos arriba para poder poner el comentario.
		
		
		//Recorrem la taula, mirant a cada volta si el valro que tenim 
		//és més gran, o no, que el màxim que haviem trobat fins ara
		for (int i = 0; i < valors.length; i++) {
			if (valors[i] >= valorMaxim) {
				valorMaxim = valors[i];
				posicioMaxim = i;
			}
		}
		//Mostrem el resultat
		System.out.println("Resultat: " + resultat);
	}

}
