

public class Unit2
{
    public static void main()
    {
        //QUESTION 1  
        Thing someThing; 
        //System.out.println("D. " + someThing.toString()); //this causes an error when uncommented because
        //the someThing object is not initialized and contains null
     
        //QUESTION 2   
        int val = (int)(Math.random() * 4 + 1); //this is choice d, and it works. other options do 
        //not satisfy the condition
        val *= 2;
        System.out.println(val);
    }
    
}

