import java.util.Scanner;
import java.io.IOException;
public class BearandBigBrother791A {

	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int count=0;
		for(int i=0; a<=b; i++) {
			a=a*3;
			b=b*2;
			count++;
		}
			System.out.println(count);
		sc.close();
	}

}
