
public class Exercici04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Funció que determina quina posició d'una taulaunidimensional de valors numèrics reals conté el valros més gran(el màxim). Si la taula
	 * val null o la taula no té cap element, la taula fenerarà un error.
	 * @param valors Taula de valors de tipus double que conté el conjunt de valors del qual en volem determinar la posició del seu màxim 
	 * @return Valor enter que conté la posició de la taula d'entrada que conté el valor màxim.
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
