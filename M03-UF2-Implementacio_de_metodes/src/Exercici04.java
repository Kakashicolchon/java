
public class Exercici04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Funci� que determina quina posici� d'una taulaunidimensional de valors num�rics reals cont� el valros m�s gran(el m�xim). Si la taula
	 * val null o la taula no t� cap element, la taula fenerar� un error.
	 * @param valors Taula de valors de tipus double que cont� el conjunt de valors del qual en volem determinar la posici� del seu m�xim 
	 * @return Valor enter que cont� la posici� de la taula d'entrada que cont� el valor m�xim.
	 */
	public static int calcularPosicioMaxim (double[] valors) {
		double valorMaxim;
		int posicioMaxim;
		//exercici11
		valorMaxim = valors[0];
		posicioMaxim = 0;
		
		for (int i = 0; i < valors.length; i++) {
			if (valors[i] > valorMaxim) {
				valorMaxim = valors[i];
				posicioMaxim = i;
			}
		}
		return posicioMaxim;
	}
		

}
