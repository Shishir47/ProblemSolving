import java.io.PrintWriter;
import java.util.Scanner;

public class NegativesandPositives1791E {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		Scanner fs= new Scanner (System.in);
		int t=fs.nextInt();
		while(t-->0) {
			int n=fs.nextInt();
			int [] arr= new int [n];
			int mum=0;
			for(int i=0; i<n; i++) {
				arr[i]=fs.nextInt();
				mum=mum+arr[i];
			}
			for(int i=0; i<n-1; i++) {
				if((arr[i]<0)) {
					arr[i]=-arr[i];
					arr[i+1]=-arr[i+1];
				}
			}
			if(arr[n-1]<0) {
				arr[n-2]=-arr[n-2];
				arr[n-1]=-arr[n-1];
			}
			int sum=0;
			for(int i=0; i<n; i++) {
				sum+=arr[i];
			}
			out.println(Math.max(sum, mum));
		}
		
		fs.close();
		out.close();
		System.gc();

	}

}
