import java.util.*;
/**
 * Write a description of class SumEven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumEvenQ11f
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        int sum = 0;
        for(int i = 2; i <= n; i+=2)
        {
            sum += i;
        }
        System.out.println("Sum of even numbers: " + sum);
    }
}
