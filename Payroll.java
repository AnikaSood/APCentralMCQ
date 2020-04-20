public class Payroll

{

private int[] itemsSold; // number of items sold by each employee

private double[] wages; // wages to be computed in part (b)

 

/** Returns the bonus threshold as described in part (a).

*/

public double computeBonusThreshold()

{
    double sum=0;
    for (double curr: itemsSold)
    {
        sum+= curr;
    }
    
    int maxPos=0, max1=0, max2=0, j=0;
    
    for (int i = 0; i <itemsSold.length-1; i++)
    {
        max1 = itemsSold[i];
        maxPos = i;
        
        for(j = i+1; j<itemsSold.length; j++)
   
            if (max1<itemsSold[j])
            {
                max1= itemsSold[j];
                maxPos = j;
            }

        int temp = max1;
        itemsSold[i] = itemsSold[j];
        itemsSold[j]= temp; 
    }
    
    max2 = itemsSold[maxPos-1];
    double threshold = (sum- max1 -max2 / (itemsSold.length -1));

    return threshold;
}

 

/** Computes employee wages as described in part (b)

* and stores them in wages.

* The parameter fixedWage represents the fixed amount each employee

* is paid per day.

* The parameter perItemWage represents the amount each employee

* is paid per item sold.

*/

public void computeWages(double fixedWage, double perItemWage)

{
    for(int i = 0; i<itemsSold.length; i++)
    {
        if (itemsSold[i]>computeBonusThreshold())
        {
            wages[i] = fixedWage +perItemWage*itemsSold[i];
            wages[i]= wages[i]*(1.1);
        }
        else
            wages[i] = fixedWage +perItemWage*itemsSold[i];

    }

}

 

// Other instance variables, constructors, and methods not shown.

}