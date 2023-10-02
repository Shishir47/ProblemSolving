import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.StringTokenizer;
public class Fulfillmoney {
//2,5,10,20,50,100,200,500,1000
	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		FastScanner fs= new FastScanner();
		int t=fs.nextInt();
		while(t-->0) {
			String s=fs.next();
			BigInteger n=new BigInteger(s);
			BigInteger zero=BigInteger.valueOf(0), a=BigInteger.valueOf(100),b=BigInteger.valueOf(50),c= BigInteger.valueOf(20),d= BigInteger.valueOf(10),e=BigInteger.valueOf(5),f=BigInteger.valueOf(2);
			BigInteger x,y,z,m,g,h;
			if(n.compareTo(a)==1 || n.compareTo(a)==0 ) {
				x=n.divide(a);
				n=n.mod(a);
			}
			if(n.compareTo(b)==1 || n.compareTo(b)==0 ) {
				y=n.divide(b);
				n=n.mod(b);
			}
			if(n.compareTo(c)==1 || n.compareTo(c)==0 ) {
			z=n.divide(c);
			n=n.mod(c);
			}
			m=n.divide(d);
			n=n.mod(d);
			g=n.divide(e);
			n=n.mod(e);
			h=n.divide(f);
			n=n.mod(f);
			if(n==BigInteger.valueOf(0)) {
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
