import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class InterestingSubArray {
	static void func(int arr[],int g) {
		int count=0;
		for(int j=0; j<g; j++) {
			for(int k=j+1; k<g; k++) {
				if(arr[j]==arr[k]) {
					count++;
				}
			}
		}
		System.out.println(count);
		count=0;
	}
	 /*   static void countFreq(int arr[], int n)
    {
      Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < n; i++)
        {
            if (mp.containsKey(arr[i]))
            {
                mp.put(arr[i], mp.get(arr[i]) + 1);
            }
            else
            {
                mp.put(arr[i], 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : mp.entrySet())
        {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner s= new Scanner(System.in);
		long n=s.nextLong();
		for(int i=0; i<n; i++) {
			int g=s.nextInt();
			int []arr=new int [g];
			for(int j=0; j<g; j++) {
				arr[j]=s.nextInt();
			}
			func(arr,g);			
		}
	}

	}
