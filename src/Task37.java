import java.util.Scanner;

/*
* ********** Write a program to Search an item into the array using linear search **********
*/
public class Task37
{
    public static void main (String args [])
    {
        int a[] = {10,20,30,56,84};
        Scanner S = new Scanner(System.in);
        System.out.println ("Enter The Search Eleament:");
        int item = S.nextInt();
        int result = linear(a,item);
        if (result == -1)
        {
            System.out.println("Element not found");
        }
        else
            System.out.print("Element found at idex :"+result);

    }
    static int linear(int a[] , int s)
    {
        for (int i = 0; i < a.length; i++) {

            if (s == a[i])
            {
                return i;
            }
        }
        return-1;
    }
}