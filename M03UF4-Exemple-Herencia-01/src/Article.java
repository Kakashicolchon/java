
public class Article {
	String nom;
	String fabricant;
	String codiEAN;
	double preu;
	
	public Article() {
		System.out.println("S'ha executat un constructor de la classe Article.");
		
	}
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	

}
