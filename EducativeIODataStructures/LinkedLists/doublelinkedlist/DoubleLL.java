package com.doublell;

public class DoubleLL<T>{
	
	public class Node{
		public T data;
		public Node prevNode;
		public Node nextNode;
	}
	
	public Node headNode;
	public int size;
	
	public DoubleLL(){
		headNode = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return (size == 0);
	}
	
	public void insertAtHead(T data){
		// Create a Node object
		Node newNode = new Node();
		
		newNode.data = data; // Put data in data
		newNode.nextNode = headNode; // Set the newNode.nextNode to the current headNode
		newNode.prevNode = null; // Set the newNode.prevNode to null as it wont be pointing to any node
		
		// If the headNode is not null, then the current headNode.prevNode should be updated from null to the newNode
		if(headNode != null) headNode.prevNode = newNode;
		
		headNode = newNode; // Set the headNode to the newNode
		size++; // Increment the size of the linked list
	}
	
	public void insertAtTail(T data){
		// If the list is empty, insert at head
		if(isEmpty()) {
			insertAtHead(data);
			return;
		}
		
		// Create a new Node object
		Node newNode = new Node();
		newNode.data = data; // Assign the data
		newNode.nextNode = null; // Set the newNode.nextNode to null as it is inserted at last
		
		// Create a last object for traversing
		Node last = headNode;
		// Traverse till the end of the list and find the last element. The reason why last.nextNode is used instead of last is, when last is compared to null, it will return null object itself and will lead to NullPointer error
		while(last.nextNode != null){
			last = last.nextNode;
		}
		
		last.nextNode = newNode; // Assign the last.nextNode to the newNode
		newNode.prevNode = last; // Assign newNode.prevNode to the last element found in traversal
		
		size++; // Increment the size of the list
	}
	
	public void insertAfter(T data, T previous){
		// If empty dont do anything
		if(isEmpty()) return; 
		
		// Create a new node
		Node newNode = new Node();
		newNode.data = data; // Assign the data to the new node
		
		// Instantiate a curr node for traversing
		Node curr = headNode; 
		while(curr != null){
			if(curr.data == previous){ // If the value at which new data needs to be inserted is found
				newNode.nextNode = curr.nextNode; // Connect the newNode.nextNode to curr.NextNode
				curr.nextNode = newNode; // Connect curr.nextNode to newNode
				newNode.prevNode = curr; // Connect the newNode.prevNode to the curr node
				return;
			}
			curr = curr.nextNode; // Else, go to the next element and check
		}
	}
	
	public void deleteAtHead(){
		if(isEmpty()) return; // If empty don't do anything
		
		headNode = headNode.nextNode; // Set the headNode to the current head's next node
		headNode.prevNode = null; // Set the headNode.prevNode to null as it is the head now
		size--; // Decrement the size
		return;
	}
	
	public void delete(T data){
		if(isEmpty()) return; // If empty, do nothing
		
		Node curr = headNode; // Instantiate a node for traversal
		
		if(curr.data.equals(data)){ // If it is found at the head, use deleteAtHead()
			deleteAtHead();
		}
		
		// Traverse through the list
		while(curr != null){ 
			if(curr.data.equals(data)){ // When the data point which needs to be deleted is found
				curr.prevNode.nextNode = curr.nextNode; 
				size--;
				return;
			}
			curr = curr.nextNode;
		}
	}
	
	public boolean search(T data){
		if(isEmpty()) return false;
		
		Node curr = headNode;
		while(curr != null){
			if(curr.data == data) return true;
			curr = curr.nextNode;
		}
		
		return false;
	}
	
	public void printList(){
		if(isEmpty()){
			System.out.println("List is empty");
			return;
		}
		
		Node currNode = headNode;
		
		while(currNode.nextNode != null){
			System.out.print(currNode.data.toString() + " <==> ");
			currNode = currNode.nextNode;
		}
		System.out.println(currNode.data.toString() + " <==> null");
	}
}

















