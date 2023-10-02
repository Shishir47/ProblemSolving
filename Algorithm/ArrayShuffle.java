import java.util.Arrays;

public class ArrayShuffle{

	public static void main(String[] args) {
		int [] arr= {1,5,3,2,7,9};
		for(int i : arr) {
			int x=(int) (Math.random()*arr.length);
			int y=(int) (Math.random()*arr.length);
			int temp=arr[x];
			arr[x]=arr[y];
			arr[y]=temp;
		}
		System.out.println(Arrays.toString(arr));
	}

}
