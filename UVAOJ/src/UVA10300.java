import java.io.PrintWriter;
import java.util.Scanner;

public class UVA10300 {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		Scanner fs= new Scanner(System.in);
		int t=fs.nextInt();
		while(t-->0) {
			int n=fs.nextInt();
			int sum=0;
			for(int i=0; i<n; i++) {
				int a=fs.nextInt();
				fs.nextInt();
				int b=fs.nextInt();
				sum=sum+(a*b);
			}
			out.println(sum);
		}
		
		fs.close();
		out.close();
		System.gc();

	}

}
