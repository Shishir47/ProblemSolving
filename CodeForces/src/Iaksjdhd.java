import java.util.Scanner;
import java.util.Vector;

public class Iaksjdhd {
	
	Vector<Integer> applyPermutation(Vector<Integer> sequence, Vector<Integer> permutation) {
	    Vector<Integer> newSequence= new Vector(sequence.size());
	    for(int i = 0; i < sequence.size(); i++) {
	        newSequence.set(i, sequence.get(permutation.get(i)));
	    }
	    return newSequence;
	}

	Vector<Integer> permute(Vector<Integer> sequence, Vector<Integer> permutation, long b) {
	    while (b > 0) {
	        if ((b & 1)!=0) {
	            sequence = applyPermutation(sequence, permutation);
	        }
	        permutation = applyPermutation(permutation, permutation);
	        b >>= 1;
	    }
	    return sequence;
	}
	static long binpow(long a, long b) {
	    long res = 1;
	    while (b > 0) {
	        if ((b & 1)!=0)
	            res = res * a;
	        a = a * a;
	        b >>= 1;
	    }
	    return res;
	}

	public static void main(String[] args) {
		Scanner fs= new Scanner(System.in);
		int n=fs.nextInt();
		System.out.println(binpow(n,n)-3);

	}

}
