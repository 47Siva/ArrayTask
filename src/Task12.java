import java.util.Scanner;

/*
*   Write a program to array elements print all Even number *****
*/
public class Task12
{
    public static void main (String args [])
    {
        Scanner S = new Scanner (System.in);
        System.out.println("Enter the length :");
        int len = S.nextInt();
        int a [] = new int [len];
        int i ;
        System.out.println("Enter The Number :");
        for (i = 0 ; i < a.length ; i++)
        {
            System.out.printf("a[%d] =",i);
            a[i] = S.nextInt();
        }
        System.out.println("The even Numbers is :");
        for (i = 0 ; i < a.length ; i++)
        {
            if (a[i]%2 == 0)
            {
                System.out.println (a[i]);
            }
        }
    }
}
