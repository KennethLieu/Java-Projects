import java.util.*;
/**
 * Write a description of class Largest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Largest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        System.out.print("Enter another number: ");
        int b = in.nextInt();
        System.out.print("Enter a third number: ");
        int c = in.nextInt();
        if(Math.max(a,b)==b && Math.max(b,c)==b)
        {
            System.out.println(b);
        }
        else if(Math.max(a,c)==a && Math.max(a,b)==a)
        {
            System.out.println(a);
        }
        else
        {
            System.out.println(c);
        }
    }

}
