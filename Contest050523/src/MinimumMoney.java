import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Iterator;
import java.util.StringTokenizer;

public class MinimumMoney {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		FastScanner fs= new FastScanner();
		int t=fs.nextInt();
		
		while(t-->0) {
			HashSet<Integer> hs= new HashSet<>();
			int n=fs.nextInt();
			while(n-->0) {
				hs.add(fs.nextInt());
			}
			Iterator<Integer> it= hs.iterator();
			int sum=0;
			while(it.hasNext()) {
				sum+=it.next();
			}
			out.println(sum);
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
