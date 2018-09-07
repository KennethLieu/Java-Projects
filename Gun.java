
/**
 * Write a description of class Gun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gun
{
    private int numBullets;
    private int maxCap;
    private double condition;

    public Gun(int max, double cond)
    {
        maxCap = max;
        condition = cond;
    }

    public void shoot()
    {
        numBullets = Math.max(0,numBullets--);
        condition = Math.max(0, condition-=0.05);
    }

    public void reload()
    {
        numBullets = maxCap;
    }

}
