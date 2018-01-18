import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Exercici11 {

	public static void main(String[] args) {
		int mes;
		Scanner s = new Scanner(System.in);
		String mesos = "4356432134542356766543456765432";
		int posicioInicial;
		
		//Demanem el mes a l'usuari (1-12).
		System.out.println("Introdueix un mes(1-12): ");
		mes = s.nextInt();
		
		posicioInicial = (mes-1)*2;
		System.out.println(mesos.substring(posicioInicial, posicioInicial+2));
	}

}
