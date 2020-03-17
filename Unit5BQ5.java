
public class Unit5BQ5
{
    private int numOunces;
    private static int numSold = 0;
    public Unit5BQ5(int numOz)
    {
        numOunces = numOz;
    }

    public static void sell(int n)
    {
        // numOunces += 5; RESULTS IN ERROR
        numSold += 5;
        
    }
}
