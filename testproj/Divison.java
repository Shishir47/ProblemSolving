package testproj;
import java.util.Scanner;
public class Divison {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		for(int i=0; i<num;i++) {
			int inp=sc.nextInt();
			if(inp<=1399) {
				System.out.println("Division "+4);
			}
			else if(inp>=1400 && inp<=1599) {
				System.out.println("Division "+3);
			}
			else if(inp>=1600 && inp<=1899) {
				System.out.println("Division "+2);	
			}
			else if(inp>=1900) {
				System.out.println("Division "+1);
			}
		}
		sc.close();
	}

}
