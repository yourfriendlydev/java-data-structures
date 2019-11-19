import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class LearnLL{
	public static void main(String[] args){
		LinkedList<String> friends = new LinkedList<>();
		
		// "add" will by default add the element to the tail of the LinkedList
		friends.add("Krishna"); 
		friends.add("Tej");
		friends.add("Ch");
		
		System.out.println("Initial List: " + friends);
		
		friends.add(1, "Xigen");
		System.out.println("\nInserting \"Xigen\" at position 1: " + friends);
		
		friends.addFirst("Neha");
		System.out.println("\nAdding \"Neha\" at the beginning: " + friends);
		
		// "addLast" functions same way as the "add". It appends the element to the tail of the list
		friends.addLast("Bharati");
		System.out.println("\nAdding \"Bharati\" at the ending: " + friends);
		
		
		List<String> familyFriends = new ArrayList<>();
		familyFriends.add("Milton");
		familyFriends.add("Apple");
		
		System.out.println("\nArraylist of \"familyFriends\": " + familyFriends);
		
		friends.addAll(familyFriends);
		System.out.println("\nAdding the \"familyFriends\" to the \"friends\" LinkedList at the ending: " + friends);
		
		
		System.out.println("\nGet the first element of the Linked List: " + friends.getFirst());
		
		System.out.println("\nGet the last element of the Linked List: " + friends.getLast());
		
		System.out.println("\nGet the 2nd element of the Linked List: " + friends.get(1)); 
		
	}
}