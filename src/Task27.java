import java.util.Arrays;
import java.util.Scanner;

/*
*  write  aprogram that identifies the odd Element in tow array annd creates a third with
 *  those element
*/
public class Task27
{
    public static void main (String args [])
    {
        Scanner S = new Scanner (System.in);
        System.out.println ("Enter The Array Element :");
        int l = S.nextInt();
        int a [] = new int [l];
        System.out.println ("Enter The Frist Array Element :");
        int i ;
        for (i = 0 ; i < a.length ; i++)
        {
            System.out.printf("a[%d] = ",i);
            a[i] = S.nextInt();
        }
        System.out.println ("Enter The Second Array Elements :");
        int b[] = new int [l];
        for (i = 0 ; i < b.length ; i++)
        {
            System.out.printf ("a[%d] = " ,i);
            b[i] = S.nextInt();
        }
        int c[] = new int [l];
        for (i = 0 ; i < c.length ; i++)
        {
            if (a[i] %2 != 0)
            {
                c[i] = a[i];
            }
            if (b[i] %2 != 0)
            {
                c[i] = b[i];
            }
        }
        System.out.println ("The Frist Array :"+Arrays.toString(a));
        System.out.println ("The Second Array :"+Arrays.toString(b));
        Arrays.sort(c);
        System.out.println("The Odd Number of Store in Third Array :"+Arrays.toString(c));
    }
}
