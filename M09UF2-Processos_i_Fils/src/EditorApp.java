import java.io.IOException;

public class EditorApp {

	public static void main(String[] args) throws IOException, InterruptedException {
		ProcessBuilder pb;
		Process p;
		
		for (int i = 0; i < 10; i++) {
			pb = new ProcessBuilder("calc","");
			p= pb.start();
			//p.waitFor();
			//System.out.println("Willy ya terminó el programita :v");
			
			Thread.sleep(300);
			p.destroy();
		}
		
		
		

	}

}
