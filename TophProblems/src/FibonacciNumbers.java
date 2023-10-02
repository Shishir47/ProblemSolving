import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.Scanner;

public class FibonacciNumbers {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		Scanner fs= new Scanner(System.in);
		int n=fs.nextInt();
		LinkedList <Integer> lt= new LinkedList<>();
		lt.add(1);
		lt.add(1);
		for(int i=1; i<n; i++) {
			lt.add(lt.get(i)+lt.get(i-1));
		}
		out.println(lt.get(n-1));
		
		out.close();
		fs.close();

	}

}
