import java.util.*;
/**
 * Write a description of class SumOdds here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumOdds11g
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        int sum = 0;
        for(int i = 1; i <= a; i+=2)
        {
            sum += i;
        }
        System.out.println("Sum of odds: " + sum);
    }
}
