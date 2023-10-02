import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class DecentArrays {

	public static void main(String[] args) {
		Scanner fs= new Scanner(System.in);
		PrintWriter out= new PrintWriter(System.out);
		int n=fs.nextInt();
		int [] arr= new int [n];
		int [] arr2= new int [n];
		for(int i=0; i<n; i++) {
			int x=fs.nextInt();
			arr[i]=x;
			arr2[i]=x;
		}
		Arrays.sort(arr2);
		boolean isit=false;
		for(int i=0; i<n; i++) {
			if(arr[i]!=arr2[i]) {
				isit= true;
				break;
			}
		}
		if(isit) {
			out.println("No");
		}
		else {
			out.println("Yes");
		}
		
		
		out.close();
		fs.close();
		System.gc();

	}

}
