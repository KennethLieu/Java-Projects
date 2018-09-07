import java.util.*;
/**
 * Write a description of class Factorial here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        long fact = 0;
        int j = 0;
        switch(a)
        {
            case 0: case 1: System.out.println("Factorial: 1"); break;
            default: for(int i = a; i >= 1; i--)
            {
                j++;
                switch(j)
                {
                    case 1: fact += i;break;
                    default: fact *= i;
                }
            }
            System.out.println("Factorial: " + fact);
        }
    }
}
