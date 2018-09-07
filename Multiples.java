import java.util.*;
/**
 * Write a description of class Multiples here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Multiples
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.print("First 5 multiples: ");
        switch(num)
        {
            case 0:
            for(int i = 0; i < 5; i++)
            {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.print("Squares of multiples: ");
            for(int i = 0; i < 5; i++)
            {
                System.out.print(num + " ");
            }
            System.out.println();
            System.out.print("Cubes of multiples: ");
            for(int i = 0; i < 5; i++)
            {
                System.out.print(num + " ");
            }
            break;
            default:
            for(int i = 1; i <= 5; i++)
            {
                System.out.print(num*i + " ");
            }
            System.out.println();
            System.out.print("Squares of multiples: ");
            for(int i = 1; i <= 5; i++)
            {
                System.out.print((int)Math.pow(num*i,2) + " ");
            }
            System.out.println();
            System.out.print("Cubes of multiples: ");
            for(int i = 1; i <= 5; i++)
            {
                System.out.print((int)Math.pow(num*i,3) + " ");
            }
        }
    }
}
