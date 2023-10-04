import java.util.Scanner;

/*
* Write a program to find the maximum and minimum element in an array *********
*/
public class Task10
{
    public static void main (String args [])
    {
        Scanner S = new Scanner (System.in);
        System.out.println ("Enter The size :");
        int siz = S.nextInt();
        int a[] = new int [siz];
        for (int i = 0 ; i < a.length ; i++)
        {
            a[i] = S.nextInt();
        }
        int max = a[0];
        int min = a[0];
        for (int i = 0 ; i < a.length ; i++)
        {
            /*if (max < a[i] )
                max = a[i];*/
            if (min > a[i] )
                min = a[i];
        }
        System.out.println ( "Max Arraya Element :"+max);
        System.out.println ("Min Array Element :"+min);
    }
}
