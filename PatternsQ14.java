import java.util.*;
/**
 * Write a description of class Patterns here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PatternsQ14
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = in.nextInt();
        for(int i = 1; i <= n; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        for(int i = n; i >= 1; i--)
        {
            for(int j = i; j >= 1; j--)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
