import java.util.Scanner;
public class HoverCraft {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		float l,w,z,i=1;
		while(i>0) {
			l= sc.nextInt();
			w= sc.nextInt();
			if(l==0 && w==0) {
				break;
			}
			else {
			z=(w+l)-(l/4);
			System.out.printf("%.4f",z);
			System.out.println();
			}
		}

	}

}
