import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
public class ATeam231 {
	public static void main(String []args) {
		Scanner sc= new Scanner(System.in);
		int count=-1;
		String a="Timur";
		char arr[]= a.toCharArray();
		Arrays.sort(arr);
		int n=sc.nextInt();
		for(int j=0; j<n; j++) {
			int g=sc.nextInt();
			String f=sc.nextLine();
			f=sc.nextLine();
			char[]raa=f.toCharArray();
			Arrays.sort(raa);
			if(arr.length==raa.length) {
				for(int i=0;i<arr.length;i++) {
					if(arr[i]!=raa[i]) {
						count=0;
					}
					else if(arr[i]=='T'){
						count=1;
					}
				}
				if(count==1) {
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
	}
}
