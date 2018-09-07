import java.util.*;
/**
 * Write a description of class FillTwoDArr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FillTwoDArr
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[4][5];
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print("Enter value for row # " + (i+1) + " and column # " + (j+1) + ": ");
                arr[i][j] = in.nextInt();
            }
        }
        display(arr);
    }

    public static void display(int[][] a)
    {
        System.out.println("2D Array values: ");
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
