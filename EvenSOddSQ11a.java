import java.util.*;
/**
 * Write a description of class EvenSOddS here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenSOddSQ11a
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        int sEven = 0;
        int sOdd = 0;
        int cEven = 0;
        int cOdd = 0;
        int rem;
        for(int i = a; i > 0; i/=10)
        {
            rem = i%10;
            if(rem%2==0)
            {
                sEven += rem;
                cEven++;
            }
            else
            {
                sOdd += rem;
                cOdd++;
            }
        }
        System.out.println("Sum of odds: " + sOdd);
        System.out.println("Sum of evens: " + sEven);
        System.out.println("Number of odds: " + cOdd);
        System.out.println("Number of evens: " + cEven);
    }
}
