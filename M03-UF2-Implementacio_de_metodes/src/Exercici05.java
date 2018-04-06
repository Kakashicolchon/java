
public class Exercici05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Funci� que determina quin �s el valor m�xim d'una taula unidimensional de valors num�rics. Si la taula val null o la taula no t� 
	 * cap element, la funci� generar� un error.
	 * @param valors Taula de valors de tipus double que cont� el conjunt de valors del qual en volem determinar el seu m�xim 
	 * @return Valor real que cont� la posici� de la taula d'entrada que cont� el valor m�xim.
	 */
	public static double calcularValorMaxim (double[] valors) {
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
