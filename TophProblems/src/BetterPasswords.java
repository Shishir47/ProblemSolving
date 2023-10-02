import java.io.PrintWriter;
import java.util.Scanner;

public class BetterPasswords {

	public static void main(String[] args) {
		Scanner fs= new Scanner(System.in);
		PrintWriter out= new PrintWriter(System.out);
		String s= fs.next();
		for(int i=0; i<s.length(); i++) {
			if(i==0) {
				out.print((char)(s.charAt(0)-32));
			}
			else if(s.charAt(i)=='s') {
				out.print('$');
			}
			else if(s.charAt(i)=='i') {
				out.print('!');
			}
			else if(s.charAt(i)=='o') {
				out.print("()");
			}
			else {
				out.print(s.charAt(i));
			}	
		}
		out.print('.');
		
		out.close();
		fs.close();
		System.gc();

	}

}
