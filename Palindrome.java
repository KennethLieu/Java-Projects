import java.util.*;
/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Palindrome
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = in.nextInt();
        int l = Integer.toString(a).length();
        boolean isPalindrome = true;
        switch(l)
        {
            case 1: break;
            default:
            int b = l%2;
            int j = l-1;
            switch(b)
            {
                case 0: 
                for(int i = 0; i < l/2; i++)
                {
                    if(!Integer.toString(a).substring(i,i+1).equals(Integer.toString(a).substring(j,j+1)))
                    {
                        isPalindrome = false;
                        break;
                    }
                    j--;
                }
                break;
                default:
                for(int i = 0; i <= l/2; i++)
                {
                    if(!Integer.toString(a).substring(i,i+1).equals(Integer.toString(a).substring(j,j+1)))                        
                    {
                        isPalindrome = false;
                        break;
                    }
                    j--;
                }
            }
        }
        if(isPalindrome==true)
        {
            System.out.println(a + " is a palindrome!");
        }
        else
        {
            System.out.println(a + " is NOT a palindrome!");
        }
    }
}
