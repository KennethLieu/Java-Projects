import java.util.*;
/**
 * Write a description of class Employee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employees
{
    private int Eno;
    private String Ename;
    private double[] hour;
    private double[] salary;
    private double rate;
    private double gross_salary;

    public Employees()
    {
        Eno = 0;
        Ename = "";
        hour = new double[7];
        salary = new double[7];
        rate = 0.0;
        gross_salary = 0.0;
    }

    public void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter employee num: ");
        Eno = in.nextInt();
        System.out.print("Enter employee name: ");
        Ename = in.next();
        double c = 0;
        for(int i = 0; i < hour.length; i++)
        {
            do
            {
                System.out.print("Enter number of hours for day " + (i+1) + ": ");
                c = in.nextDouble();
            }while(c<0||c>24);
            hour[i] = c;
        }
        System.out.print("Enter hourly wage: ");
        rate = in.nextDouble();
        calculate();
    }

    public void display()
    {
        System.out.println("Employee #: " + Eno);
        System.out.println("Employee name: " + Ename);
        for(int i = 0; i < hour.length; i++)
        {
            System.out.println("Day " + (i+1) + " hours: " + hour[i] + " Wage: " + salary[i]);
        }
        System.out.println("Hourly Wage rate: " + rate);
        System.out.println("Gross salary: " + gross_salary);
    }

    public void calculate()
    {
        double sum = 0;
        for(int i = 0; i < salary.length; i++)
        {
            if(hour[i]>12.00)
            {
                double s = (rate*8)+(4*(rate*1.5))+((rate*2)*(hour[i]-12));
                switch(i)
                {
                    case 0: case 6: s *= 2; break;
                }
                salary[i] = s;
            }
            else if(hour[i]>8.00)
            {
                double s = (rate*8) + ((hour[i]-8)*(rate*1.5));
                switch(i)
                {
                    case 0: case 6: s *= 2; break;
                }
                salary[i] = s;
            }
            else
            {
                double s = rate * hour[i];
                switch(i)
                {
                    case 0: case 6: s *= 2; break;
                }
                salary[i] = s;
            }
            sum += salary[i];
        }
        gross_salary = sum * 52;
    }
}

