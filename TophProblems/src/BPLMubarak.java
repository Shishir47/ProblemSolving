import java.io.PrintWriter;
import java.util.Scanner;

public class BPLMubarak {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		Scanner fs= new Scanner (System.in);
		int t=fs.nextInt();
		while(t-->0) {
			int count=0;
			String s=fs.next();
			for(int i=0; i<s.length(); i++) {
				if((s.charAt(i)>='0' && s.charAt(i)<='6')|| s.charAt(i)=='O') {
					count++;
				}
			}
			if(count/6!=0) {
				if(count/6==1) {
					out.print(1+" OVER ");
				}
				else {
					out.print((count/6)+" OVERS ");
				}
			}
			if(count%6!=0) {
				if(count%6==1) {
					out.print(1+" BALL");
				}
				else {
					out.print(count%6+" BALLS");
				}
			}
			out.println();
		}
		
		out.close();
		fs.close();
		System.gc();

	}

}
