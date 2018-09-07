import java.util.*;
/**
 * Write a description of class Fib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FibQ12
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        int f = 0;
        int s = 1;
        int fib = 0;
        int temp = 0;
        int sum = 0;
        int third = 0;
        switch(a)
        {
            case 0: case 1: System.out.println("Fib: " + a);break;
            default:
            for(int i = 0; i < a-1; i++)
            {
                if(i>=2)
                {
                   third = temp;
                   sum += third;
                }
                fib = sum + f + s;
                temp = f;
                f = s;
                s += temp;
            }
            System.out.println("Fib: " + fib);
        }
        
    }
}
