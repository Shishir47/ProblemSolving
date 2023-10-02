import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class MrPerfectlyFine1829C {
	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		FS fs= new FS();
		int t=fs.nextInt();
		while(t-->0) {
			int n=fs.nextInt();
			int [] min= new int [n];
			int [] skill= new int [n];
			for(int i=0; i<n; i++) {
				min[i]=fs.nextInt();
				skill[i]=fs.nextInt();
			}
			int frCost=Integer.MAX_VALUE;
			int scCost=Integer.MAX_VALUE;
			int bothCost=Integer.MAX_VALUE;
			for(int i=0; i<n; i++) {
				int bitMask=11;
				int bitMask2=10;
				int bitMask3=01;
				if((skill[i]&bitMask)==bitMask) {
					bothCost=Math.min(bothCost,min[i]);
				}
				
				else if((skill[i]&bitMask2)==bitMask2) {
					scCost=Math.min(scCost,min[i]);
				}
				
				else if((skill[i]&bitMask3)==bitMask3) {
					frCost=Math.min(frCost,min[i]);
				}
			}
			if((scCost==Integer.MAX_VALUE || frCost==Integer.MAX_VALUE) && bothCost==Integer.MAX_VALUE) {
				out.println(-1);
			}
			else if((scCost==Integer.MAX_VALUE || frCost==Integer.MAX_VALUE)) {
				out.println(bothCost);
			}
			else if((frCost+scCost)<bothCost ) {
				out.println(frCost+scCost);
			}
			else{
				out.println(bothCost);
			}
		}
		out.flush();
		out.close();
		System.gc();

	}
	static class FS{
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
