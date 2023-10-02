import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
public class MutualFriend {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		FastScanner fs= new FastScanner();
		QuickFind qf= new QuickFind(100);
		int n=fs.nextInt(); 
		for(int i=0; i<n; i++) {
			qf.union(fs.nextInt(), fs.nextInt());
		}
		if(qf.connected(fs.nextInt(),fs.nextInt())) {
			out.println("\"Yes\"");
		}
		else {
			out.println("\"No\"");
		}
		out.close();
		System.gc();
	}
	//n, 1 (union and find) initialize n
	static class QuickFind {
		private int [] id;
		QuickFind(int n){
			id= new int[n];
			for(int i=0; i<n; i++) {
				id[i]=i;
			}
		}
		public boolean connected(int p, int q) {
			return id[p]==id[q];
		}
		public void union(int p, int q) {
			int pid=id[p];
			int qid=id[q];
			for(int i=0; i<id.length; i++) {
				if(id[i]==pid) {
					id[i]=qid;
				}
			}
		}
		
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
