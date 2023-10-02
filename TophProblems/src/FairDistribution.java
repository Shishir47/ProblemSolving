import java.io.PrintWriter;
import java.util.Scanner;

public class FairDistribution {

	public static void main(String[] args) {
		Scanner fs= new Scanner(System.in);
		PrintWriter out= new PrintWriter(System.out);
		int x=fs.nextInt();
		int n=fs.nextInt();
		if(n%x!=0) {
			out.println(x-(n%x));
		}
		else {
			out.println('0');
		}
		
		out.close();
		fs.close();
		System.gc();

	}

}
