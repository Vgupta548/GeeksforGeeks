
class SpecialStackMinElement{

//Stack object min which work as auxiliary stack
Stack<Integer> min = new Stack<Integer>();

/* Driver program to test SpecialStack methods */
    public static void main(String[] args) 
    {
        SpecialStackMinElement s = new SpecialStackMinElement();
        s.push(10);
        s.push(20);
        s.push(30);
        System.out.println(s.getMin());
        s.push(5);
        System.out.println(s.getMin());
    }
    
    //push elemnt in main Stack and also from min stack if less then prev min element
    private static void push(int i){
    
    }
    
    //pop element from main stack and also from min stack if less equal to top elemnt
    private static int pop(){
    
    }
    
    //Get min elemnt from min stack
    private static int getMin(){
    
    }

}
