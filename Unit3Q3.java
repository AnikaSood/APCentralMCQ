
public class Unit3Q3
{
  public static void main(int x, int y)
  {
      //Option 1
      int result = 0;
      if (x > y)
      {
          result = x - y;
          System.out.print(result);
      }
      else if (x < y){
       result = y - x;
       System.out.print(result);
      }
      else
      {
          System.out.print(result);
        }
    
    //Option 2
   /* if (x<y)
    {
        System.out.println(y-x);
    }
    else 
    {
        System.out.println(x-y);
    }
   */
  
  //Test- try negative, positive, and 0. All numbers will produce same output for both options
}
}
