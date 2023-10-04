import java.util.Scanner;

/*
* write a program to mergo two arrays element to store third array *********
*/
public class Task17
{
    public static void main (String args [])
    {
        Scanner S = new Scanner(System.in);
        System.out.println("Enter the leangth :");
        int l = S.nextInt();
        int a [] = new int [l];
        int i;
        int k = 0;
        System.out.println("Enter The Frist Element:");
        for (i = 0 ; i < a.length ; i++)
        {
            System.out.printf("a[%d]= ",i);
            a[i] = S.nextInt();
        }
        System.out.println("Enter The second array length :");
        int s = S.nextInt();
        int b [] = new int [l];
        System.out.println("Enter The Second Element:");
        for (i = 0; i < a.length ; i++)
        {
            System.out.printf("b[%d]= ",i);
            b[i] = S.nextInt();
        }
        System.out.println("Enter The Therd Array length:");
        int m = S.nextInt();
        System.out.println("The Frist Array Elements :");
        for ( i = 0 ; i < a.length ; i++)
        {
            System.out.print(a[i]+"\t");
        }
        System.out.println("\nThe Second Array Elements is :");
        for (i =0 ; i < b.length; i++)
        {
            System.out.print(b[i]+"\t");
        }
        int c [] = new int [m];
        System.out.println ("\nThe mergs of array Element:");
        for (i = 0 ; i < a.length ; i++)
        {
            c[k] = a[i];
            k++;
        }
        for (i = 0 ; i < b.length ;i++)
        {
            c[k] = b[i];
            k++;
        }
        for (i = 0 ; i < c.length ; i++)
        {
            System.out.print(c[i]+"\t");
        }
    }
}
