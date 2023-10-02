import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorials {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		Scanner fs= new Scanner (System.in);
		BigInteger sum= BigInteger.ONE;
		int n=fs.nextInt();
		for(int i=n; i>0; i--) {
			
			sum=sum.multiply(BigInteger.valueOf(i));
		}
		String s=sum.toString();
		int t= s.length();
		if(s.length()>4) {
			out.println(s.substring(t-4,t));
		}
		else {
			out.println(s);
		}
		out.close();
		fs.close();
		System.gc();

	}

}
