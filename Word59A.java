import java.util.Scanner;
public class Word59A {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String st= sc.nextLine();
		char[]ch= st.toCharArray();
		int lc = 0,uc = 0;
		for(int i=0; i<ch.length;i++){
			if(ch[i]>=97) {
				lc++;
			}
			else {
				uc++;
			}
		}
		if(uc>lc) {
			System.out.println(st.toUpperCase());
		}
		else {
			System.out.println(st.toLowerCase());
		}
	sc.close();
	ch=null;
	System.gc();
	}

}
