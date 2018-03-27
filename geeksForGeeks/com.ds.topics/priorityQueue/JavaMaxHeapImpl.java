package priorityQueue;

import java.util.PriorityQueue;

/**
 * @author Vipin Gupta
 *
 * Mar 24, 2018
 */
public class JavaMaxHeapImpl {
	
	int[] Heap;
	int size;
	int maxSize;
	
	int FRONT = 1;
	
	JavaMaxHeapImpl(int maxSize){
		this.maxSize = maxSize;
		Heap = new int[maxSize+1];
		Heap[0] = Integer.MAX_VALUE; 
	}
	
	private int leftChild(int i){
		return 2*1;
	}
	
	private int rightChild(int i){
		return 2*1 + 1;
	}
	
	private int parent(int i){
		return i/2;
	}
	
	private void swap(int x, int y){
		int temp = Heap[x];
		Heap[x] = Heap[y];
		Heap[y] = temp;
		
	}
	
	private boolean isLeafNode(int i){
		if(i<= size && i > parent(size)){
			return true;
		}else{
			return false;
		}
	}
	
	public void insert(int val){
		Heap[++size] = val;
		int current = size;
		while(Heap[parent(current)] < Heap[current]){
			swap(size, parent(size));
			current = parent(current);
		}
	}
	
	public int remove(){
		int popped = Heap[FRONT];
		Heap[FRONT] = Heap[size--];
		maxHeapify(FRONT);
		return popped;
	}
	
	public int getMax(){
		return Heap[FRONT];
	}
	
	
	private void maxHeapify(int pos){
			if(!isLeafNode(pos))
				if(Heap[pos] < Heap[leftChild(pos)] || Heap[pos] < Heap[rightChild(pos)] ){
					if(Heap[leftChild(pos)]> Heap[rightChild(pos)]){
						swap(pos, leftChild(pos));
						maxHeapify(leftChild(pos));
					}else{
						swap(pos, rightChild(pos));
						maxHeapify(rightChild(pos));
					}
		}
	}
	
	
	

	/**
	 * This Method is Used For
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();
		
	}

}
