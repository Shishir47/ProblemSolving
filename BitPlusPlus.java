import java.util.Scanner;
public class BitPlusPlus {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		String f = null;
		
		boolean m=false;
		int count=0;
		for(int i=0; i<n; i++) {
			sc.nextLine();
			f=sc.next();
			char []arr= f.toCharArray();
			for(int j=0; j<arr.length; j++) {
				if(arr[0]=='+') {
					m=true;	
				}
				else if( arr[arr.length-1]=='+') {
					m=true;
				}
				else {
				m=false;	
				}
				
			}
			if(m) {
				count++;
			}
			else {
				count--;
			}
		}
		System.out.println(count);

	}

}
