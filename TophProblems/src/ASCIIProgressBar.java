import java.io.PrintWriter;
import java.util.Scanner;

public class ASCIIProgressBar {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		Scanner fs= new Scanner (System.in);
		int n=(int)Math.floor(fs.nextDouble());
		out.print('[');
		int a=(int)Math.floor(n/10);
		int b=10-(n/10);
		for(int i=0; i<a; i++) {
			out.print('+');
		}
		for(int i=0; i<b; i++) {
			out.print('.');
		}
		out.print("] "+n+'%');
		
		out.close();
		fs.close();
		System.gc();

	}

}
