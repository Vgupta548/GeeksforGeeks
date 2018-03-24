package stack;
/*
  * @author Vipin Gupta
  * Mar 17, 2018
  * Create a data structure kStacks that represents k stacks.
  * k stacks should use the same array for storing elements. Following functions must be supported by kStacks.

  * push(int x, int sn) –> pushes x to stack number ‘sn’ where sn is from 0 to k-1
  * pop(int sn) –> pops an element from stack number ‘sn’ where sn is from 0 to k-1
*/




public class KStackArray{

  /* Mathod to test k stacks in a single array */
  public static void main(String[] args){
    MutiStackArray stacks = new MutiStackArray(4, 12);
    stacks.push(1, 1);
  
  }
  
  //Data structure kStacks that represents k stacks 
  public static class MutiStackArray{
    int k; //no of stacks
    int n; //array Size;
    int[] array; //array that holds staks element
    MutiStackArray(int k, int n){
      this.k = k;
      this.n = n;
      array = new int[n];
    }
    
     /* Method to Push element 'i' in 'sn' no stack */  
      private void push(int sn, int i){

      }

  /* Method to pop element from stack 'sn' */
      private int pop(int sn){
		return sn;

      }
      
    /* Method to check if array is Full or not */
      private boolean isFull(int sn){
		return false;

      }
      
    /* Method to cheek if array is Empty or not*/
      private boolean isEmpty(int sn){
		return false;

      }
  
  }

 

}
