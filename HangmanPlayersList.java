import java.util.*;
/**
 * Write a description of class HangmanPlayersList here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HangmanPlayersList
{
    private List<HangmanPlayer> list;
    
    public HangmanPlayersList()
    {
        list = new ArrayList<HangmanPlayer>();
    }
    
    public void add(HangmanPlayer b)
    {
        list.add(b);
    }
    
    public List<HangmanPlayer> getList()
    {
        return list;
    }
}
