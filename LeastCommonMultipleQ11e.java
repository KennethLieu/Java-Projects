import java.util.*;
/**
 * Write a description of class LeastCommonMultiple here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LeastCommonMultipleQ11e
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        System.out.print("Enter another number: ");
        int b = in.nextInt();
        int lcm = 0;
        boolean c = false;
        for(int i = (a>b)? a: b; c==false; i++)
        {
            if(i%b==0&&i%a==0)
            {
                lcm = i;
                c = true;
            }
        }
        System.out.println("Least common multiple: " + lcm);
    }
}
