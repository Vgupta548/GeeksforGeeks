package linkedList;

/**
 * @author Vipin Gupta
 *
 * Mar 22, 2018
 */
public class AddTwoNumber {

	LinkList head1, head2, head3;
	
	/**
	 * This Method is Used For
	 * @param args
	 */
	
	void push(int i, int listNo){
		LinkList node = new LinkList(i);
		
		if(listNo == 1){
			node.next = head1;
			head1 = node; 
		}
		else if(listNo == 2){
			node.next = head2;
			head2 = node; 
		}else {
			node.next = head3;
			head3 = node; 
		}
	}
	
	int getSize(LinkList node){
		int count =0;
		while(node != null){
			count++;
			node = node.next;
		}
		return count;
	}
	
	int size1, size2;
	LinkList curr;
	LinkList addLists(){
		System.out.println("add");
		if(head1 == null){
			head3 = head2;
			return head3;
		}
		
		if(head2 == null){
			head3 = head1;
			return head3;
		} 
		
		System.out.println("both non-empty");
			size1 =getSize(head1);
			size2 =getSize(head2);
			
		System.out.println("size");
		System.out.println(size1);
		System.out.println(size2);
		if(size1 == size2){
			addEqual(head1, head2);
		}else{
			int diff = Math.abs(size1 -size2);
			if(size1 < size2){
				LinkList temp = head2 ;
				head2 = head1;
				head1 = temp;
			}
			
			 curr = head1 ;
			while(diff-- > 0){
				curr = curr.next;
			}
			System.out.println(curr.data);
			addEqual(curr, head2);
			
			propogateCarry(head1);
		}
		if (carry > 0)
            push(carry, 3);
		
		return null;
	}
	
	
	void propogateCarry(LinkList node){
		
		if(node != curr){
			propogateCarry(node.next);
			int sum = (node.data +carry);
			carry = sum /10;
			sum %= 10;
			push(sum,3);
		}
	}
	
	int carry;
	void addEqual(LinkList node1, LinkList node2){
		if(node2 == null){
			return;
		}else{
			addEqual(node1.next, node2.next);
			int sum = (node1.data + node2.data +carry);
			carry = sum /10;
			sum %= 10;
			push(sum,3);
		}
		
	}
	
	void printList(LinkList list){
		
		while(list != null){
			System.out.print(list.data +" ");
			list = list.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddTwoNumber a = new AddTwoNumber();
		int[] arr1 = {1,2,3,4,50};
		int[] arr2 = {8,9,10};
		
		for(int i=arr1.length-1; i>=0; i--){
			a.push(arr1[i], 1);
		}
		
		for(int i=arr2.length-1; i>=0; i--){
			a.push(arr2[i], 2);
		}
		
		a.addLists();
		
		a.printList(a.head3);

	}

}
