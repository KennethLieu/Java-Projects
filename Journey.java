import java.util.*;
/**
 * Write a description of class Journey here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Journey
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of miles: ");
        int miles = in.nextInt();
        System.out.print("Enter 1(first class), 2(second class) or 3(third class): ");
        int position = in.nextInt();
        double total = 0;
        switch(position)
        {
            case 1: System.out.println("You have chosen: first class");
            if(miles<=100 && miles >= 0)
            {
                total += (3 * miles);
            }
            else if(miles<=250 && miles > 100)
            {
                total = total + (3 * 100) + (2.50 * (miles-100));
            }
            else
            {
                total = total + (3 * 100) + (2.50*150) + (2*(miles-250));
            }
            break;
            case 2: System.out.println("You have chosen: second class");
            if(miles<=100)
            {
                total += (2 * miles);
            }
            else if(miles<=250 && miles > 100)
            {
                total = total + (2 * 100) + (1.50 * (miles-100));
            }
            else
            {
                total = total + (2 * 100) + (1.50*150) + (miles-250);
            }
            break;
            case 3: System.out.println("You have chosen: third class");
            if(miles<=100)
            {
                total += (1.5 * miles);
            }
            else if(miles<=250 && miles > 100)
            {
                total = total + (1.50 * 100) + (miles-100);
            }
            else
            {
                total = total + (1.50 * 100) + 150 + (0.50*(miles-250));
            }
            break;
            default: System.out.println("Invalid choice! ");
        }
        System.out.println("Total expenses: $" +total);
    }

}
