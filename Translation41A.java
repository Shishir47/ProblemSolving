import java.util.Scanner;

public class Translation41A {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String s=sc.nextLine();
		String r=sc.nextLine();
		char [] arr = s.toCharArray();
		char [] rr=r.toCharArray();
		boolean tr=false;
		if(arr.length==1 && arr[0]==rr[0]) {
			tr=true;
		}
		else {
			int j=0;
			for(int i=arr.length-1; i>0; i--) {
	
	
					if(arr[i]!=rr[j]) {
						tr=false;
						break;
					}
					else {
						tr=true;
					}
					j++;
			}
		}
		if(tr)
		System.out.println("YES");
		else
		System.out.println("NO");
		sc.close();
		System.gc();
	}

}
