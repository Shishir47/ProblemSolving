import java.io.PrintWriter;
import java.util.Scanner;

public class UVA12468 {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		Scanner fs= new Scanner(System.in);
		while(fs.hasNext()) {
			int a=fs.nextInt();
			int b=fs.nextInt();
			if(a==-1 && b==-1) {
				break;
			}
			else if(a==0) {
				a=100+a;
			}
			
			out.println(Math.min(Math.abs(b-a), Math.abs(a-b)));
		}
		fs.close();
		out.close();
		System.gc();

	}

}
