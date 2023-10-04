import java.util.Scanner;

/*
* write a program to print uniqe Element from an Array *
*/
public class Task24
{
    public static void main (String args [])
    {
        Scanner S = new Scanner (System.in);
        System.out.println("Enter The Array Element :");
        int l = S.nextInt();
        int a [] = new int [l];
        int i;
        System.out.println("Enter The Array Element :");
        for (i = 0 ; i < a.length ; i++)
        {
            System.out.printf ("a[%d] = ",i);
            a[i] =S.nextInt();
        }
        System.out.println("The uniqe Array Element :");
        for (i = 0 ; i < a.length ; i++ )
        {
            int cou = 0;
            for (int j = i + 1; j < a.length ; j++ )
            {
                if (a[i] == a [j])
                {
                    cou++;
                }
            }
            if(cou == 0)
            {
                System.out.println(a[i]);
            }
        }
    }
}
