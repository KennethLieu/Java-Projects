import java.util.*;
/**
 * Write a description of class Account here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Account
{
    private int Acno;
    private String name;
    private float balance;
    public void init()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter account number: ");
        Acno = in.nextInt();
        System.out.print("Enter account name: ");
        name = in.next();
        System.out.print("Enter balance: ");
        balance = in.nextFloat();
    }
    
    public void show()
    {
        System.out.println("Account number: " + Acno);
        System.out.println("Account name: " + name);
        System.out.println("Balance: " + balance);
    }
    
    public void deposit(int amt)
    {
        balance += amt;
    }
    
    public void withdraw(int amt)
    {
        balance = Math.max(0,balance-amt);
    }
    
    public float RBalance()
    {
        return balance;
    }
    
    public int RAcno()
    {
        return Acno;
    }
}

