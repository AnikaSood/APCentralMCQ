
public class Unit4Q15
{
    public static void main()
    {
        System.out.println("Original loop:");
        for (int i = 0; i < 5; i++) // Line 1
        {
            for (int j = 0; j < 5; j++)
            {
                int k = i + j;
                System.out.print(k + " ");
            }
        }
        
        System.out.println("Modified line one:");
        
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
