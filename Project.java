import java.util.*;
/**
 * Write a description of class Project here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Project
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = in.nextInt();
        long sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += (2*i+1);
        }
        System.out.println("Sum: " + sum);
    }
}
