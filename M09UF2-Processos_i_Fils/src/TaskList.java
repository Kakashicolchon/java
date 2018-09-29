import java.io.IOException;
import java.util.Scanner;

public class TaskList {

	public static void main(String[] args) throws IOException {
		ProcessBuilder pb = new ProcessBuilder("tasklist", "/hh");
		Process p;
		Scanner sc;
		int i = -1;
		
		p = pb.start();

	}

}
