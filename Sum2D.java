import java.util.*;
/**
 * Write a description of class Sum2D here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sum2D
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter row size: ");
        int row = in.nextInt();
        System.out.print("Enter column size: ");
        int col = in.nextInt();
        int[][] arr = new int[row][col];
        int rSum = 0;
        int cSum = 0;
        int dSum = 0;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                System.out.print("Enter a number for row #" + (i+1) + " and column #" + (j+1) + ": ");
                arr[i][j] = in.nextInt();
            }
        }
        display(arr);
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                rSum += arr[i][j];
            }
            System.out.println("Row #" + (i+1) + " sum: " + rSum);
            rSum = 0;
        }
        System.out.println();
        for(int j = 0; j < arr[0].length; j++)
        {
            for(int i = 0; i < arr.length; i++)
            {
                cSum += arr[i][j];
            }
            System.out.println("Column #" + (j+1) + " sum: " + cSum);
            cSum = 0;
        }        
        if(row==col)
        {
            int j = 0;
            for(int i = 0; i < arr.length; i++)
            {
                dSum += arr[i][j];
                j++;
            }
            if(hasCommonElement(arr))
            {
                j = 0;
                for(int i = arr[0].length-1; i >= 0; i--)
                {
                    if(i!=j)
                    {
                        dSum += arr[j][i];
                    }
                    j++;
                }
            }
            else
            {
                j = 0;
                for(int i = arr[0].length-1; i >= 0; i--)
                {
                    dSum += arr[j][i];
                    j++;
                }
            }
            System.out.println("Diagonal sum: " + dSum);
        }        
    }

    public static boolean hasCommonElement(int[][]a)
    {
        return a.length%2==1 && a[0].length%2==1;     
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
}
