
public class Exercici05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	/**
	 * Funció que determina quin és el valor màxim d'una taula unidimensional de valors numèrics. Si la taula val null o la taula no té 
	 * cap element, la funció generará un error.
	 * @param valors Taula de valors de tipus double que conté el conjunt de valors del qual en volem determinar el seu màxim 
	 * @return Valor real que conté la posició de la taula d'entrada que conté el valor màxim.
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
