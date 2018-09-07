import java.util.*;
/**
 * Write a description of class NumDigits here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NumDigits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        char a = 'a';
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        System.out.println("Number of digits: " + count(num));
    }
    
    public static int count(int a)
    {
        int c = 0;
        for(int i = a; i > 0; i/=10)
        {
            c++;
        }
        return c;
    }
}

