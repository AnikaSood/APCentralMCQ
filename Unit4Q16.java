
public class Unit4Q16
{
    public static void main()
    {
        
        System.out.println("Count number of dollar signs printed:");
        int a = 100;
        int count=0;
        while (a > 1)
        {
            System.out.println("$");
            count++;
            a /= 2;
        }
        System.out.println("Signs printed should ==" + count);
    }
}
