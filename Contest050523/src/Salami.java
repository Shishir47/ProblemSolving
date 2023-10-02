import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Salami {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		FastScanner fs= new FastScanner();
		long a=fs.nextInt(),b=fs.nextInt(),x=fs.nextInt(),y=fs.nextInt();
		long max=Long.MAX_VALUE;
		long r=0,s=0,last=0;
		for(int i=1;i<max; i++) {
			if(i%x!=0 && a!=0) {
				a--;
			}
			else if(i%y!=0 && b!=0) {
				b--;
			}
			if(a==0 && b==0) {
				last=i;
				break;
			}
			
		}
		out.println(last);
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
