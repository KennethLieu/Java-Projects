import java.util.*;
/**
 * Write a description of class Matrix here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Matrix
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int a = (int)(Math.random()*2)+3;
        int b = (int)(Math.random()*2)+3;
        System.out.println("Number of rows: " + a);
        System.out.println("Number of columns: " + b);
        int c = a;
        int d = b;
        int[][] twoArr1 = new int[a][b];
        int[][] twoArr2 = new int[c][d];
        System.out.println("First 2D Array: ");
        for(int i = 0; i < twoArr1.length; i++)
        {
            for(int j = 0; j < twoArr1[i].length; j++)
            {
                System.out.print("Enter value for row # " + (i+1) + " and column # " + (j+1) + ": ");
                twoArr1[i][j] = in.nextInt();
            }
            System.out.println();
        }

        System.out.println("Second 2D Array: ");
        for(int i = 0; i < twoArr2.length; i++)
        {
            for(int j = 0; j < twoArr2[i].length; j++)
            {
                System.out.print("Enter value for row # " + (i+1) + " and column # " + (j+1) + ": ");
                twoArr2[i][j] = in.nextInt();
            }
            System.out.println();
        }
        System.out.println("First 2D array: ");
        display(twoArr1);
        System.out.println("Second 2D array: ");
        display(twoArr2);
        int[][]f = getSum(twoArr1, twoArr2);
        int[][]g = getDifference(twoArr1, twoArr2);
        System.out.println("Sum of 2D array: ");
        display(f);
        System.out.println("Difference of 2D array: ");
        display(g);
    }
    
    public static void display(int[][]v)
    {
        for(int i = 0; i < v.length; i++)
        {
            for(int j = 0; j < v[i].length; j++)
            {
                System.out.print(v[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] getSum(int[][]a, int[][]b)
    {
        int[][] c = new int[a.length][a[0].length];
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                c[i][j] = a[i][j]+b[i][j];
            }
        }
        return c;
    }

    public static int[][] getDifference(int[][]a, int[][]b)
    {
        int[][] c = new int[a.length][a[0].length];
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                c[i][j] = a[i][j]-b[i][j];
            }
        }
        return c;
    }
}

