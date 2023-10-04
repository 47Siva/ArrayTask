import java.util.Scanner;

/*
* . Write a program in to copy the elements of one array into another array
*/
public class Task16
{
    public static void main (String args [])
    {
        Scanner S = new Scanner (System.in);
        System.out.println("Enter The length : ");
        int l = S.nextInt();
        int a[] = new int [l];
        int c []= new int [l];
        int i;
        System.out.println ("Enter a Number :");
        for ( i = 0 ; i < a.length ; i++)
        {
            a[i]= S.nextInt();
        }
        System.out.println("The Original Array :");
        for (i = 0 ; i < a.length ; i++)
        {
            System.out.print(a[i]+"\t");
        }
        for (i = 0 ; i < a.length ; i++)
        {
            c[i] = a [i];
        }
        System.out.println("\n"+"Capid Array :");
        for (i = 0; i < a.length; i++)
        {
            System.out.print(c[i]+"\t");
        }
    }
}