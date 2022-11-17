import java.util.Scanner;

class RanklistPages {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		for(int i=0; i<n; i++) {
			int rank=sc.nextInt();
			if(rank%25==0) {
				System.out.println((rank/25));
			}
			else if(rank%25!=0) {
				System.out.println((rank/25)+1);
			}

		}
		sc.close();
	}

}
