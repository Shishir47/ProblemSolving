import java.util.Arrays;
import java.util.Scanner;
public class SmartPhone {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int [] arr=new int[n];
		long v=0;
		for(int i=0; i<n; i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0; i<n; i++) {
			if((i+1)==n) {
				break;
			}
			else {
				if((arr[i]*(n-i))>(arr[i+1]*(n-i))) {
					if(arr[i]*(n-i)>v) {
						v=arr[i]*(n-i);
					}
				}
				else {
					if(arr[i]*(n-i)>v) {
						v=arr[i]*(n-i);
					}
				}
			}
		}
		if(arr[n-1]>v) {
			System.out.println(arr[n-1]);
		}
		else {
		System.out.println(v);
		}
	}

}
