import java.util.*;
/**
 * Write a description of class OrigReplace here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OrigReplace
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter original number: ");
        int orig = in.nextInt();
        System.out.print("Enter replacement number: ");
        int rep = in.nextInt();
        int[] arr = new int[10];
        System.out.println("Enter elements: ");
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        
        System.out.println("Original array: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        
        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i]==orig)
            {
                arr[i] = rep;
            }
        }
        System.out.println();
        System.out.println("New array: ");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}

