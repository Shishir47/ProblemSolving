import java.util.Scanner;
public class HelpfulMaths {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char [] arr= new char [100];
		String s= sc.nextLine(); 		sc.close();
		arr=s.toCharArray();
		char temp;
        int n = arr.length;
        int f=(int)'+';
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                	if (arr[j] > arr[j + 1]) {
	                    temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
                	}
            }
        }
        int count=0,cnt=0;
        char []arr2= new char[n/2];
        char []arr3= new char[(n/2)+1];
        for (int i = 0; i < n; ++i) {
            if(arr[i]==f) {
            	arr2[count]=arr[i];
            	count++;
            }
            else {
            	arr3[cnt]=arr[i];
            	cnt++;
            }
        }
        arr=null;
        count=0;
        cnt=0;
        for(int i=0; i<(n/2)+1; i++) {
        	if(i==(n/2+1)-1) {
            	System.out.print(arr3[i]);
        	}
        	else {
	        	System.out.print(arr3[i]);
	        	System.out.print(arr2[i]);
        	}

        }
        System.gc();
	}
}