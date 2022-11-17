import java.util.HashSet;
import java.util.Scanner;

class fun<E>{
	E func(int n, int [] arr) {
		HashSet <Integer> hs= new <Integer> HashSet();
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr.length;j++) {
				if(arr[i]+arr[j]==n) {
					hs.add(arr[i]);
					hs.add(arr[j]);
				}
			}
		}
		return (E) hs.toString();
		
	}

	String Set(int n, int [] arr) {
	for(int i=0; i<arr.length; i++) {
		for(int j=0; j<arr.length;j++) {
			if(arr[i]+arr[j]==n) {
				return arr[i]+" "+arr[j];
			}
		}
	}
	return null;
	}
}

public class SumOfTwo{

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		int [] arr= {1,2,3,4,7,9,11};
		int n=sc.nextInt();
		fun <String> fn= new<String> fun();
		String obj= fn.func(n,arr);
		System.out.println("The Set of Numbers Which equals to Sum is: "+ fn.func(n, arr));
		
		System.out.println("Two Number that has Sum "+n+" is: "+fn.Set(n, arr));

	}

}
