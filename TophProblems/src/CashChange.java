import java.io.PrintWriter;
import java.util.Scanner;

public class CashChange {

	public static void main(String[] args) {
		PrintWriter out= new PrintWriter(System.out);
		Scanner fs= new Scanner(System.in);
		int n=fs.nextInt();
		int rem=n;
		int fhun=rem/500;
		int hun=(rem-(fhun*500))/100;
		//int hun=rem/100;
		rem=n%100;
		int fifty=rem/50;
		int ten=(rem-(fifty*50))/10;
		rem=n%10;
		int five=rem/5;
		int one=(rem-(five*5))/1;
		if(one!=0) {
			for(int i=0; i<one; i++) {
				out.print(1+" ");
			}
		}
		if(five!=0) {
			for(int i=0; i<five; i++) {
				out.print(5+" ");
			}
		}
		if(ten!=0) {
			for(int i=0; i<ten; i++) {
				out.print(10+" ");
			}
		}
		if(fifty!=0) {
			for(int i=0; i<fifty; i++) {
				out.print(50+" ");
			}
		}
		if(hun!=0) {
			for(int i=0; i<hun; i++) {
				out.print(100+" ");
			}
		}
		if(fhun!=0) {
			for(int i=0; i<fhun; i++) {
				out.print(500+" ");
			}
		}
		fs.close();
		out.close();
		System.gc();
	}

}
