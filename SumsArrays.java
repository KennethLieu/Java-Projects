import java.util.*;
/**
 * Write a description of class SumsArrays here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumsArrays
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int[] arr = new int[10];
        int sumEven = 0;
        int sumOdd = 0;
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
            if(arr[i]%2==0)
            {
                sumEven+=arr[i];
            }
            else
            {
                sumOdd+=arr[i];
            }
        }
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Sum of evens: " + sumEven);
        System.out.println("Sum of odds: " + sumOdd);
    }
}

