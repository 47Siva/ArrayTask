import java.util.Scanner;

/*
* **** write a program to calculate the average value of array element *****
*/
public class Task4
{
    public static void main (String args [])
    {
        Scanner S = new Scanner(System.in);
        System.out.println ("Enter The length :");
        int n = S.nextInt();
        int a[] = new int [n];
        int sum = 0 ;
        System.out.println("Enter The Number :");
        int i;
        for (i = 0 ; i < a.length ; i++)
        {
            a [i] = S.nextInt();
        }
        for (i = 0 ; i <= a.length ; i++)
        {
            sum = sum + i;
        }
        double ave = sum / n;
        System.out.println("Sum of THe Element is"+sum);
        System.out.println("The average value is :"+ave);
    }
}
