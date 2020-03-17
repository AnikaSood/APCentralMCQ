
public class Unit4Q15
{
    public static void main()
    {
        for (int i = 0; i < 5; i++) // Line 1
        {
            for (int j = 0; j < 5; j++)
            {
                int k = i + j;
                System.out.print(k + " ");
            }
        }
        for (int i = 0; i > 5; i++) // Line 1
        {
            for (int j = 0; j < 5; j++)
            {
                int k = i + j;
                System.out.print(k + " ");
            }
        }
    }
}
