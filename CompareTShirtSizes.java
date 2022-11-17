
import java.util.Scanner;

class CompareTShirtSizes {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int cnt=0;
		int cnt2=0;
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n; i++) {
			String a=sc.next();
			char []ar= a.toCharArray(); 
			String b= sc.next();
			char[]br= b.toCharArray();
			for(int j=0; j<a.length(); j++) {
				if(ar[j]=='S') {
					cnt=1;
				}
				else if(ar[j]=='L') {
					cnt=3;
				}
				else if(ar[j]=='M') {
					cnt=2;
				}
			}

			for(int j=0; j<b.length(); j++) {
				if(br[j]=='S') {
					cnt2=1;
				}
				else if(br[j]=='L') {
					cnt2=3;
				}
				else if(br[j]=='M') {
					cnt2=2;
				}

			}
			if(cnt>cnt2) {
				System.out.println('>');
			}
			else if(cnt==cnt2) {
				if(cnt==1) {
					if(a.length()>b.length()) {
						System.out.println('<');
					}
					else if(a.length()<b.length()) {
						System.out.println('>');
					}
					else if(a.length()==b.length()){
						System.out.println('=');
					}
				}
				else if(cnt==3 || cnt==2) {
					if(a.length()>b.length()) {
						System.out.println('>');
					}
					else if(a.length()<b.length()) {
						System.out.println('<');
					}
					else if(a.length()==b.length()) {
						System.out.println('=');
					}
				}
			}
			else if(cnt<cnt2) {
				System.out.println('<');
			}
			cnt=0;
			cnt2=0;

		}
		sc.close();
		System.gc();
	}

}
