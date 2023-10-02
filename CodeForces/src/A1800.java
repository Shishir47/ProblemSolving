import java.io.PrintWriter;
import java.util.Scanner;
import java.util.Stack;

public class A1800 {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		Scanner fs= new Scanner (System.in);
		int t  = fs.nextInt();
		while (t -- > 0){
			int n = fs.nextInt();
			String s = fs.next().toLowerCase();
			Stack<Character> stack = new Stack<>();
			stack.push(s.charAt(0));
			for(int i = 0 ; i < n ; i++) {
				if(stack.peek() != s.charAt(i))
					stack.push(s.charAt(i));
			}
			out.println(stack.toString().equals("[m, e, o, w]")?"YES":"NO");
		}
		out.close();
		fs.close();
		System.gc();

	}

}
