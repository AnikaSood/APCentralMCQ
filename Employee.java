
public class Employee
{
   
    private String name;
    private int wk_hours;
    private double pay_rate;

    public Employee(String nm, int hrs, double rt)
    {
        name = nm;
        wk_hours = hrs;
        pay_rate = rt;
    }
    public Employee(String nm, double rt)
    {
        name = nm;
        wk_hours = 20;
        pay_rate = rt;
    }
}
