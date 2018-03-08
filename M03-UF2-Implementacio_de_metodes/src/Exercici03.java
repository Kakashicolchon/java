
public class Exercici03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("4273: " + esPrimer(4273));
	}
	
	
	/**
	 * Funcio que comprova si un determinat nombre enter �s
	 * o no �s primer.
	 * @param valor Nombre que volem comprovar si �s primer.
	 * @return Valor boole� que valdr� true si el nombre que
	 * 				hem passat �s primer; false, en cas contrari.
	 */
	public static boolean esPrimer(int valor ) {
		int d;
		boolean esPrimer = true;
		//Mirem d'entrada si es parell
		if (valor % 2 == 0) {
			//Si es parell, ja no �s el primer.
			esPrimer = false;
		}
		else {
			//Si no  �s parell, busquem divisors de del 3 en endavant.
			// mirant nom�s nombres senars.
			d = 3;
			while (d <= Math.sqrt(valor) && esPrimer == true) {
				if (valor % d == 0) {
					esPrimer = false;
				}
				
			}
		}
		return esPrimer;
		
	}
}
