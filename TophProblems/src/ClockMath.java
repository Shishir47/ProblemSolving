import java.io.PrintWriter;
import java.util.Scanner;

public class ClockMath {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		Scanner fs= new Scanner(System.in);
		double a=fs.nextInt();
		double b=fs.nextInt();
		a=Math.abs((a*30)-(b*5.5));
		if(a>180) {
			out.println(360-a);
		}
		else
			out.println(a);
		out.close();
		fs.close();
	}

}
