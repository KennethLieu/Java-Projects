import java.util.*;
/**
 * Write a description of class ReversalNumber here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReversalNumberQ11c
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        int b;
        int c = Integer.toString(a).length()-1;
        int result = 0;
        for(int i = a; i > 0; i/=10)
        {
            b = i%10;
            result += (b*(int)Math.pow(10,c));
            c--;
        }
        System.out.println("Reversed: " + result);
    }
}
