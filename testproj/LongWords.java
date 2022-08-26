package testproj;
import java.util.Scanner;
public class LongWords {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	String st;
	for(int i=0;i<=n;i++) {
		st=sc.nextLine();
		char []ch=st.toCharArray();
		int s=ch.length;
		if(ch.length>10) {
			System.out.print(ch[0]);
			System.out.print(ch.length-2);
			System.out.println(ch[s-1]);
		}
		else {
			System.out.println(st);
		}
	}
	sc.close();
	}

}
