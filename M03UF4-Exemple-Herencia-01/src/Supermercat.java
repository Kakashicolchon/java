
public class Supermercat {

	public static void main(String[] args) {
		ArticleVestir av;
		av = new ArticleVestir();
		av.nom = "Pantalons taxans";
		av.talla = 42;
		
		Article a;
		a = new Article();
		a.nom = "Lleta sencera 1";
		//a.talla = 10;  //No hereda de article

	}

}
