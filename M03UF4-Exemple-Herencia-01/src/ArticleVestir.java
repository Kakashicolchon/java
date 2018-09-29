
public class ArticleVestir extends Article {
	double talla;
	
	//constructor
	public ArticleVestir() {
		System.out.println("S'ha executat un constructor de la classe ArcicleVestir");
	}
	public String toString() {
		return getNom() + " talla " + talla;
	}
}
