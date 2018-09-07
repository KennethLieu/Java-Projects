import java.util.*;
/**
 * Write a description of class Project1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Project1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = in.nextInt(); 
        long sum = 0;
        for(int i = 0; i < n; i++)
        {
            sum += (long)(Math.pow(2*(i+1),2));
        }
        System.out.println("Sum: " + sum);
    }
}
