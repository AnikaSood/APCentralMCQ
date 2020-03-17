
public class Unit5BQ4
{
   public static void main()
   {
       Gadget a = new Gadget();
       Gadget.setStatus(3);
       System.out.println(Gadget.getStatus()); //Testing method created by me
       
       Gadget b = new Gadget();
       System.out.println(b.getStatus());
    }
}
