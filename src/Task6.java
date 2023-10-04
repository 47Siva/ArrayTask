import java.util.Scanner;

/*
 Write a program in to array size to be user input print it
 */
public class Task6
{
    public static void main (String args [])
    {
        Scanner S = new Scanner (System.in);
        System.out.println("Enter The size :");
        int n = S.nextInt();
        int a[] = new int [n];
        int i;
        System.out.println("enter the Element");
        for ( i = 0 ; i < a.length ; i++)
        {
             a [i] = S.nextInt();
        }
        int max = a[0];
        int min = a[1];
        for ( i = 0 ; i < a.length ; i++)
        {
            if (max < a[i])
            {
                max = a[i];
            }
            if ( min > a[i])
            {
                min = a[i];
            }
        }
        System.out.println("\n"+"The max value is :"+max);
        System.out.println("The min value is :"+min);
    }
}
