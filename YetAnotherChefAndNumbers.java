import java.util.*;
import java.io.*;
class YetAnotherChefAndNumbers {

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		int count=0,div=1,cn=0;
		try {
		for(int i=a+1; i<=b; i++) {
				if(i>9) {
				String f=String.valueOf(i);
				char[]arr= f.toCharArray();
				f=null;
				cn=1;
				if(arr[arr.length-cn]=='0') {
					count++;
					cn++;
				}
				else {
					for(int j=0; j<arr.length; j++) {
						int v=Integer.parseInt(String.valueOf(arr[j]));
						div*=(int)v;
					}
					arr=null;
					String s=String.valueOf(div);
					char[]arr2= s.toCharArray();
					s=null;
					for(int fg=1; fg<arr2.length;fg++) {
						if(arr2[arr2.length-fg]=='0') {
							count++;
						}
					}
					arr2=null;
					div=1;
				}
			}

		}
		System.gc();
		}catch(Exception e) {
			System.out.println(count);
		}
		System.out.println(count);

	}

}
