import java.util.*;




public class UserName

{

private ArrayList<String> possibleNames;


public UserName(String firstName, String lastName)

{ 
    for( int i = 1; i <firstName.length(); i++)
    {
        possibleNames.add(lastName + firstName.substring(0, i));
            
    }


}

 

/** Returns true if arr contains name, and false otherwise. */

/*public boolean isUsed(String name, String[] arr)

{ /* implementation not shown  }*/

 

/** Removes strings from possibleNames that are found in usedNames as described in part (b).

*/

public void setAvailableUserNames(String[] usedNames)

{ 
    for( int i = 0; i< possibleNames.size(); i++)
    {
        if( isUsed(possibleNames.get(i),usedNames)==true)
        {
            possibleNames.remove(possibleNames.get(i));
    
        }
    }
    



}

}