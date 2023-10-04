import java.util.Scanner;

/*
*  Write a program to array elements print all Odd number
*/
public class Task11
{
    public static void main (String args [])
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter The Element :");
        int len = S.nextInt();
        int a [] = new int[len];
        int i ;
        System.out.println("Enter The number");
        for (i = 0 ; i < a.length ; i++)
        {
            a[i] = S.nextInt();
        }
        System.out.println ("The Odd numbers is :");
        for (i = 0 ; i < a.length ; i++)
        {
            if (a[i]%2 != 0)
            {
                 System.out.println(a[i]);
            }
        }

    }
}