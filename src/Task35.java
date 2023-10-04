import java.util.Arrays;

/*
 * **** writeaprogram to sort an array in Acsending order using selection sort
 */
public class Task35
{
    public static void main (String args[])
    {
        int a [] = {2, 65, 23, 13, 18, 30, 46, 17, 52, 78};
        int i,j,tem , max;
        for (j = 1 ; j < a.length ;j++)
        {
            for (i =  0 ; i < a.length; i++)
            {
                if (a[i] > a[j])
                {
                    tem = a[i];
                    a[i] = a[j];
                    a[j] = tem;
                }
            }
        }
        System.out.println ("Sorted Array is Acsending order :");
        System.out.println (Arrays.toString(a));
    }
}
