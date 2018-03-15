package stack;

import java.util.Stack;

/**
 * @author Vipin Gupta
 *
 * Mar 15, 2018
 */
public class ReverseAString {

	/**
	 * This Method is Used For Testing a Reverse a String By Stack
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "ReverseThisString";
		s = reverseString(s);
	}
	
	/**
	 * This Method is Used For Reversing a String By Stack
	 * @param str
	 * @return
	 */
	private static String reverseString(String str){
		Stack<Character> stack = new Stack<Character>();
		for(int i=0; i<str.length(); i++){
			stack.push(str.charAt(i));
		}
		String s = "";
		
		while(!stack.isEmpty()){
			s += stack.pop();
		}
		return s;
	}

}
