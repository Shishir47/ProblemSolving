package testproj;
import java.util.Arrays;
import java.util.Scanner;
public class BoyorGirl {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
			String s= sc.nextLine();
			int count=1;
			char [] wo= s.toCharArray();
			Arrays.sort(wo);
		for(int i=1;i<wo.length;i++) {
			if(wo[i-1]!=wo[i]) {
				++count;
			}
		}
		char c='h';
		s=Character.toString(c);
		if(count%2==0) {
			System.out.println("CHAT WITH HER!");
		}
		else {
			System.out.println("IGNORE HIM!");
		}
		sc.close();
	}

}
