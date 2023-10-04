import java.util.Arrays;
import java.util.Collections;

/*
*  write a program nto sort Numeric array in descending order *********
*/
public class Task2
{
    public static void main (String args [] )
    {
        Integer [] arr = {23,5,67,20,3,30,79,3,70,2};
        Arrays.sort(arr,Collections.reverseOrder());
        System.out.println("The Descending Order is :"+"\n"+Arrays.toString(arr));
    }
}
