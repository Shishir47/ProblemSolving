import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class ProblemB {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		FastScanner fs= new FastScanner();
		int m=fs.nextInt();
		int n=fs.nextInt();
		int [] arr= new int [n+1];
		for(int i=0; i<n; i++) {
			arr[i]=0;
		}
		for(int i=1; i<=m; i++) {
			for(int j=i; j<=n; j+=i) {
				if(arr[j]==0) {
					arr[j]=1;
				}
				else {
					arr[j]=0;
				}
			}
		}
		long count=0;
		for(int i=0; i<=n; i++) {
			if(arr[i]==1) {
				count=count+i;
			}
		}
		out.println(count);
		
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
