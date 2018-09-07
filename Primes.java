import java.util.*;
/**
 * Write a description of class Primes here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Primes
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        int[] arr = new int[10];
        int c = 0;
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
            if(prime(arr[i])==true)
            {
                c++;
            }
        }
        int[] b = new int[c];
        int j = 0;
        System.out.println("Total number of prime numbers: " + c);
        System.out.println("Array of primes: ");
        for(int i = 0; i < arr.length; i++)
        {
            if(prime(arr[i])==true)
            {
                b[j] = arr[i];
                System.out.print(b[j] + " ");
                j++;
            }
        }
    }

    public static boolean prime(int n)
    {
        for(int i = 2; i <= 9 && i < n; i++)
        {
            if(n%i==0)
            {
                return false;
            }
        }
        return true;
    }
}


