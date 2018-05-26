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
	//Método para añadir un libro y comprobar que no esté ya añadido
	
	
	/**
	 * Método para añadir un libro y comprobar que no esté ya añadido
	 * @param l parámetro que recibe una variable de tipo libro
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
	 * Método para eliminar un libro comprobando anteiormente si está dentro de la sección
	 * @param isbn Parámetro que le pasamos a la función con la cuál sabemos que libro eliminar 
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
	 * Método Que imprime por consola los libros de la sección seleccionada.
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