/*
* Write a program to Find prime and non-prime numbers in the array ******
*/
public class Task38
{
    public static void main (String args [])
    {
        int a [] = {3, 12, 21, 11, 71, 96, 19, 41, 83, 101};
        int i,j;

        for (i = 0 ; i < a.length ; i++)
        {
            int prime = 0;
            for (j = 2 ; j < a.length ; j++)
            {
                if (j == 3)
                    continue;
                if (a[i] % j == 0)
                    prime = 1;
            }
            if (prime == 0)
                System.out.println (a[i]+" is prime");
            else
                System.out.println(a[i]+" is not prime");
        }
    }
}