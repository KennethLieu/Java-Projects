import java.util.*;
/**
 * Write a description of class ArmstrongNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArmstrongNumberQ11b
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        int b;
        int c = Integer.toString(a).length();
        int result = 0;
        for(int i = a; i > 0; i/=10)
        {
            b = i%10;
            result += Math.pow(b,c);
        }
        if(result==a)
        {
            System.out.println("Number is an armstrong number!");
        }
        else
        {
            System.out.println("Number is NOT an armstrong number!");
        }
    }
}
