package testproj;
import java.util.Scanner;
public class Taxi_B {

	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	int n=sc.nextInt();
	int []count= new int [5]; // New Array
	int s=0; 			//s is n inputs
	for(int i=0;i<n;i++) {
		s=sc.nextInt(); //Taking n inputs
		count[s]++;		//count of s is count[s]++
	}
	int total = count[4] + count[3] + count[2] / 2; //4 is 1 group, 3 is one, 2 is one if divided by 2
    count[1]-=count[3]; //count of 1 - count of three
    if (count[2]%2==1) // if 2 is odd
    {
        total+=1; 	//total++
        count[1]-=2; //count of 1 -2
    }
    if (count[1] > 0) //if count of 1 is more than 0
    {
        total+=(count[1]+3)/4; //total= total+(count of 1 +3)/4
    }
    System.out.println(total); //Sysout total;
	sc.close();
	}

}
