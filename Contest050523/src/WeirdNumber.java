import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class WeirdNumber {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		FastScanner fs= new FastScanner();
		int n=fs.nextInt();
		boolean bl=true;
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n%i==0) {
				bl=false;
			}
		}
		if(n==0 || n==1) {
			out.println("\'No\'");
		}
		
		else if(bl || n==2) {
			out.println("\'Yes\'");
		}
		else {
			out.println("\'No\'");
		}
		out.close();
		System.gc();
	}
	static class FastScanner{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer("");
		String next() {
			while(!st.hasMoreTokens()) {
				try {
					st= new StringTokenizer(br.readLine());
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
			return st.nextToken();
		}
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		String nextL() throws IOException {
			return br.readLine();
		}
		double nextDouble() {
			return Double.parseDouble(next());
		}
		
	}
}
