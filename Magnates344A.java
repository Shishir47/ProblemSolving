import java.util.Scanner;

public class Magnates344A{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int t=sc.nextInt();
		int count=0;
		int [] arr= new int [t];
		for(int i=0; i<t; i++) {
			arr[i]=sc.nextInt();
			
		}
		for(int i=0; i<t-1; i++) {
			if(arr[i]!=arr[i+1]) {
				count++;
			}
			
		}
		if(count>0) {
			count++;
		}
		if(t==1 ) {
			count=1;
		}
		if(t>1 && count==0) {
			count=1;
		}

		
		System.out.println(count);
		
		sc.close();
	}

}
