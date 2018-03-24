package stack;
/**
 * @author Vipin Gupta
 *
 * Mar 17, 2018
 */

public class FindMiddleElementInStack{

/*
  * Deleting an element from middle is not O(1) for array. 
  * Also, we may need to move the middle pointer up when we push an element and move down when we pop().
  * In singly linked list, moving middle pointer in both directions is not possible.
*/
//The idea is to use Doubly Linked List (DLL)
  class DubleLinkList{
    DubleLinkList next;
    DubleLinkList prev;
    int data;
  }
  
    public static void main(String[] arg){
        FindMiddleElementInStack s = new FindMiddleElementInStack();
        s.push(1);
        s.push(15);
        s.push(11);
        s.push(14);
        s.push(13);
        s.findMiddleElement();
        s.pop();
        s.findMiddleElement();
        s.push(81);
        s.deleteMiddleElement();
        s.findMiddleElement();
        s.deleteMiddleElement();
        s.pop();
    }
    
    /*Function to push element in stack using DLL
     and adjust DLL top pointer and middle Elemnt pointer accordingly */
    private static void push(int i){
    
    }
    
    /*Function to pop element in stack using DLL
     and adjust DLL top pointer and middle Elemnt pointer accordingly */
    private static int pop(){
		return 0;
    
    }
    
   /* Function to return middle element in stack using DLL */
    private static int findMiddleElement(){
		return 0;
    
    }
    
     /* Function to delete middle element in stack using DLL
      * and adjust middle Elemnt pointer accordingly 
     */
    private static void deleteMiddleElement(){
    
    }
}
