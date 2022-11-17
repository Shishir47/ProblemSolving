import java.util.Scanner;

public class SingleOperations {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();

		for(int i=0; i<n; i++) {
			int s=sc.nextInt();
			sc.nextLine();
			String st=sc.nextLine();
			int count=0;
			char [] arr= st.toCharArray();
			for(int j=0; j<s; j++) {
				if(arr[j]=='1') {
					count++;
				}
				else
					break;
			}
			System.out.println(count);
		}


	}

}
