import java.util.Scanner;
public class ANextRound158 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int count=0;
		int n=sc.nextInt();
		int k=sc.nextInt();
		int [] arr= new int [100];
		for(int i=1; i<=n; i++) {
			arr[i]=sc.nextInt();
		}
		for(int i=1; i<=n; i++) {
			if(arr[i]>=arr[k] && arr[i]>0) {
				count++;
			}
		}
		System.out.println(count);
	}

}
