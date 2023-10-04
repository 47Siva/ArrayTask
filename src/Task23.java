import java.util.Scanner;

/*
* write a program to delet duplicate Element from an Array *****
*/
public class Task23
{
    public static void main (String args [])
    {
        Scanner S = new Scanner (System.in);
        System.out.println ("Enter the Array length :" );
        int l = S.nextInt();
        int a [] = new int [l];
        int i,dup = 0;
        System.out.println("Enter the Array Element:");
        for (i = 0; i <a.length ; i++)
        {
            System.out.printf("a[%d] = ",i);
            a[i] = S.nextInt();
        }
        for (i = 0 ; i < a.length ; i++)
        {
            int cou = 0;
            for (int j = i + 1; j < a.length; j++)
            {
                if (a[i] == a[j])
                {
                    cou++;
                }
            }
            if (cou == 0)
            {
                System.out.println(a[i]);
            }
        }
    }
}
