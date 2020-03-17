public class Unit4Q12
{
    public static void main()
    {
        System.out.println("Goal output:\n0\n11\n222\n3333");
        System.out.println("Answer choice a:\n");
        for (int k = 0; k < 4; k++)
        {
            for (int h = 0; h < k; h++)
            {
                System.out.print(k);
            }
            System.out.println();

        }
        
        System.out.println("Answer choice b:\n");
        for (int k = 0; k < 4; k++)
        {
            for (int h = 0; h < k; h++)
            {
                System.out.print(k);
            }
            System.out.println();

        }
        
        System.out.println("Answer choice c:\n");
        for (int k = 0; k < 4; k++)
        {
            for (int h = 0; h < 3; h++)
            {
                System.out.print(k);
            }
            System.out.println();

        }
        
        System.out.println("Answer choice d:\n");
        for (int k = 0; k < 4; k++)
        {
            for (int h = k; h >= 0; h--)
            {
                System.out.print(k);
            }
            System.out.println();

        }
        
        System.out.println("Answer choice e:\n");
        for (int k = 0; k < 4; k++)
        {
            for (int h = k; h <= 0; h--)
            {
                System.out.print(k);
            }
            System.out.println();

        }
        

        
    }
}
