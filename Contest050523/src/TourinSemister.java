import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class TourinSemister {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		FastScanner fs= new FastScanner();	
		int t=fs.nextInt();
		BigInteger x= BigInteger.valueOf(4);
		BigInteger temp= BigInteger.valueOf(4);
		while(t-->0) {
			String s=fs.next();
			BigInteger n=new BigInteger(s);
			if(n.mod(temp)!=BigInteger.ZERO) {
				x=temp.subtract((n.mod(temp)));
				out.println(x);
			}
			else {
				out.println(0);
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
					st=new StringTokenizer(br.readLine());
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
		String nextL() throws IOException{
			return br.readLine();
		}
		double nextD() {
			return Double.parseDouble(next());
		}
		
	}
}
