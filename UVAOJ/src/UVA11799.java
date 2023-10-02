import java.io.PrintWriter;
import java.util.Scanner;

public class UVA11799 {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		Scanner fs= new Scanner(System.in);
		int t=fs.nextInt();
		int v=t;
		while(t-->0) {
			int n=fs.nextInt();
			int max=Integer.MIN_VALUE;
			for(int i=0; i<n; i++) {
				int x=fs.nextInt();
				if(x>max) {
					max=x;
				}
			}
			out.println("Case "+(v-t)+": "+max);
			
		}
		
		out.close();
		fs.close();
		System.gc();

	}

}
