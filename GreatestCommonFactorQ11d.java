import java.util.*;
/**
 * Write a description of class GreatestCommonFactor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GreatestCommonFactorQ11d
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        System.out.print("Enter another number: ");
        int b = in.nextInt();
        int gcf = 0;
        for(int i = 1; i <= a && i <= b; i++)
        {
            if(a%i==0&&b%i==0)
            {
                gcf = i;
            }
        }
        System.out.println("Greatest common factor: " + gcf);
    }
}
