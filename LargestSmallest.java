import java.util.*;
/**
 * Write a description of class LargestSmallest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LargestSmallest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int large = -1;
        int small = 1000000;
        int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
            if(arr[i]<small)
            {
                small = arr[i];
            }
            if(arr[i]>large)
            {
                large = arr[i];
            }
        }
        System.out.println("Largest: " + large);
        System.out.println("Smallest: " + small);
    }
}
