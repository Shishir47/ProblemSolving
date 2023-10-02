import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CaesarCipher {

	public static void main(String[] args) throws IOException{
		Scanner fs= new Scanner (System.in);
		PrintWriter out= new PrintWriter(System.out);
		out.println((int)'z');
		int n=fs.nextInt();
		fs.nextLine();
		String s=fs.nextLine();
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ') {
				out.print(' ');
			}
			else if((int)(s.charAt(i)-n)<97) {
				int sum=97-(s.charAt(i)-n);
				out.print((char)(123-sum));
			}
			else {
				out.print((char)(s.charAt(i)-n));
			}
		}
		out.println();
		out.close();
		fs.close();
		System.gc();

	}

}
