import java.util.Scanner;

/*
* Write a program to array elements to print sum of Cubic Values ********
*/
public class Task15
{
    public static void main (String args [])
    {
        Scanner S = new Scanner (System.in);
        System.out.println ("Enter The length ");
        int len = S.nextInt();
        int a[] = new int [len];
        int i ;
        int sum = 0;
        for (i = 0; i < a.length; i++)
        {
            a[i] = S.nextInt();
        }
        for (int e : a)
        {
            sum = sum + (e*e*e);
        }
        System.out.println ("The Qube of sum is "+sum);
    }
}
