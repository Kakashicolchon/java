
public class testmatrix {

	public static void main(String[] args) {
		class efectoMatrixXD{
			 
			public void main(String[] args) throws InterruptedException{
			 
			 
			int linea = 0;
			int otro = 0;
			 
			while (otro < 10000){
			 
			while(linea < 110){
			 
			int  num1 = (int)(Math.random()*9);
			 
			   System.out.print(num1);
			 
			linea++;
			 
			} 
			System.out.println();
			 
			  linea = 0;
			 
			++otro;
			 
			Thread.sleep(25);
			}
			 
			}
			}
	}

}
