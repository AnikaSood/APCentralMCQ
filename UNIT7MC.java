
/**
 * Write a description of class UNIT7MC here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class UNIT7MC
{
    /*Question 14:
     * 
     * A does not include what will happen if it does not have target in the array, 
     * that's why option b is more ideal for this question. 
     */
    
    /*Question 15:
     * Method seqSearch returns the index of the first occurrence of 
     * target in arr or -1 if target does not appear in arr. 
     * Method seqSearch2 returns the value of target if it appears 
     * in arr and returns -1 otherwise.
     * 
     */
    
    public int seqSearch(int[] arr, int target)

{

for (int j = 0; j < arr.length; j++)

{

if (arr[j] == target)

{
System.out.println(j);

return j;

}

}

return -1;

}


public int seqSearch2(int[] arr, int target)

{

for (int j : arr)

{

if (j == target)

{
System.out.println(j);
return j;

}

}

return -1;

}
}
