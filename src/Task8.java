import java.util.Scanner;

/*
*  Write a program in to read n number of values in an array and display it in reverse order
*/
public class Task8
{
    public static void main (String args [])
    {
        Scanner S = new Scanner (System.in);
        System.out.println ("Enter The Size :");
        int siz = S.nextInt();
        int a [] = new int [siz];
        int rev = 0 ;
        int i;
        System.out.println ("Enter The Element :");
        for (i = 0 ; i < a.length ; i++)
        {
            a[i] = S.nextInt();
        }
        System.out.println("Revers Of Array Element :");
        for ( int j = (siz -1) ; j > 0 ; j--)
        {
            System.out.println(a[j]);
        }
    }
}
