import java.util.*;
public class frq4
{
    public static void main()
    {
            longestStreak("");
            
            System.out.println("Result has: " + getPlayer2Move(2));

    }
    
    int startingCoins;
    int maxRounds;
 /******QUESTION 1*******/
    public static void longestStreak( String str )
    {
        int largestLen = 1;
        char largestLetter= 0;

        int testLen = 1;
        char testLetter;

        char curr;
        char next;
        
        int i;
        if (str.length()==0)
        {
            System.out.println("Empty String- Error");
        }
        else
        {
        for (i = 0; i<str.length()-1; i++)
        {
            curr = str.charAt(i);
            next = str.charAt(i+1);
            
            if ( curr == next )
            {
                testLen += 1;
                testLetter = curr;
                
                if (testLen > largestLen)
                {
                    largestLetter = testLetter;
                    largestLen = testLen;
                }
                
            }
            else
            {
                testLen = 1;
                testLetter = next;
            }
            
           
        }
        
        System.out.println(largestLetter +" " + largestLen);
    }
    }
    
 /*******QUESTION 2********/
    //part a
    public static int getPlayer2Move(int round)
    {
        int result;
        
        if (round%3 == 0) //if the remainder is 0, it is divisible y 3
            result = 3;
        else
            if (round%2 == 0)
                result = 2;
            else
                result = 1;
                
        return result;
    }
    
    //part b
    public void playGame()
    {
        //creating necessary variables
        int p1Coins = startingCoins;
        int p2Coins = startingCoins;
        int round = 1;
        int diff;
        boolean exit = false;
        
        while(exit == false)
        {
            if(round == maxRounds || p1Coins <3|| p2Coins <3) //check if condidtions are good
                exit = true;
                
           diff = Math.abs(getPlayer1Move() - getPlayer2Move(round));
           
           //update coins depending on the difference between each player's stash
           if (diff == 2)
            {
                p1Coins += 2;
            }
            else
            {
                if(diff == 1)
                {
                    p2Coins++;
                }
                else
                    p2Coins++;
                    
                    
            }
            
            round ++; //increase round number
        }
        
        //display game results
        if (p1Coins==p2Coins)
        {
            System.out.println("tie game");
        }
        else
            if (p1Coins>p2Coins)
            {
                System.out.println("player 1 wins");
            }
            else
                System.out.println("player 2 wins");
        
    }
}

