import java.util.*;
/**
 * Write a description of class Sums here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sums
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter row length: ");
        int r = in.nextInt();
        System.out.print("Enter col length: ");
        int c = in.nextInt();
        int[][] a = new int[r][c];
        int sOdd = 0;
        int sEven = 0;
        int sAll = 0;
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                System.out.print("Enter a number: ");
                a[i][j] = in.nextInt();
                sAll += a[i][j];
                if(a[i][j]%2==0)
                {
                    sEven+=a[i][j];
                }
                else
                {
                    sOdd+=a[i][j];
                }
            }
        }
        System.out.println("Sum of odds: " + sOdd);
        System.out.println("Sum of evens: " + sEven);
        System.out.println("Sum of all elements: " + sAll);
    }
}
