
public class Unit4Q8
{
    public static void main()
    {
        int n = 6;
        System.out.println("Original, n = 6, i = 1");
        for (int i = 1; i < n; i = i + 2)  // Line 2
        {
            System.out.print(i + " ");
        }
        
       System.out.println("\nModified");

        for (int i = 1; i <= n; i = i + 2)  // Line 2
        {
            System.out.print(i + " ");
        }
        
    }
}
