import java.util.Scanner;

/*
* Write a program to array elements to print cubic values ********
*/
public class Task9
{
    public static void main (String args[])
    {
        Scanner S = new Scanner (System.in);
        System.out.println ("Enter The size :");
        int siz = S.nextInt();
        int a [] = new int [siz];
        int i ;
        System.out.println("Enter The Element :");
        for (i = 0 ; i < a.length ;i++)
        {
            int cub = 0;
            a[i] = S.nextInt();
        }
        System.out.print("The cubic value :"+"\n");
        for (int e : a)
        {
            System.out.print("\t"+(e*e*e));
        }
    }
}
