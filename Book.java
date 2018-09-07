import java.util.*;
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book
{
    private int Bno;
    private String Bname;
    private String author;
    private float price;
    
    public void enter()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter book number: ");
        Bno = in.nextInt();
        System.out.print("Enter book name: ");
        Bname = in.next();
        System.out.print("Enter book author: ");
        author = in.next();
        System.out.print("Enter price: ");
        price = in.nextFloat();
    }
    
    public void display()
    {
        System.out.println("Book#: " + Bno);
        System.out.println("Book name: " + Bname);
        System.out.println("Book author: " + author);
        System.out.println("Book price: " + price);
    }
    
    public int RBno()
    {
       return Bno; 
    }
    
    public String RBname()
    {
        return Bname;
    }
}

