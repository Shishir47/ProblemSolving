import java.util.Scanner;
public class Garage {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		int b=0,a=0,c=0;
		for(int i=0; i>=0; i++) {
			a=c;
			b=c+1;
			c=a+b;
			count++;
			if(count==n) {
				count=a+b;
				break;
			}
			
		}
		System.out.println(count);

	}

}
