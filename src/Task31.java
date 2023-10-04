
import java.util.Arrays;

/*
* write a program to sort Ann array in ascending order using Quisksort ********
*/
public class Task31
{
   public static void Quicksort (int a[],int low,int high)
   {
       if (low >= high)
           return;
//       int a [] = {2,65,23,13,18,30,46,17,52,78};
       int s = low;
       int e = high;
       int mid = (low + high) / 2;
       int pivot = a[mid];
       while (s <= e)
       {
           while (a[s] < pivot)
               s++;
           while (a[e] > pivot)
               e--;
           if (s <= e)
           {
               int temp = a [s];
               a [s] = a [e];
               a [e] = temp;
               s++;
               e--;
           }
       }
       Quicksort(a,low,e);
       Quicksort(a,s,high);
   }
   public static void main (String args [])
   {
       int a [] = {2,65,23,13,18,30,46,17,52,78};
       Quicksort(a,0,a.length-1);
       System.out.println(Arrays.toString(a));
   }
}