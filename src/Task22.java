import java.util.Scanner;

/*
* write program to Scarch an Element an Array *****
*/
public class Task22
{
    public static void main (String args [])
    {
        Scanner S = new Scanner (System.in );
        System.out.println("Enter The array length :");
        int l = S.nextInt();
        int a[] = new int [l];
        int i,j = 0,pos = 0,indx = 0;
        System.out.println("Enter The Array Element :");
        for (i = 0 ; i < a.length ; i++)
        {
            System.out.printf("a[%d] = ",i);
            a[i] = S.nextInt();
        }
        System.out.println("Scarch Array Element :");
        j = S.nextInt();
        for (i = 0 ; i < a.length ; i++)
        {
            if (a[i] == j)
                indx = i;
        }
        pos = indx + 1;
        System.out.println("The Array posistin is :"+pos);
        System.out.println("The Array Index is :"+indx);

    }
}
