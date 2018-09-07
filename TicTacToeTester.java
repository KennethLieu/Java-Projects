import java.util.*;
/**
 * Write a description of class TicTacToeTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class TicTacToeTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        TicTacToe g1 = new TicTacToe();
        int a = 0;
        System.out.print("Player X, enter your name: ");
        String n1 = in.nextLine();
        System.out.print("Player O, enter your name: ");
        String n2 = in.nextLine();
        char d1 = 'Z';
        char d2 = 'Z';
        int pt1 = 0;
        int pt2 = 0;
        do
        {
            do
            {
                g1.display();
                if(g1.turn(a)=='X')
                {
                    System.out.println(n1 + "'s turn!");
                }
                else
                {
                    System.out.println(n2 + "'s turn!");
                }
                System.out.print((g1.turn(a)=='X')?n1+ ", enter row number for " + g1.turn(a) + ": ":n2 + ", enter row number for " + g1.turn(a) + ": ");
                int x = in.nextInt();
                System.out.print((g1.turn(a)=='X')?n1+ ", enter column numnber for " + g1.turn(a) + ": ":n2 + ", enter column numnber for " + g1.turn(a) + ": ");
                int y = in.nextInt();
                g1.move(x,y,g1.turn(a)); 
                a++;
            }while(g1.isTie()==false && g1.isWinner()==false);
            g1.display();
            if(g1.isTie()==true)
            {
                System.out.println("Tied round!");
            }
            else
            {
                if(g1.determineWinner()=='X')
                {
                    System.out.println(n1 + " wins!");
                    pt1++;
                }
                else
                {
                    System.out.println(n2 + " wins!");
                    pt2++;
                }
            }
            System.out.println(n1 + "'s score: " + pt1);
            System.out.println(n2 + "'s score: " + pt2);
            System.out.print(n1 + ", would you like to play again?(Y or y for yes, N or n for no) ");
            d1 = in.next().charAt(0);
            System.out.print(n2 + ", would you like to play again?(Y or y for yes, N or n for no) ");
            d2 = in.next().charAt(0);
            g1.reset();
        }while(g1.playAgain(d1,d2)==true);
        if(pt1>pt2)
        {
            System.out.println(n1 + " wins!");
        }
        else if(pt1<pt2)
        {
            System.out.println(n2 + " wins!");
        }
        else
        {
            System.out.println("Tied game! Winner will be chosen at random(1 = " + n1 + " victory, 2 = " + n2 + " victory!)");
            int fate = (int)(Math.random()*2)+1;
            System.out.println("Winner: " + fate);
            switch(fate)
            {
                case 1: System.out.println(n1 + " wins!");break;
                default: System.out.println(n2 + " wins!");
            }
        }
    }
}
