import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.StringTokenizer;

public class ExtremelyRound1766A{
	public static int notZero(int n){
		String s=(n+"");
		int size= s.length();
		char [] ch= s.toCharArray();
		char first=ch[0];
		int st=(first-'0');
		return st+(9*size-9);
		
	}
	public static void main(String[] args) {
		PrintWriter out=new PrintWriter(System.out);
		FastScanner fs= new FastScanner();
		int t=fs.nextInt();
	    for(int i=0;i<t;i++){
	        int n, p=0;
	        n=fs.nextInt();
	        out.println(notZero(n));
	    }

		out.flush();
		out.close();
		System.gc();
		
		
		
	}
    public static int primeFactors(int n)
    {
    	int count=0;
        while (n % 2 == 0) {
            n = n/2;
        }
        for (int i = 3; i <= Math.sqrt(n); i=i+2) {
           
            while (n % i == 0) {
                if(i>count) {
                	count=i;
                }
                n = n/i;
            }
        }
        if (n > 2)
            return n;
		return count;
    }

	
	static final Random random=new Random();
	static final int mod=1_000_000_007;
	
	static void ruffleSort(int[] a) {
		int n=a.length;//shuffle, then sort 
		for (int i=0; i<n; i++) {
			int oi=random.nextInt(n), temp=a[oi];
			a[oi]=a[i]; a[i]=temp;
		}
		Arrays.sort(a);
	}
	static long add(long a, long b) {
		return (a+b)%mod;
	}
	static long sub(long a, long b) {
		return ((a-b)%mod+mod)%mod;
	}
	static long mul(long a, long b) {
		return (a*b)%mod;
	}
	static long exp(long base, long exp) {
		if (exp==0) return 1;
		long half=exp(base, exp/2);
		if (exp%2==0) return mul(half, half);
		return mul(half, mul(half, base));
	}
	static long[] factorials=new long[2_000_001];
	static long[] invFactorials=new long[2_000_001];
	static void precompFacts() {
		factorials[0]=invFactorials[0]=1;
		for (int i=1; i<factorials.length; i++) factorials[i]=mul(factorials[i-1], i);
		invFactorials[factorials.length-1]=exp(factorials[factorials.length-1], mod-2);
		for (int i=invFactorials.length-2; i>=0; i--)
			invFactorials[i]=mul(invFactorials[i+1], i+1);
	}
	
	static long nCk(int n, int k) {
		return mul(factorials[n], mul(invFactorials[k], invFactorials[n-k]));
	}
	
	static void sort(int[] a) {
		ArrayList<Integer> l=new ArrayList<>();
		for (int i:a) l.add(i);
		Collections.sort(l);
		for (int i=0; i<a.length; i++) a[i]=l.get(i);
	}
	
	//Fast Scanner
    static class FastScanner {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=new StringTokenizer("");
		String next() {
			while (!st.hasMoreTokens())
				try { 
					st=new StringTokenizer(br.readLine());				               
				} catch (IOException e) {}
			return st.nextToken();
		}
		
		int nextInt() {
			return Integer.parseInt(next());
		}
		long nextLong() {
			return Long.parseLong(next());
		}
		String nextL() throws IOException {
			return br.readLine();
		}
    }
    

} 