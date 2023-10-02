import java.io.PrintWriter;
import java.util.Scanner;

public class FollowingDirections1791B {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		Scanner fs= new Scanner(System.in);
		int t=fs.nextInt();
		while(t-->0) {
			int n=fs.nextInt();
			String s=fs.next();
			int a=0,b=0;
			boolean c=false;
			char [] ch= s.toCharArray();
			for(int i=0; i<n; i++) {
				if(ch[i]=='U') {
					a++;
					
				}
				else if(ch[i]=='D') {
					a--;
				}
				else if(ch[i]=='R') {
					b++;
				}
				if(ch[i]=='L') {
					b--;
				}
				if(a==1 && b==1) {
					c=true;
				}
			}
			if(c) {
				out.println("Yes");
			}
			else {
				out.println("No");
			}
			
			
		}
		
		
		out.close();
		fs.close();
		System.gc();

	}

}
