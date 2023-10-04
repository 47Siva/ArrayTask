import java.util.Scanner;

/*
*  Write a program to array elements to print sum of Odd Numbers *******
*/
public class Task13
{
    public static void main (String args [])
    {
        Scanner S = new Scanner (System.in);
        System.out.println("Enter a number :");
        int len = S.nextInt();
        int a [] = new int [len];
        int i;
        int sum = 0;
        int odd = 0;
        System.out.println("Enter The Number :");
        for (i = 0 ; i < a.length ; i++)
        {
            System.out.printf("a[%d] =",i);
            a[i] = S.nextInt();
        }
        System.out.println("The Sum of Odd Numbers :");
        for (i = 0 ; i < a.length; i++)
        {

            if (a[i]%2 != 0)
            {
                 System.out.println(a[i]);
            }
        }
        for (int O : a)
        {
            if ( O % 2 != 0){
                sum = sum + O;
            }
        }
        System.out.println("The sum of Array element :"+sum);
    }
}
