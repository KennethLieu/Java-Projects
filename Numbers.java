import java.util.*;
/**
 * Write a description of class Numbers here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Numbers
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = in.nextInt();
        int j = 0;
        boolean c = false;
        for(int i = 2; i < num && i <= 9 && c==false; i++)
        {
            j = num%i;
            switch(j)
            {
                case 0: c = true; break;
            }
        }
        
        if(c==true)
        {
            System.out.println("Composite number!");
        }
        else
        {
            System.out.println("Prime number!");
        }
    }
}
