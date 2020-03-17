
public class Unit4Q14
{
    public static void main()
    {
        for (int j = 0; j < 4; j++)
        {
            for (int k = 0; k < j; k++)
            {
                System.out.println("hello");
            }
        }
        
        for (int j = 0; j < 4; j++)
        {
            for (int k = j; k < 4; k++)
            {
                System.out.println("hello");
            }
        }
    }
}
