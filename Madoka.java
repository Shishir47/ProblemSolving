
public class Madoka {

	public static void main(String[] args) {
		int n=6;
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				for(int k=1; k<=n; k++) {
				if(i+j+k==n) {
					/*System.out.println(i+" "+j);
					ara[i]=i;
					arb[i]=j;
				}*/
					if(i<=j && j<=k) {
					if(i+j>=k) {
						System.out.println(i+" "+j+" "+k);
					}
					
					}
				}
				}
			}
		}

	}

}
