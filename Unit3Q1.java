public class Unit3Q1
{
    public static void main(int temp) //Run this method & pass 30 to temp. Will not work correctly
    {
        String weather;
        if (temp <= 31)
        {
            weather = "cold";
        }
        else 
        {
           weather = "cool";
        }
        if (temp >= 51)
        {
            weather = "mederate";
        }
        else
        {
            weather = "warm";
        }
    }
}
