import java.io.PrintWriter;
import java.util.Scanner;

public class PrependandAppend1791C {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		Scanner fs= new Scanner (System.in);
		int t=fs.nextInt();
		while(t-->0) {
			int n=fs.nextInt();
			String s=fs.next();
			char [] ch= s.toCharArray();
			int l= 0, r= n - 1;
			while (ch[l] != ch[r] && n > 0) {
				l++; r--; 
				n= n-2;
			}
			out.println(n);
			
			
		}
		
		
		fs.close();
		out.close();
		System.gc();
		

	}

}
