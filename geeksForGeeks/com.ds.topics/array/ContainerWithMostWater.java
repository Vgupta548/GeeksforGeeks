package array;

/**
 * @author Vipin Gupta
 *
 * given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai). 
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0).
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.

 * Note: You may not slant the container and n is at least 2.
 *
 * Mar 25, 2018
 */
public class ContainerWithMostWater {

	/**
	 * This Method is Used For
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] containerHeight = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
		long maxArea = LargestContainerArea_v2(containerHeight);
		System.out.println("maxArea "+maxArea);
		containerHeight = new int[]{10,8,1,1,1,1,1,1,2,1};
		maxArea = LargestContainerArea_v2(containerHeight);
		System.out.println("maxArea "+maxArea);

	}

	/**
	 * This Method is Used For We have to maximize the Area that can be formed 
	 * between the vertical lines using the shorter line as length and the distance
	 * between the lines as the width of the rectangle forming the area.
	 * By  Brute Force [Time Limit Exceeded]
	 * @param containerHeight
	 * @return
	 */
	private static long LargestContainerArea_v1(int[] containerHeight) {
		// TODO Auto-generated method stub
		long maxArea = 0;
		for(int i=0; i<containerHeight.length-1; i++){
			
			for(int j=i+1; j<containerHeight.length; j++){
				long minHeight = Math.min(containerHeight[i], containerHeight[j]);
				maxArea = Math.max(maxArea, (j-1) * (minHeight)); 
			}
		}
		return maxArea;
	}
	
	/**
	 * The intuition behind this approach is that the area formed between the lines will always be limited by the height of the shorter line.
	 *  Further, the farther the lines, the more will be the area obtained.

	 * We take two pointers, one at the beginning and one at the end of the array constituting the length of the lines.
 	 * Futher, we maintain a variable maxareamaxarea to store the maximum area obtained till now. At every step, 
 	 * we find out the area formed between them,
 	 * update maxareamaxarea and move the pointer pointing to the shorter line towards the other end by one step.
	 * @param containerHeight
	 * @return
	 */
	private static long LargestContainerArea_v2(int[] containerHeight) {
		// TODO Auto-generated method stub
		long maxArea = 0;
		int front = 0;
		int back = containerHeight.length -1;
		while(front < back){
			int currentArea = (back - front) * Math.min(containerHeight[front], containerHeight[back]) ; 
			maxArea = Math.max(maxArea, currentArea);
			if(containerHeight[front] < containerHeight[back]){
				front++;
			}else{
				back--;
			}
			
			System.out.println(maxArea);
		}
		return maxArea;
	}

}
