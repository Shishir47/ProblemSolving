
public class MaxNum {

	public static void main(String[] args) {
		int n=99999999;
		long [] arr= new long [n];
		for(int i=0; i<n; i++) {
			arr[i]= ((long) Math.random()+1)*(n*2);
		}
		long count=0;
		for(int i=0; i<n; i++) {
			if(arr[i]>count) {
				count=arr[i];
			}
		}
		System.out.println(count);
	}

}
