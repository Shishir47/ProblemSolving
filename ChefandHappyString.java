import java.util.Scanner;
class ChefandHappyString {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0; i<n; i++) {
			String st=sc.nextLine();
			int count=0;
			for(int j=0; j<st.length()-2; j++) {
				if((st.charAt(j)=='a' || st.charAt(j)=='e' || st.charAt(j)=='i'  || st.charAt(j)=='o' || st.charAt(j)=='u' ) && (st.charAt(j+1)=='a' || st.charAt(j+1)=='e' || st.charAt(j+1)=='i'  || st.charAt(j+1)=='o' || st.charAt(j+1)=='u' ) && (st.charAt(j+2)=='a' || st.charAt(j+2)=='e' || st.charAt(j+2)=='i'  || st.charAt(j+2)=='o' || st.charAt(j+2)=='u' )) {
					count++;
				}
			}
			if(count>0) {
				System.out.println("Happy");
			}
			else {
				System.out.println("SAD");
			}
			
		}
		sc.close();

	}

}
