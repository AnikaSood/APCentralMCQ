
public class Unit4Q6
{
    public static void main(int num)
    {
        int total = 0;

        while (num > 0){
            total += num % 10;
            num /= 10;
        }
        
        System.out.println(total);
      /*  Replace while loop w this
        for (int k = num; k > 0; k /= 10)
        {
            total += k % 10;
        }
        */
    }
}
