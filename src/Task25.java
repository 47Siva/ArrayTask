import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
*write a program to find The second Smallest Element in an array ***
*/
public class Task25
{
    public static void main (String args [])
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter The Array length :");
        int l = S.nextInt();
        int a [] = new int [l];
        int i  ;
        for (i = 0 ; i < a.length ; i++ )
        {
            a[i] = S.nextInt();
        }
        Arrays.sort(a);
        System.out.println ("The Array Acsend order Element is :"+ Arrays.toString(a));
        System.out.println ("The second Smallest Element is :"+a[a.length-4]);
    }
}
