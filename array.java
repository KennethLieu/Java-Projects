import java.util.*;
/**
 * Write a description of class array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class array
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[10];
        int total = 0;
        System.out.println("Enter 10 numbers: ");
        for(int i = 0; i < 10; i++)
        {           
            arr[i] = in.nextInt();
            total += arr[i];
        }
        System.out.println("Average: " + ((double)total/10));
    }
}
