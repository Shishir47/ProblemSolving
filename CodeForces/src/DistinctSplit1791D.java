import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Scanner;

public class DistinctSplit1791D {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		Scanner fs= new Scanner(System.in);
		int t=fs.nextInt();
		while(t-->0) {
			int n=fs.nextInt();
			String s=fs.next();
			HashSet<Character> hs=new HashSet<>();
			int front[]=new int[n];
			int back[]=new int[n];
			for(int i=0;i<n-1;i++) 
			{
				hs.add(s.charAt(i));
				front[i]=hs.size();
			}
			hs=new HashSet<>();
			for(int i=n-1;i>=1;i--) 
			{
				hs.add(s.charAt(i));
				back[i-1]=hs.size();
			}
			int max=0;
			for(int i=0;i<n-1;i++) 
			{
				max=Math.max(max,front[i]+back[i]);
			}
			out.println(max);
		}
		
		
		out.close();
		fs.close();
		System.gc();

	}

}
