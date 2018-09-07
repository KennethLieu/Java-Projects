import java.util.*;
/**
 * This class demonstrates a Hangman Game.
 * Please read instructions before playing!
 * Game instructions:
 * 2 players will be playing the game Hangman,
 * where they may choose to become the role of
 * either Player 1 or Player 2. Player 1 will be 
 * the person who comes up with a word for 
 * Player 2 to guess, while Player 2 attempts to
 * reveal the entire word within the guessing 
 * limit. The game will end when number of guesses
 * reaches or go under 0 or the entire word is 
 * revealed. Player 2 can either guess the word
 * letter by letter or if they are confident, they
 * can take a shot at guessing the entire word.
 * Please note that when guessing the entire word,
 * ONLY if the guessed word matches the word 
 * provided by Player 1 will Player 2 be given
 * automatic victory, so even if Player 2 is one
 * letter off, the guess will still be marked as 
 * incorrect. Also note that Player 2 will also
 * lose 3 guesses as oppose to the normal 1 guess
 * if the guess is incorrect, so make sure that
 * you are confident of knowing the word before
 * taking a shot. Note that because of this mechanism,
 * it is possible to end up with a negative guess
 * amount, which will count towards the amount of
 * points Player 1 is awarded, so be careful when
 * using this option. Player 1 will win when Player 2 
 * runs out of guesses AND is unable to reveal the 
 * entire word, and Player 2 will win when the
 * entire word is revealed. The amount of points
 * earned assuming the role of Player 1 
 * (assuming victory) will be 1 victory point plus 
 * 1 additional point for each letter that is 
 * unrevealed, and 1 additional point will be 
 * earned for everty negative guess by Player 2.
 * For example, player 1 earns 2 additional points if 
 * player 2 has -2 guesses remaining. The amount of
 * points assuming the role of Player 2(assuming 
 * victory) will be 1 victory point plus 1 additional 
 * point for every guess that is not used up. Both
 * players will have opportunities to play again, but 
 * BOTH players MUST agree on a replay in order for it
 * to happen. If a replay is to occur, players may
 * switch roles, and each take turns deciding what role
 * they wish to be. If a replay is to NOT occur, the 
 * player with the most amount of points at the end 
 * wins the entire game. However, if a tie were to occur,
 * the tiebreaker will be whoever wins the MOST rounds 
 * wins the game. If there is a tie in most amount of 
 * points AND rounds, the game will decide on a winner
 * by random(1=player 1 victory, 2=player 2 victory).
 * For the best experience of this game, be sure to 
 * provide only lowercase letters(no spaces, symbols,
 * upper case letters, or numbers), and to not allow
 * unlimited buffering. Also, do NOT enter in 
 * multiple letters when guessing one letter at a time.
 * 
 * NOTE: Negative guess amounts can ONLY occur by means
 * of using GUESS WORD and incorrectly guessing the 
 * entire word.
 * 
 * Score distributions/ Winner determinations:
 * If player 1 is victorious, they will earn one victory
 * point, plus one additional point for every letter 
 * not yet revealed by player 2, plus one additional 
 * point for every negative guess from player 2(player 1
 * earns 2 additional points if player 2 ends up with -2
 * guesses remaining, and so on). If player 2 is 
 * victorious, they will earn one victory point, plus
 * one additional point for every guess remaining after
 * the end of the round. The player with the most amount 
 * of points at the end of the game will win the game. If
 * a tie were to occur, the winner will be decided by 
 * whoever wins the most rounds. If a tie occurs here too
 * (same amount of points and same amount of rounds won), 
 * the winner will be decided by random numbers (where 1 
 * represents victory for player 1, and 2 represents
 * victory for player 2).
 *
 * @author Kenneth Lieu
 * @version 6/16/18
 */
