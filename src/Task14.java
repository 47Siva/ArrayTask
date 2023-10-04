import java.util.Scanner;

/*
* Write a program to array elements to print sum of Even Numbers ************
*/
public class Task14
{
    public static void main (String args [])
    {
        Scanner S = new Scanner (System.in);
        System.out.println ("Enter The length :");
        int len = S.nextInt();
        int a[] = new int [len];
        int i ;
        System.out.println("Enter The Array Element :");
        for (i = 0 ; i < a.length ; i++)
        {
            System.out.printf("a[%d] = ",i);
            a[i]  = S.nextInt();
        }
        for (i = 0 ; i < a.length ; i++ )
        {
            if (a[i] % 2 == 0)
            {
                System.out.println (a[i]);
            }
        }
        int sum = 0;
        for (int E : a)
        {
            if ( E % 2 == 0)
            {
                sum = sum + E;
            }
        }
        System.out.println ( "The Sum of Even Array Element :"+sum);
    }
}
