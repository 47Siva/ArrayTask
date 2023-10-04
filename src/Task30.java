import java.util.Scanner;

/*
* write a program to fiend missing number *********
*/
public class Task30
{
    public static void main (String args [])
    {
        Scanner S = new Scanner (System.in);
        System.out.println ("Enter The Array Element :");
        int l = S.nextInt();
        int a [] =new int [l];
        for (int i = 0 ; i < a.length; i++ )
        {
            a[i] = S.nextInt();
        }
        int len = a[a.length-1];
        int sum1 = 0;
        int sum2 = 0;
        int ans = 0;
        for (int i = 0 ; i < len ; i++)
        {
            sum1 = sum1 + i;
        }
        for (int i = 0 ; i < a.length-1  ;i++)
        {
            sum2 = sum2 + a[i];
        }
        ans = sum1 - sum2;
        System.out.println("The missing Number is :"+ans);
    }
}
