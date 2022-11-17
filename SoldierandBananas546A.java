import java.util.Scanner;
public class SoldierandBananas546A {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int k=sc.nextInt();
		int n=sc.nextInt();
		int w=sc.nextInt();
		int cnt=0;
		for(int i=1; i<=w; i++) {
			cnt+=i*k;
		}
		if(n>=cnt) {
			System.out.println(0);
		}
		else {
		System.out.println(cnt-n);
		}
		sc.close();
		cnt=0;
		k=0;
		n=0;
		w=0;
		System.gc();
		
	}

}
