package testproj;
import java.util.*;

public class hello {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int tot=sc.nextInt();
		for(int i=0; i<tot;i++) {
		String target= sc.next();
		char []tar= target.toCharArray();
		char b=target.charAt(0);
		int taru=tar.length;
		if(taru==1) {
		System.out.println("NO");
		}
		else {
		char c=target.charAt(tar.length-1);
		char d=target.charAt(tar.length-2);

		if(b=='A') {

			if(d=='A') {
			if(c=='B') {
			System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			}
			else {
				System.out.println("NO");
		}
		}
		else {
			System.out.println("NO");
		}
		}
		}
		sc.close();
	}
}