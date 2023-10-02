import java.io.PrintWriter;
import java.util.Scanner;

public class CodeforcesChecking1791A {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		Scanner fs= new Scanner (System.in);
		int t=fs.nextInt();
		while(t-->0) {
			String s=fs.next();
			if(("codeforces").contains(s)){
				out.println("Yes");
			}
			else {
				out.println("NO");
			}
		}
		
		out.close();
		fs.close();
		System.gc();
	}

}
