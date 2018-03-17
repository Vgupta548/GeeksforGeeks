/*
  * We are given a Queue data structure that supports standard operations like enqueue() and dequeue().
  * We need to implement a Stack data structure using only instances of Queue and queue operations allowed on the instances
  *
*/

class StackUsingQueues_v1{

/*This is method is used to test if Stack can be impement using two queue 
  * pop() operation costly and push O(1)
*/
Queue<Integer> q1 = new Queue<Integer>();
Queue<Integer> q2 = new Queue<Integer>();


  public static void main(String[] args){
    StackUsingQueues_v1 s = new StackUsingQueues_v1();
    s.push(1);
    s.push(2);
    s.push(3);
    s.push(4);
    s.push(5);
    s.pop();
    s.push(7);
    s.size();

  }
  
  /* Method to push the element in stack using queues in O(1) time */
  private static void push(int x){
  
  }

/* Method to pop the element from stack using queues by using two queues O(n) time */
  private static int pop(){
    Queue<Integer> q2 = new Queue<Integer>();
  }

/* Method to get the size of stack */
  private static int size(){
  
  }

}
