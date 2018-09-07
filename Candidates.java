import java.util.*;
/**
 * Write a description of class Candidates here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Candidates
{
    private Candidate[] cand;
    private int length;
    Scanner in = new Scanner(System.in);
    public void Enrol()
    {       
        System.out.print("Enter number of candidates: ");
        length = in.nextInt();
        cand = new Candidate[length];
        for(int i = 0; i < cand.length; i++)
        {
            cand[i] = new Candidate();
            cand[i].enter();
        }
    }
    
    public void search()
    {
        System.out.print("Enter score to search: ");
        int a = in.nextInt();
        boolean b = false;
        System.out.println("All candidates with this score: ");
        for(int i = 0; i < cand.length; i++)
        {
            if(cand[i].RScore()==a)
            {
                cand[i].display();
                b = true;
            }
        }
        if(b==false)
        {
            System.out.println("No candidates match score!");
        }
    }
    
    public void getPass()
    {
        System.out.println("All candidates with score of 33+: ");
        for(int i = 0; i < cand.length; i++)
        {
            if(cand[i].RScore()>=33)
            {
                cand[i].display();
            }
        }
    }
}

