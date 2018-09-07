/**
 * Write a description of class BookTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BookTester
{
    public static void main(String[] args)
    {
        Book b1 = new Book();
        b1.enter();
        b1.display();
        if(b1.RBno()>1000)
        {
            System.out.println(b1.RBname() + " is a old Book!");
        }
        else
        {
            System.out.println(b1.RBname() + " is a new Book!");
        }
    }
}

