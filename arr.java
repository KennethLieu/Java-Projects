
/**
 * Write a description of class arr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class arr
{
    public static void main(String[] args)
    {
        int[][][] arr = new int[2][3][6];
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                for(int k = 0; k < arr[i][j].length; k++)
                {
                    int a = (int)(Math.random()*9)+2;
                    arr[i][j][k] = a;
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
