
import java.util.Scanner;

class BinarySubstituition {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		long n=sc.nextInt();
		sc.nextLine();
		for(long j=0; j<n;j++) {
			String s= sc.nextLine();
			char [] arr= s.toCharArray();
			int f=arr.length;
			int [] fib= new int [f+1];
			fib[f]=1;
			fib[f-1]=1;
			for(int i=f-2; i>=0 ; i--) {
				if(arr[i]!=arr[i+1]) {
					fib[i]= (fib[i+1]+fib[i+2])%998244353;
				}
				else {
					fib[i]=fib[i+1]%998244353;
				}

			}
			System.out.println(fib[0]);
		}

	}

}