public class HangmanTester
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Player 1, enter your name: ");//player 1 name
        String name1 = in.nextLine();
        System.out.print("Player 2, enter your name: ");//player 2 name
        String name2 = in.nextLine();
        Hangman game1;
        String previous = "";
        String previous1 = "";
        HangmanPlayer p1 = null;
        HangmanPlayer p2 = null;
        HangmanPlayersList t = new HangmanPlayersList();
        String dec1 = "";
        String dec2 = "";
        String actual = "";
        int round = 0;
        boolean r = true;
        String d = "";
        String f = "";
        do
        {
            round++;  
            System.out.println("Round: " + round);
            System.out.println();
            int c = round%2;
            System.out.print((c==0)?name1 + ", do you wish to be player 1 or player 2? ":name2 + ", do you wish to be player 1 or player 2? ");
            d = (c==0)?in.nextLine():"";
            f = (c==1)?in.nextLine():"";
            r = (c==0)?false:true;
            System.out.println("Assigned roles: ");
            System.out.println();
            int ty = (round==1)?0:p1.getPoints();
            int tz = (round==1)?0:p2.getPoints();
            int rs = (round==1)?0:p1.getRoundsWon();
            int rt = (round==1)?0:p2.getRoundsWon();
            d = (r==false&&d.equals("player 1"))||f.equals("player 2")? "player 1" : "player 2";
            f = (r==false&&d.equals("player 1"))||f.equals("player 2")? "player 2" : "player 1";
            System.out.println((r==false&&d.equals("player 1"))||f.equals("player 2")? "Player 1: " + name1 : "Player 1: " + name2);
            System.out.println(((r==false&&d.equals("player 1"))||f.equals("player 2"))? "Player 2: " + name2 : "Player 2: " + name1);
            if((r==false&&d.equals("player 1"))||f.equals("player 2"))
            {
                p1 = (round==1)? new HangmanPlayer(0,name1,1,0):(!previous.equals(d))? new HangmanPlayer(tz,name1,1,rt) : new HangmanPlayer(ty,name1,1,rs);
                p2 = (round==1)? new HangmanPlayer(0,name2,2,0):(!previous.equals(d))? new HangmanPlayer(ty,name2,2,rs) : new HangmanPlayer(tz,name2,2,rt);
            }
            else
            {
                p1 = (round==1)?new HangmanPlayer(0,name2,1,0): (!previous1.equals(f))? new HangmanPlayer(tz,name2,1,rt) : new HangmanPlayer(ty,name2,1,rt);
                p2 = (round==1)?new HangmanPlayer(0,name1,2,0): (!previous1.equals(f))? new HangmanPlayer(ty,name1,2,rs) : new HangmanPlayer(tz,name1,2,rs);
            }
            t.add(p1);
            t.add(p2);
            System.out.print(p1.getName() + ", enter a word for " + p2.getName() + " to guess!");
            actual = in.nextLine();
            int guesses = (int)(Math.random()*4)+actual.length();
            game1 = new Hangman(actual,guesses);
            for(int i = 0; i < 300; i++)
            {
                System.out.println();
            }
            do
            {
                System.out.println("Revealed: " + game1.getRevealed());
                System.out.println("Number of guesses: " + game1.getGuesses());
                System.out.println("Guessed letters: " + game1.getGuessed());
                System.out.print(p2.getName() + ", enter a letter of the word(or enter GUESS WORD to guess the word): ");
                String guess = in.nextLine();
                if(guess.equals("GUESS WORD"))
                {
                    System.out.print("Enter the word(-3 guesses if incorrect): ");
                    String word = in.nextLine();
                    game1.guessWord(word);
                    if(!word.equals(actual))
                    {
                         System.out.println("Incorrect word!");
                    }
                }
                else
                {
                    game1.guess(guess);
                }
            }while(game1.player1Wins()==false && game1.player2Wins()==false);
            System.out.println();
            System.out.println(game1.player1Wins()==true?p1.getName() + " wins round " + round + "!":p2.getName() + " wins round " + round + "!");
            System.out.println("Revealed: " + game1.getRevealed());
            System.out.println("Actual: " + actual);
            System.out.println("Victory point: 1");
            if(game1.player1Wins()==true)
            {
                System.out.println("Amount of unrevealed letters: " + game1.getUnrevealed(game1.getRevealed()));
                if(game1.getGuesses()<0)
                {
                    System.out.println("Number of guesses: " + game1.getGuesses());
                }
                p1.addPoints(game1.getPoints());
                p1.won();
            }
            else
            {
                System.out.println("Number of guesses: " + game1.getGuesses());
                p2.addPoints(game1.getPoints());
                p2.won();
            }
            System.out.println("Rounds won by " + p1.getName() + ": " + p1.getRoundsWon());
            System.out.println("Rounds won by " + p2.getName() + ": " + p2.getRoundsWon());
            System.out.println(p1.getName() + "'s score: " + p1.getPoints());
            System.out.println(p2.getName() + "'s score: " + p2.getPoints());
            System.out.println();
            System.out.print(name1 + ", do you want to play again?(enter Y for yes, or N for no) ");
            dec1 = in.nextLine();
            System.out.print(name2 + ", do you want to play again?(enter Y for yes, or N for no) ");
            dec2 = in.nextLine();
            r = true;
            previous = d;
            previous1 = f;
            f = "";
            d = "";
        }while(game1.playAgain(dec1, dec2)==true);
        if(p1.getPoints()>p2.getPoints())
        {
            System.out.println("Player 1 wins!");
        }
        else if(p1.getPoints()<p2.getPoints())
        {
            System.out.println("Player 2 wins!");
        }
        else
        {
            System.out.println("Tied points! Winner will be chosen by most rounds won!");
            if(p1.getRoundsWon()>p2.getRoundsWon())
            {
                System.out.println("Player 1 wins!");
            }
            else if(p1.getRoundsWon()<p2.getRoundsWon())
            {
                System.out.println("Player 2 wins!");
            }
            else
            {
                System.out.println("Tied rounds won! Winner will be chosen by random!(1 = player 1 victory, 2 = player 2 victory)");
                int fate = (int)(Math.random()*2)+1;
                switch(fate)
                {
                    case 1: System.out.println("Player 1 wins!");
                    break;
                    default: System.out.println("Player 2 wins!");
                }
            }
        }
    }
}
