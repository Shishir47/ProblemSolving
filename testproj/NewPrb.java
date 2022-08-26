package testproj;
import java.util.Scanner;
public class NewPrb {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int x,y,sum=0,sum1=0,s2=0,s3=0;
		for(int i=0; i<n; i++) {
			x=sc.nextInt();
			y=sc.nextInt();
			sum=500-(x*2);
			sum1=1000-((y+x)*4);
			s2=1000-(y*4);
			s3=500-((y+x)*2);
			if((sum+sum1)>(s2+s3)) {
				System.out.println(sum+sum1);
			}
			else {
				System.out.println(s2+s3);
			}
		}
	}

}
