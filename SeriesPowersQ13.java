import java.util.*;
/**
 * Write a description of class SeriesPowers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SeriesPowersQ13
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number for n: ");
        int n = in.nextInt();
        System.out.print("Enter a number for x: ");
        int x = in.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
            sum += (int)(Math.pow(x,i));
        }
        System.out.println("Total sum: " + sum);
    }
}
