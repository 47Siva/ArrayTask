import java.util.Arrays;

/*
* ******* write a program to Numeric Array in Ascend order *********
*/
public class Task1
{
    public static void main (String args [])
    {
        int a [] = {23,5,67,20,3,30,79,3,70,2};
        Arrays.sort(a);
        System.out.println("Ascending order is "+"\n"+ Arrays.toString(a));
    }
}
