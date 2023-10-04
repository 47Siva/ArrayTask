
import java.util.Scanner;

/*
* * write a program to Search an item in an array using binary search ********8p
*
*/
public class Task36
{
    public static void main (String args [] )
    {
        int a [] = {10,20,30,40,50,60,70,80,90,100};
        Scanner S = new Scanner (System.in);
        System.out.println("Enter the Search item :");
        int item = S.nextInt();
        int result = binerySearch(a,0,a.length-1,item);

        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "+result);
    }
      static int binerySearch (int a[] , int low , int high,int S )
    {
//         int a [] = {10,20,30,40,50,60,70,80,90,100}
//        S = 90
        int s = low;
        int e = high;

        while (s <= e)
        {
            int mid = (low + high )/2;
            if (S == a[mid])
            {
                return mid ;
            }
            else if (S < a[mid])
            {
                high = mid -1;
            }
            else
            {
               low = mid + 1;
            }
        }
        return -1;
    }
}
