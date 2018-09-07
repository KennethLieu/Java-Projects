import java.util.*;
/**
 * Write a description of class Multiple here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MultipleQ10
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        System.out.print("First 5 multiples: ");
        for(int i = 1; i <= 5; i++)
        {
            System.out.print(i*a + " ");
        }
        System.out.println();
        System.out.print("Squares of multiples: ");
        for(int i = 1; i <= 5; i++)
        {
            System.out.print((int)Math.pow(i*a, 2) + " ");
        }
        System.out.println();
        System.out.print("Cubes of multiples: ");
        for(int i = 1; i <= 5; i++)
        {
            System.out.print((int)Math.pow(i*a, 3) + " ");
        }
    }
}
