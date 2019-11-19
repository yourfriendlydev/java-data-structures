import com.singlell.SingleLL;

class Test{
	public static void main(String[] args){
		SingleLL<Integer> sll = new SingleLL<Integer>();
		// SingleLL<Integer> sll1 = new SingleLL<Integer>();
		// sll.printList();
		
		for(int i=0;i<11;i++){
			sll.insertAtTail(i);
			// sll1.insertAtTail(i);
		}
		
		// sll.printList();
		sll.insertAt(32,6);
		
		System.out.println("Original List");
		sll.printList();
		
		System.out.println("\nList after deletion of the 3 head items");
		for(int i=0; i<3; i++){
			sll.deleteAtHead();
		}
		sll.printList();
		
		System.out.println("\nList after deletion of the value \"7\" ");
		sll.deleteByValue(7);
		sll.printList();
		
		
		// System.out.println("The element \"7\" is in the linked list: " + sll.searchNode(7));
		// System.out.println("The element \"17\" is in the linked list: " + sll.searchNode(17));
	}
}