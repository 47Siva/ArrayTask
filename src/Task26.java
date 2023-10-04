import java.util.Arrays;
import java.util.Scanner;

/*
* write  aprogram that identifies the Even Element in tow array annd creates a third with
*  those element
*/
public class Task26
{
    public static void main (String args [])
    {
        Scanner S = new Scanner(System.in);
        System.out.println ("Enter The Array length :");
        int l = S.nextInt();
        int a [] = new int [l];
        int i ;
        System.out.println ("Enter The frist Array Element :");
        for (i = 0 ; i < a.length ; i++)
        {
            System.out.printf ("a[%d] = ",i);
            a[i] = S.nextInt();
        }
        System.out.println ( "Enter The Second Array Element :");
        int b [] = new int [l];
        for ( i = 0 ; i < b.length ; i++)
        {
            System.out.printf ("b[%d] = ",i);
            b[i] = S.nextInt();
        }
        System.out.println ("The Friest Array :"+ Arrays.toString(a));
        System.out.println("The Second Array  :"+ Arrays.toString(b));
        int c [] = new int [l];
        for (i = 0; i < c.length ; i++)
        {
            if (a[i] %2 == 0)
            {
                System.out.print (a[i]);
                c[i] = a[i];
            }
            if (b[i] %2 == 0)
            {
                System.out.print (b[i]);
                c[i] = b[i];
            }
        }
        Arrays.sort(c);
        System.out.println ("The Even Numbers of Store in  Third Array :"+Arrays.toString(c));
    }
}
