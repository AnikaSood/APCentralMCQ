
/**
 * Write a description of class unit6MC here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class unit6MC
{
    public  static void main()
    {
        int numArr[] = {1, 3, 5, 7, 9};
        System.out.println("Num arr before the loop has:"+numArr.toString());
        
for (int k = 0; k < numArr.length / 2; k++)
{

int temp = numArr[k];

numArr[k] = numArr[numArr.length - k - 1];

numArr[numArr.length - k - 1] = temp;
        System.out.println("temp has:"+temp);


}
        System.out.println("Num arr  after the loop has"+numArr.toString());

 }
  
}
