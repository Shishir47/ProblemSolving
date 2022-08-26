package testproj;

import java.util.Scanner;

public class GameHour {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int z = sc.nextInt();  //first min
        int y = sc.nextInt();
        int a = sc.nextInt(); //finish min
        int f = 0;
        int j = 0;

        if (x==y && z==a && x==a) {
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        } 
        else {
            if (x>y) {
                j= 24-x+y;
            } 
            else if (x <y) {
                j = 24-(24-y+x);
            }
            if (z>a) {
                f=60+a-z;
                if (x==y) {
                    j =24+j-1;
                } 
                else {
                    j=j-1;
                }
            } 
            else {
                f =a-z;
            }
            System.out.println("O JOGO DUROU " + j + " HORA(S) E " + f + " MINUTO(S)");
        }
        sc.close();
	}

}
