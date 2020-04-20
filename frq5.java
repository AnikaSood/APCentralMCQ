
/**
 * Write a description of class frq5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class frq5
{
  private String hostName;
  private String address;
  
  
  
  
  public frq5(String n, String a)
  {
      hostName = n;
      address = a;
  }
  /*QUESTION 1*/
  public Invitation(String a) //part d
  {
      address = a;
      hostName = new String("Host");
   }
  
  
  public String getHost() //part a 
  {
      return hostName;
  }
  
  public void updateAddress(String update) //part c
  {
      address = update;
   }
   
   public String getInfo(String name) //part d
   {
       String ret = "Dear " + name + ", please attend my event at "+ address + ". See you then, " +hostName;
       return ret;
   }
    
   
    
}
