import java.util.*;
/**
 * Write a description of class Candidate here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Candidate
{
    private int Cno;
    private String Cname;
    private int score;
    
    public void enter()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter candidate number: ");
        Cno = in.nextInt();
        System.out.print("Enter candidate name: ");
        Cname = in.next();
        System.out.print("Enter score: ");
        score = in.nextInt();
    }
    
    public void display()
    {
        System.out.println("Candidate number: " + Cno);
        System.out.println("Candidate name: " + Cname);
        System.out.println("Candidate score: " + score);
    }
    
    public int RScore()
    {
        return score;
    }
    

}




