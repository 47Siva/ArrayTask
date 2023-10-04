import java.util.Scanner;

/*
*  Write a program to Read and print a Two Dimensional array ******
*/
public class Task40
{
    public static void main (String args [])
    {
        int a[][] = new int [100][100];
        int row,col,i,j;
        Scanner S = new Scanner (System.in);

        System.out.println ("Enter The row :");
        row = S.nextInt();
        System.out.println ("Enter the colum :");
        col = S.nextInt();

        for (i = 0 ; i < row ; i++)
        {
            for (j = 0 ; j < col ; j++ )
            {
                System.out.printf ("Enter the array Element [%d][%d] = ",i,j);
                a[i][j] = S.nextInt();
            }
        }
        System.out.println("display 2D Array :");
        for (i = 0 ; i < row ; i++)
        {
            for (j = 0 ; j < col ; j++)
            {
                System.out.print (a[i][j]+" ");
            }
            System.out.println ("");
        }

    }
}
