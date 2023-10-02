import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ProblemA {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		FastScanner fs= new FastScanner();
		int t=fs.nextInt();
		for(int i=1; i<=t; i++) {
			int n=fs.nextInt();
			char [] [] arr= new char [n][n];
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
						arr[j][k]=fs.next().charAt(0);
					
				}
			}
			int count=0;
			for(int j=0; j<n; j++) {
				for(int k=0; k<n; k++) {
					if(arr[j][k]=='I') {
						if((j<n-2) && (k<n-2) ) {
							
						}
						else {
							if((j+2<n)) {
								if  (arr[j+1][k]=='C' ||  arr[j+1][k]=='*'){
									if(arr[j+2][k]=='T') {
										count++;
									}
								}
							}
							if(k+2<n) {
								if(arr[j][k+1]=='C' || arr[j][k+1]=='*') {
									if(arr[j][k+2]=='T') {
										count++;
									}
								}
							}
						}
						
					}
				}
			}
			out.println("Case "+i+": "+count);
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
