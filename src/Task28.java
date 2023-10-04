import java.util.Arrays;
import java.util.Scanner;

/*
* write a poragram to find the common element betwen two arrays of integers *********
*/
public class Task28
{
    public static void main (String args [])
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter The Array length :");
        int l = S.nextInt();
        int a [] = new int [l];
        System.out.println ("Enter the frist Array elements :");
        int i;
        for (i = 0 ; i < a.length ; i++)
        {
            System.out.printf("a[%d] = ",i);
            a[i] = S.nextInt();
        }
        System.out.println ("Enter The Secod Array Elements");
        int b [] = new int [l];
        for (i = 0 ; i < b.length ;i++)
        {
            System.out.printf ("b[%d] = ",i);
            b[i] = S.nextInt();
        }
        int c [] =new int [l];
        for (i = 0 ; i < c.length ; i++) {
            for ( int j = 0; j < c.length; j++)
            {
                if (a[i] == b[j])//
                {
                    c[i] = a[i];
                }
            }
        }
//        Arrays.sort(c);
        System.out.println ("common array Element :"+ Arrays.toString(c));
    }
}
