import java.util.Scanner;

/*
* ********** write a program to print sum of an arry **********
*/
public class Task3
{
    public static void main (String args [])
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter The length :");
        int n = S.nextInt();
        int a [] = new int [n];
        int sum = 0;
        System.out.println("Enter The digits :");
        int i;
        for ( i = 0 ;i < n ;i++)
        {
            a[i] = S.nextInt();
        }
        for (i = 0 ; i < n ; i++)
        {
            sum = sum + a[i];
        }
        System.out.println("The sum of all elaments is :"+sum);
    }
}
