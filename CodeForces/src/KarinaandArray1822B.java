import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.LinkedList;
import java.util.Scanner;

public class KarinaandArray1822B {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		Scanner fs= new Scanner(System.in);
		int t=fs.nextInt();
		while(t-->0) {
			int n=fs.nextInt();
			long [] arr= new long [n];
			for(int i=0; i<n; i++) {
				arr[i]=fs.nextInt();
			}
			BigInteger bg= BigInteger.ZERO;
			for(int i=0; i<n; i++) {
				for(int j=i+1; j<n; j++) {
					if(BigInteger.valueOf(arr[i]*arr[j]).compareTo(bg)>0) {
						bg=BigInteger.valueOf(arr[i]*arr[j]);
					}
				}
			}
			out.println(bg);
		}
		
		fs.close();
		out.close();
		System.gc();

	}

}
