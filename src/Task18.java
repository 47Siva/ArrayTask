import java.util.Scanner;

/*
* write a program to array elements print all positive number *******
*/
public class Task18
{
    public static void main (String args [])
    {
        Scanner S = new Scanner(System.in);
        System.out.println ("Enter The Array length :");
        int l = S.nextInt();
        int a [] = new int [l];
        System.out.println("Enter The Array Elements ;");
        int i;
        int pos;
        for (i = 0 ; i < a.length ; i++)
        {
            System.out.printf("a[%d] = ",i);
            a[i] = S.nextInt();
        }
        System.out.println("poositive Array Elements :");
        for (i = 0 ; i < a.length ; i++)
        {
            if (a[i] > 0)
            {
                System.out.print(a[i]+"\t");
            }
        }
    }
}
