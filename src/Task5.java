import java.util.Scanner;

/*
* ******** write a program to store element in an array and print iit *****
*/
public class Task5
{
    public static void main (String args [])
    {
        Scanner S = new Scanner (System.in);
        System.out.println("Enter The length :");
        int n = S.nextInt();
        int a [] = new int [n];
        System.out.println ("Enter The Number :");
        int i ;
        for (i = 0 ; i < a.length ; i++)
        {
            a[i] = S.nextInt();
        }
        for ( int e : a) {
            System.out.printf("\n"+e);
        }
    }
}
