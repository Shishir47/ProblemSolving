import java.util.Scanner;

public class PoliceRecruits427A {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int pol=0,crime=0;
		for(int i=0; i<n; i++) {
			int a=sc.nextInt();
			if(a==-1 && pol==0) {
				crime++;
			}
			else if(a==-1 && pol>0) {
				pol=pol+a;
				
			}
			else if(a>0){
				pol=pol+a;
			}
		}
		System.out.println(crime);
		sc.close();
		System.gc();

	}

}
