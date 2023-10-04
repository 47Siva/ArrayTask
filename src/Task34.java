import java.util.Arrays;

/*
* **** writeaprogram to sort an array in descending order using selection sort
*/
public class Task34
{
    public static void main (String args[])
    {
        int a[] = {2, 65, 23, 13, 18, 30, 46, 17, 52, 78};
        int i, tem, max;
        for (int j = 1 ;j < a.length ;j++)
        {
            for (i = 0; i < a.length; i++)
            {
                if (a[i] < a[j])
                {
                    tem = a[i];
                    a[i] = a[j];
                    a[j] = tem;
                }
            }
        }
        System.out.println ("Sorted Array is Descending order :");
        System.out.println (Arrays.toString(a));
    }
}