import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NearlyLuckyNumber110A {

	public static void main(String[] args) {
		Map <Integer,Character> hm = new HashMap<>();
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		int count=0;
		char [] arr= n.toCharArray();
		hm.put(0,arr[0]);
		for(int i=0; i<arr.length; i++) {
            if (arr[i]=='4' || arr[i]=='7')
            {
                hm.put(i,arr[i]);
                count++;
            }
            else {
                hm.put(i,arr[i]);
            }
		}
		if((count==4 ||count==7) && (hm.containsValue('4')||hm.containsValue('7'))) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
		sc.close();
		System.gc();
	}
}
