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
		s = reverseString_v1(s);
		System.out.println(s);
		
		StringBuffer s1 = new StringBuffer("12345");
		 reverseString_v2(s1);
		System.out.println(s1);
	}
	
	/**
	 * This Method is Used For Reversing a String By Stack
	 * @param str
	 * @return
	 */
	private static String reverseString_v1(String str){
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
	
	private static void reverseString_v2(StringBuffer str){
		int n = str.length();
		for(int i=0; i<n/2; i++){
			char c = str.charAt(i);
			str.setCharAt(i, str.charAt(n-1-i)); 
			str.setCharAt(n-1-i, c);
		}
		
	}

}
