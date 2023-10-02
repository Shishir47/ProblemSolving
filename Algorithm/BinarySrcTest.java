
public class BinarySrcTest {

	public static void main(String[] args) {
		int [] arr= {-10,10,20,25,30,45,50};
		int src=30;
		int first=0, last=arr.length-1;
		int mid=(first+last)/2;
		
		while(first<=last) {
			if(arr[mid]>src) {
				last=mid-1;
			}
			else if(arr[mid]==src) {
				System.out.println("Item found at index: "+ mid);
				break;
			}
			else {
				first=mid+1;
			}
			mid=(first+last)/2;
		}	
		if(first>last) {
				System.out.println("Not found!");
			}
	}

}

