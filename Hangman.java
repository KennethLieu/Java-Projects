import java.util.*;
/**
 * Write a description of class Hangman here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Hangman
{
    private String revealed;
    private int guesses;
    private String actual;
    private List<String> alreadyGuessed;
    public Hangman(String r, int guessed)
    {
        actual = r;
        guesses = guessed;
        revealed = "";
        for(int i = 0; i < actual.length(); i++)
        {
            revealed += "-";
        }
        alreadyGuessed = new ArrayList<String>();
    }

    public int getPoints()
    {
        if(player1Wins()==true)
        {
            int c = getUnrevealed(revealed);
            if(guesses<0)
            {
                return 1 + c - guesses;
            }
            return 1 + c;
        }
        return 1 + guesses;
    }

    public List<String> getGuessed()
    {
        return alreadyGuessed;
    }

    public int getUnrevealed(String r)
    {
        int c = 0;
        for(int i = 0; i < revealed.length(); i++)
        {
            if(revealed.substring(i,i+1).equals("-"))
            {
                c++;
            }
        }
        return c;
    }

    public void guess(String g)
    {
        if(inList(g)==false)
        {
            for(int i = 0; i < revealed.length(); i++)
            {
                if(actual.substring(i,i+1).equals(g))
                {
                    String a = revealed.substring(0,i);
                    String b = revealed.substring(i+1);
                    revealed = a + g + b;
                }               
            }
            alreadyGuessed.add(g);
            guesses--;
        }
    }

    public boolean inList(String r)
    {
        for(int i = 0; i < alreadyGuessed.size(); i++)
        {
            if(alreadyGuessed.get(i).equals(r))
            {
                return true;
            }
        }
        return false;
    }

    public void guessWord(String words)
    {
        if(words.equals(actual))
        {
            revealed = actual;
            guesses--;
        }
        else
        {
            guesses-=3;
        }
    }

    public String getRevealed()
    {
        return revealed;
    }

    public int getGuesses()
    {
        return guesses;
    }

    public boolean player1Wins()
    {
        return guesses <= 0 && !revealed.equals(actual);
    }

    public boolean player2Wins()
    {
        return revealed.equals(actual);
    }

    public boolean playAgain(String a, String b)
    {
        return a.equals("Y") && b.equals("Y");
    }
}
