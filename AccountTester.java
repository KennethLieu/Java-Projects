import java.util.*;
/**
 * Write a description of class AccountTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AccountTester
{
    public static void main(String[] args)
    {
        Account a = new Account();       
        Accounts c = new Accounts();
        c.register();
        System.out.println();
        c.transact();
        System.out.println();
        c.displayAll();
        System.out.println();
        System.out.println("Individual (New) Account: ");
        a.init();
        System.out.println();
        a.show();
        System.out.println();
        a.deposit(1800);
        a.withdraw(666);
        System.out.println("Withdraw: 666");
        System.out.println("Deposit: 1800");
        System.out.println();
        a.show();
    }
}
