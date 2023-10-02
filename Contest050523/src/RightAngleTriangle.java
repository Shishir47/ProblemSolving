import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class RightAngleTriangle {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		FastScanner fs= new FastScanner();
		int t=fs.nextInt();
		while(t-->0) {
			double a=fs.nextDouble();
			double b=fs.nextDouble();
			double c=fs.nextDouble();
			if((a*a)==(b*b)+(c*c) || (b*b)==(a*a)+(c*c) || (c*c)==(b*b)+(a*a) ) {
				out.println("yes");
			}
			else {
				out.println("no");
			}
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
