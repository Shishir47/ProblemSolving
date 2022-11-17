import java.util.Scanner;

class ChefAndArrayConstruction {
	static Scanner sc=new Scanner(System.in);

	static long power(long b, long n) {
		long s=1;
		while(n>0) {
			if(n%2==1)
				s= (s*b%998244353);
			b=b*b%998244353;
			n/=2;
		}
		return s;
	}
	static long count(long i, int j) {
		return ((i/(1<<(j+1)))<<j)+(Math.max(0l,i%(1<<(j+1))-(1<<j)+1));
	}
	public static void main(String[] args) {
		int test=sc.nextInt();
		for(int k=0; k<test; k++) {
			long n=sc.nextInt();
			long s=0;
			long m = 0;
			for(int i=0; i<31; ++i) {
				s= ((s+(power(count(m,i),n)<<i)%998244353)%998244353);
				
			}
			System.out.println(s);
		}
		
		/*Scanner sc=new Scanner(System.in);
		long cc=sc.nextInt(); 
		for(long c=0; c<cc; c++) {
			long f=sc.nextInt();
			long m=sc.nextInt();
			long n=(long) Math.pow(m, f);
			long count=0;
			for(long i=1; i<n-1; i++) {
				for(long j=1; j<3; j++) {
					count+=i&j;
				}
			}
			count=count%998244353;
			System.out.println(count);
		}
		*/
	}

}
