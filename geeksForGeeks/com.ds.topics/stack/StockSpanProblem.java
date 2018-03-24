package stack;

/*
  * @author Vipin Gupta
  * The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate span 
  * of stock’s price for all n days. 
  * The span Si of the stock’s price on a given day i is defined as the maximum number of consecutive days just before the given day, 
  * for which the price of the stock on the current day is less than or equal to its price on the given day.
  * For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85},
  * then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}
  * Mar 17, 2018
 */
 
 class StockSpanProblem{
 
 // Driver program to stock span problem
    public static void main(String[] args) 
    {
        int price[] = {10, 4, 5, 90, 120, 80};
        int n = price.length;
        int S[]= new int[n];
         
        // Fill the span values in array S[]
        calculateSpan(price, n, S); 
         
        // print the calculated span values
       // printArray(S);
    }
    
    //  method to calculate stock span values
    static void calculateSpan(int price[], int n, int S[])
    {
    
    }
 
 }
