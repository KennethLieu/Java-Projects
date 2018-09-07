import java.util.*;
/**
 * Write a description of class transpose here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class transpose
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[][] a = null;
        a = create(a);
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                System.out.print("Enter value of row #" + (i+1) + " and column #" + (j+1) + ": ");
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("Before call to transpose method: ");
        display(a);
        System.out.println("After call to transpose method: ");
        swap(a);        
    }

    public static void display(int[][] a)
    {
        for(int i = 0; i < a.length; i++)
        {
            for(int j = 0; j < a[i].length; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void swap(int[][]b)
    {
        boolean[][] a = new boolean[3][3];
        for(int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                a[i][j] = false;
            }
        }
        for(int i = 0; i < b.length; i++)
        {
            for(int j = 0; j < b[i].length; j++)
            {
                if(a[i][j]==false && a[j][i] == false)
                {
                    int temp = b[i][j];
                    b[i][j] = b[j][i];
                    b[j][i] = temp;
                    a[i][j] = true;
                    a[j][i] = true;
                }
            }
        }
        display(b);
    }

    public static int[][] create(int[][] a)
    {
        a = new int[3][3];
        return a;
    }
}
