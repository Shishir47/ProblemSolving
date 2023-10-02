import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class MaximizeRevenue2 {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		FS fs= new FS();
		int t=fs.nextInt();
		LinkedList<String> lt = new LinkedList<>();
		LinkedList<Integer> data = new LinkedList<>();
		LinkedList<String> dt = new LinkedList<>();
		while(t-->0) {
			lt.add(fs.next());
			String s=fs.next().substring(1);
			dt.add(s);
			data.add(Integer.parseInt(s));
		}
		int big=0;
		String f = null;
		String mon = null;
		for(int i=0; i<data.size(); i++) {
			if(data.get(i)>=big) {
				f="$"+dt.get(i);
				mon=lt.get(i);
				big=data.get(i);
			}
		}
		out.println(mon+" "+f);
		out.close();
		System.gc();
	}
	static class FS{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st= new StringTokenizer("");
		String next() {
			while(!st.hasMoreTokens()) {
				try {
					st= new StringTokenizer(br.readLine());
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
		
	}

}
