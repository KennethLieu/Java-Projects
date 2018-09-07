import java.util.*;
/**
 * Write a description of class Composite here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Composite
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        switch(composite(a))
        {
            case 0: System.out.println(a + " is NOT composite!");break;
            default: System.out.println(a + " is composite!");
        }
    }
    
    public static int composite(int a)
    {
        for(int i = 2; i <= 9 && i < a; i++)
        {
            if(a%i==0)
            {
                return 1;
            }
        }
        return 0;
    }
}


