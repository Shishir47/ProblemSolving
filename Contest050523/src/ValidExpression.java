import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
public class ValidExpression {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		FastScanner fs= new FastScanner();
		int t=fs.nextInt();
		while(t-->0) {
			String s=fs.next();
			int n=fs.nextInt();
			int count=0;
			int pount=0;
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)=='1') {
					count++;
					pount--;
				}
			}
			if(count>=n && n>0 ) {
				out.println("yes");
			}
			else if(count<=n && n<0) {
				out.println("yes");
			}
			else {
				out.println("no");
			}
		}
		out.close();
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
