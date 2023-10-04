import java.util.Scanner;

/*
*  Write a program in to find the sum of all elements of the array *********
*/
public class Task7
{
    public static void main ( String args [])
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter The limet :");
        int n = S.nextInt();
        int a [] = new int [n];
        int i;
        int sum = 0;
        System.out.println ("Enter The Array Element :");
        for (i = 0 ; i < a.length ; i++)
        {
            a[i] = S.nextInt();
        }
        for (i = 0 ; i < a.length ; i++)
        {
            sum = sum + a[i];
        }
        System.out.println ("The sum of Array Element is :"+sum);
    }
}
