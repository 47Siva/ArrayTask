import java.util.Scanner;

/*
*  write a program to array Element to print sum of posivite number **
*/
public class Task21
{
    public static void main (String args [])
    {
        Scanner S = new Scanner(System.in);
        System.out.println ("Enter The Array Length ");
        int l = S.nextInt();
        int a [] = new int [l];
        int i, sum = 0;
        System.out.println("Enter The Array Element");
        for (i = 0 ; i < a.length ; i++)
        {
            System.out.printf("a[%d] = ",i);
            a[i] = S.nextInt();
        }
        System.out.println("The Nagative Numbers :");
        for (i = 0 ; i < a.length ; i++)
        {
            if (a[i] < 0 )
            {
                System.out.println(a[i]+" ");
                sum = sum + a[i];
            }
        }
        System.out.print ("\nSum of The Array Element :"+sum);
    }
}
