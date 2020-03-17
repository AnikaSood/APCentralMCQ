public class Unit4Q5
{
   public static void main()
   {
     int total = 0;
     for (int k = 0; k <= 100; k += 2){
         total += k;
         System.out.println("k has: "+ k + "and total has" + total);

        }  
     System.out.println("Loop exited. Total has: " + total);
     
     /* Replace for loop with this
      * for (int k = 1; k <= 101; k += 2)
     {
         total += k + 1;
         System.out.println("k has: "+ k + "and total has" + total);

        }
        System.out.println("Loop exited. Total has: " + total);

    */
    }
}
