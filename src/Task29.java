import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/*
* write a program to find Second largest Element in array *********
*/
public class Task29
{
    public static void main (String args [])
    {
        Scanner S = new Scanner (System.in);
        System.out.println("Enter the Array length :");
        int l = S.nextInt();
        int a [] = new int [l];
        System.out.println("Enter The Array Element :");
        int i;
        for (i = 0 ; i < a.length ; i++)
        {
            System.out.printf("a[%d] = ",i);
            a[i] = S.nextInt();
        }
        System.out.println ("Array Element :"+ Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("The Second Largest Element in Array is ;"+a[a.length-2]);
    }
}
