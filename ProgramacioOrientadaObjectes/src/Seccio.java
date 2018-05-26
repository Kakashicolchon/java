import java.util.Vector;

public class Seccio {
	String nom;
	String codiCdu;
	Vector<Llibre> v;
	//Construccio
	public Seccio(String n, String cD) {
        nom = n;
        codiCdu = cD;
        v = new Vector <Llibre>();
	}
	//M�todo para a�adir un libro y comprobar que no est� ya a�adido
	
	
	/**
	 * M�todo para a�adir un libro y comprobar que no est� ya a�adido
	 * @param l par�metro que recibe una variable de tipo libro
	 * @return devuelve el valor boleano de la variable exists negada
	 */
	public boolean addLlibre(Llibre l){
		boolean exists = false;
		for (int i = 0; i < v.size(); i++) {
			if (l.isbn.equals(v.get(i).isbn)) {
				exists = true;
			}
		}
		if (exists == false) {
			v.add(l);
		}
		return !exists;
	}
	
	/**
	 * M�todo para eliminar un libro comprobando anteiormente si est� dentro de la secci�n
	 * @param isbn Par�metro que le pasamos a la funci�n con la cu�l sabemos que libro eliminar 
	 * @return devuelve el valor boleano de la variable exists.
	 */
	public boolean removeLlibre(String isbn) {
		boolean exists = false;
		for (int i = 0; i < v.size(); i++) {
			if (isbn.equals(v.get(i).isbn)) {
				exists = true;
				v.remove(i);
			}	
			
		}
		return exists;
	}
	
	/**
	 * M�todo Que imprime por consola los libros de la secci�n seleccionada.
	 */
	public void printLlibres() {
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i).titol);
			System.out.println(v.get(i).isbn);
			System.out.println(v.get(i).autor);
			System.out.println(v.get(i).editorial);
			System.out.println(v.get(i).numPagines);
			System.out.println(v.get(i).numEdicio);
			System.out.println(v.get(i).anyEdicio);
			System.out.println(v.get(i).dataAdquisicio);
		}
	}

}