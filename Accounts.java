import java.util.*;
/**
 * Write a description of class Accounts here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Accounts
{
    private Account[] accs;
    private int length;
    
    public void register()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of accounts: ");
        length = in.nextInt();
        accs = new Account[length];
        for(int i = 0; i < accs.length; i++)
        {
            accs[i] = new Account();
            accs[i].init();
        }
    }
    
    public void transact()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an account number: ");
        int a = in.nextInt();
        int am;
        boolean s = false;
        for(int i = 0; i < accs.length && s == false; i++)
        {
            if(accs[i].RAcno()==a)
            {
                if(accs[i].RBalance()>=500)
                {
                    System.out.print("Deposit or withdraw? ");
                    String dec = in.next();
                    if(dec.equalsIgnoreCase("Deposit"))
                    {
                        System.out.print("How much to deposit? ");
                        am = in.nextInt();
                        accs[i].deposit(am);
                    }
                    else
                    {
                        System.out.print("How much to withdraw? ");
                        am = in.nextInt();
                        accs[i].withdraw(am);
                    }
                }
                s = true;
            }
            else
            {
                System.out.println("Insufficient balance. Need at least 500. ");
            }
        }
    }
    
    public void displayAll()
    {
        for(int i = 0; i < accs.length; i++)
        {
            accs[i].show();
        }
    }
}
