import java.util.*;
/**
 * Write a description of class EvenM here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EvenMQ9b
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter # of terms: ");
        int a = in.nextInt();
        int s = 0;
        for(int i = 0; i < a; i++)
        {
            s += (int)(Math.pow((i+1)*2,2));
        }
        System.out.println("Total sum: " + s);
    }
}
