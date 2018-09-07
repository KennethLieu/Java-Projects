import java.util.*;
/**
 * Write a description of class SumDigits here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SumDigits
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        int b = 0;
        int total = 0;
        switch(a)
        {
            case 0: case 1: case 2:
            case 3: case 4: case 5:
            case 6: case 7: case 8:
            case 9: System.out.println("Sum of digits: " + a); break;
            default: for(int i = a; i > 0; i/=10)
            {
                b = i%10;
                total += b;
            }
            System.out.println("Sum of digits: " + total);
        }

    }
}

