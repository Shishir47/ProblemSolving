import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class TrackingTags {

	public static void main(String[] args) throws IOException {
		PrintWriter out= new PrintWriter(System.out);
		FastScanner fs= new FastScanner();
		int t=fs.nextInt();
		while(t-->0) {
			String s=fs.nextL();
			int beg=0;
			String [] arr=s.split("-");
			HashSet <String> hs= new HashSet<>();
			for(int i=0; i<arr.length; i++) {
				hs.add(arr[i]);
			}
			int [] total= new int [hs.size()];
			Iterator<String> it= hs.iterator();
			while(it.hasNext()) {
				String st=it.next();
				int j=0;
				for(int i=0; i<arr.length; i++) {
					if(st==arr[i]) {
						total[j]++;
					}
				}
				j++;
			}
			Iterator <String>lit= hs.iterator();
			int j=0;
			while(lit.hasNext()) {
				out.print(lit.next());
				out.print('-');
				out.print(total[j]);
				out.println();
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
