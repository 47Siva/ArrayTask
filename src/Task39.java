import java.util.Arrays;

/*
* write a program to move all zero at the end of the array ***********
*/
public class Task39 {
    public static void main(String args[])
    {
        int a[] = {1, 0, 45, 34, 0, 67, 2, 0, 6, 67, 45, 2, 0, 10};
        int i,res ,temp = 0;
        for ( i = 0 ; i < a.length-1 ; i++)
        {
            for (i = 0 ; i < a.length ; i++)
            {
                if (a[i] != 0)
                {
                    a[temp] = a[i];
                    temp++;
                }
            }
        }
        for (i = temp; i < a.length; i++)
        {
                a[i] = 0;
        }
        System.out.println(Arrays.toString(a));
    }
}
