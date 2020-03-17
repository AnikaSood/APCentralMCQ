
public class Unit4Q10
{
    public static void main(String word, int num)
    {
        String result = "";
        for (int k = num; k >= 0; k--)
        {
            result += word.substring(0, k);
            System.out.println("K= " +k+ " result = "+result);
            
        }
        
        System.out.println("Loop ended, result has " + result);
    }
}
