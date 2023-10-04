import java.util.Arrays;

/*
* write a program to print discending order in bubol sort
*/
public class Task33
{
    public static void main (String args [])
    {
        int a [] = {2, 65, 23, 13, 18, 30, 46, 17, 52, 78};
        int tem = 0 ;
        int j = 1;
        System.out.println("befor Swaping :"+ Arrays.toString(a));
        while (j < a.length)
        {
            for (int i = 0 ; i < a.length-j ; i++)
            {
                if (a[i] < a[i+1])
                {
                    tem = a[i];
                    a[i] = a[i +1];
                    a[i+1] = tem;
                }
            }
            j++;
        }
        System.out.println("After Swaping :"+ Arrays.toString(a));
    }
}
