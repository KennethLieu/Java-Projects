
import java.util.*;
/**
 * Write a description of class ArrStr here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayStr1
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter amount of strings: ");
        int a = in.nextInt();
        String[] strs = new String[a];
        int b = 0;
        do
        {
            System.out.print("Enter words: ");
            strs[b] = in.next();
            b++;
        }while(b!=a);
        System.out.println();
        System.out.println("Elements beginning with \'A\' or \'a\': ");
        for(int i = 0; i < strs.length; i++)
        {
            if(strs[i].startsWith("A")||strs[i].startsWith("a"))
            {
                System.out.println(strs[i]);
            }
        }
    }
}

