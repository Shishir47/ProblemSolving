import java.util.HashSet;
import java.util.Scanner;

public class BeautifulYearA271 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		HashSet<Character> hs= new HashSet<Character>();
		int n=sc.nextInt();
		int c=n;
		int count=0;
		boolean tr=false;
		while(tr==false) {
			c++;
			String sn=(""+c);
			char [] arr=sn.toCharArray();
			for(int j=0; j<arr.length; j++) {
				hs.add(arr[j]);
			}
			if(hs.size()==arr.length) {
				count=c;
				tr=true;
			}
			hs.clear();
		}
		System.out.println(count);
		
		sc.close();
		System.gc();
	}

}
