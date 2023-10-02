import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class ByangsAdditions {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		Scanner fs= new Scanner(System.in);
		String a=fs.next();
		String b=fs.next();
		boolean isit=false;
		LinkedList <Integer> fr= new LinkedList<>();
		LinkedList <Integer> sc= new LinkedList<>();
		for(int i=0; i<a.length(); i++) {
			fr.add((int)(a.charAt(i)-48));
		}
		for(int i=0; i<b.length(); i++) {
			sc.add((int)(b.charAt(i)-48));
		}
		for(int i=0; i<(Math.min(a.length(), b.length())); i++) {
			if((fr.pollLast())+(sc.pollLast())>9) {
				isit=true;
				break;
			}
			
		}
		if(isit) {
			out.println("Yes");
		}
		else {
			out.println("No");
		}
		out.close();
		fs.close();
		System.gc();

	}

}
