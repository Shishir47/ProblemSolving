/*There are N children in AtCoder Kindergarten. Mr. Evi will arrange the children in a line,
then give 1 candy to the first child in the line, 2 candies to the second child, ..., N candies to the N-th child.
How many candies will be necessary in total?*/
public class KinterGarden{
    public static void main(String[]args){
        int i=1,s=0;
        int n=3;
        for (i=1;i<=n;i++){
           s=s+i;
        }
        System.out.println(s);
    }
}