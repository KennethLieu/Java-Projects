import java.util.*;
/**
 * Write a description of class SumSeries here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumSeriesQ9a
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        int s = 0;
        int j = 1;
        for(int i = 1; i <= a; i+=2)
        {
            s += i;
        }
        System.out.print("Sum of series: " + s);
    }
}
