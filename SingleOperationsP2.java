import java.util.Scanner;
class SingleOperationsP2 {
 
	public static void main(String[] args) throws java.lang.Exception{
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();

		for(int i=0; i<n; i++) {
			int s=sc.nextInt();
			sc.nextLine();
			String st=sc.nextLine();
			int count=0;
			char [] arr= st.toCharArray();
			for(int j=0; j<s; j++) {
				count++;
				if(j==s-1) {
					break;
				}
				else {
					if(arr[j+1]=='1') {
						break;
					}
				}
			}
			System.out.println(count);
		}

	}

}
