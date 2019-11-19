import com.doublell.DoubleLL;

public class Test{
	public static void main(String[] args){
		DoubleLL<Integer> dll = new DoubleLL<Integer>();
		
		for(int i=0;i<11;i++){
			dll.insertAtTail(i);
		}
		
		
		System.out.println("\nThe final double linked list");
		dll.printList();
		
		System.out.println("\nThe double linked list after deleting \"0\"");
		dll.delete(7);
		dll.printList();
		
		System.out.println("\nDouble linked list inserting \"32\" after \"4\" ");
		dll.insertAfter(32, 4);
		dll.printList();
		
		
		
		// System.out.println("\n The value \"90\" is available: " + dll.search(90));
	}
}