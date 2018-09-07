import java.util.*;
/**
 * Write a description of class ArrStr2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayStr2
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
        System.out.print("Enter subword to search for: ");
        String r = in.next();
        int c = 0;
        for(int i = 0; i < strs.length; i++)
        {
            if(strs[i].indexOf(r)!=-1)
            {
                System.out.println("Occurrence at location " + (i+1) + "!");
                c++;
            }
        }
        switch(c)
        {
            case 0: System.out.println("No occurrences!");break;
            default: System.out.println(c + " occurrence(s)!");
        }
    }
}

