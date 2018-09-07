import java.util.*;
/**
 * Write a description of class OddM here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class OddMQ9c
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter # of terms: ");
        int a = in.nextInt();
        int s = 0;
        for(int i = 0; i < a; i++)
        {
            s += (int)(Math.pow((2*i)+1,3));
        }
        System.out.println("Total sum: " + s);
    }
}
