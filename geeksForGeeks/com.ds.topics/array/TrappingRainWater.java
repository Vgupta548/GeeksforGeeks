package array;

import java.util.Stack;

/**
 * @author Vipin Gupta
 *
 * Mar 25, 2018
 */
public class TrappingRainWater {

	/**
	 * This Method is Used For
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] containerHeight = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
		System.out.println("----------------------------------------------------");
		long maxArea = totalWater_v2(containerHeight);
		maxArea = totalWater_v2(containerHeight);
		System.out.println("maxArea "+maxArea);
		System.out.println("----------------------------------------------------");
		containerHeight = new int[]{10,8,1,1,1,1,1,1,2,1};
		maxArea = totalWater_v2(containerHeight);
		System.out.println("maxArea "+maxArea);


	}

	/**
	 * This Method is Used For
	 * @param h
	 * @return
	 */
	private static long totalWater_v2(int[] h) {
		// TODO Auto-generated method stub
		int  j  = 0;
		long area = 0;
		Stack<Integer> stack = new Stack<Integer>();
		
		while(h[j] == 0){
			j++;
		}
		stack.push(j);
		j++;
		int largest = j;
		int prevMax = j;
		while(j<h.length){
			System.out.println("----");
			printStack(stack);
			if(h[j] ==0){
				j++;
				continue;
			}
			if(h[largest] < h[j]){
				System.out.println("next height is ");
				while(largest < stack.peek()){
					stack.pop();
				}
					System.out.println(" greater than last largestHeight ");
				System.out.println("push "+j);
				stack.push(j);
				largest = j;
				prevMax = j;
				System.out.println("largest "+ largest);
			}else{
				while(prevMax > largest && h[prevMax] < h[j]){
					System.out.println("next Height is shorter than last Largest but bigger than prev max");
					System.out.println("pop "+stack.peek());
					stack.pop();
					prevMax = stack.peek();
					System.out.println(" prevMax "+prevMax);
				}
				stack.push(j);
				prevMax = j;
				System.out.println("push "+j);
				System.out.println("prevMax "+prevMax);
			}
			j++;
		}
		printStack(stack);
		
		int last = stack.pop();
		for(Integer s : stack){
			area += (last - s) * Math.min(h[last], h[s]);
		}
		return area;
	
	}
	
	private static void printStack(Stack<Integer> stack){
		System.out.println("printStack");
		for(Integer s : stack){
			System.out.println(s);
		}
		System.out.println("----");
	}

}
