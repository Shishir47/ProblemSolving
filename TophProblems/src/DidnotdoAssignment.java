import java.io.PrintWriter;
import java.util.Scanner;

public class DidnotdoAssignment {

	public static void main(String[] args) {
		Scanner fs= new Scanner(System.in);
		PrintWriter out= new PrintWriter(System.out);
		int n=fs.nextInt();
		boolean bl=false;
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i==0) {
				bl=true;
			}
		}
		if(bl) {
			for(int i=0; i<n; i++) {
				out.println("I DID NOT DO THE ASSIGNMENT.");
			}
		}
		else {
			out.println("NO PUNISHMENT");
		}
		
		out.close();
		fs.close();
		System.gc();
	}

}
