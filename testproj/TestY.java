package testproj;
import java.util.Scanner;
public class TestY {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		for(int i=0; i<n; i++) {
			int p= sc.nextInt();
			if(p/100>=0) {
				count=p/100;
			}
			int c=p%100;
			if(count+c>10) {
				System.out.println(-1);
			}
			else {
				System.out.println(count+c);
			}
		}
	}

}
