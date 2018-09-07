
/**
 * Write a description of class HangmanPlayer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HangmanPlayer
{
    private int points;
    private String name;
    private int role;
    private int roundsWon;
    public HangmanPlayer(int p, String n, int rol, int rw)
    {
        role = rol;
        points = p;
        name = n;
        roundsWon = rw;
    }
    
    public int getRole()
    {
        return role;
    }
    
    public void addPoints(int a)
    {
        points+=a;
    }
    
    public void won()
    {
        roundsWon++;
    }
    
    public int getRoundsWon()
    {
        return roundsWon;
    }
    
    public int getPoints()
    {
        return points;
    }
    
    public String getName()
    {
        return name;
    }
}
