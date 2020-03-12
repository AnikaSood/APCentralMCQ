public class Unit1
{
   public static void main()
   {
       System.out.println("Question 1.3");
       System.out.println("1. " + (2 / 5 % 3)); //eval to 0
       System.out.println("2. " + (2/ (5 % 3))); //eval to 1
       System.out.println("3. " +( 2 / 5 + 1)); //eval to 1
       
       //Answer is option D (both 2 and 3 are correct)
       
       System.out.println("Question 1.5");
       double d  = 0.25;
       int i = 3; 
       double diff = d - i;
       System.out.println((int)diff - 0.5);
       
       //Answer is option B (-2.5 is printed out)

       
       System.out.println("Question 1.5");
       double fact1 = 1 / 2;
       double fact2 = 3 * 4;
       double product = fact1 * fact2;
       System.out.println(product); //prints out 0 
       
       //Answer is option b because a part of the fraction 1/2 should be cast to a 
       //double to prevent truncating
    }
}
