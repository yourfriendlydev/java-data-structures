package com.singlell;

public class SingleLL<T>{
	
	// Defining the class
	public class Node {
		public T data;
		public Node nextNode;
	}
	
	// Defining the elements
	public Node headNode;
	public int size;
	
	// Defining the initial constructor
	public SingleLL(){
		headNode = null;
		size = 0;
	}
	
	public boolean isEmpty(){
		return(size == 0);
	}
	
	public void insertAtHead(T data){
		Node newNode = new Node();
		
		newNode.data = data;
		// As we are trying to insert the node at the head, the nextNode will point to the current head
		newNode.nextNode = headNode; 
		// Now headnode will be pointed to the newNode as everything is being inserted at the head
		headNode = newNode;
		size++;
	}
	
	public void insertAtTail(T data){
		// When the list is empty, you need to insert it at the head
		if(isEmpty()){
			insertAtHead(data);
			return;
		}
		
		// Create a node with data as data and as the node is being inserted at the end, the nextNode should be pointed to null
		Node newNode = new Node();
		newNode.data = data;
		newNode.nextNode = null;
		
		// To find the last element, we do a traversal through the linked list until the `lastNode` is not pointing to `null`
		Node last = headNode;
		while(last.nextNode != null){
			last = last.nextNode;
		}
		
		// Once the `lastNode` is pointed to null, the while loop breaks leaving the `last` element which is pointing to `null`. The `newNode` is pointed to `last.nextNode`. The size is incremented.
		last.nextNode = newNode;
		size++;
	}
	
	public void insertAfter(T data, T previous){
		// Create a new node to be inserted
		Node newNode = new Node();
		// Assign the data to it
		newNode.data = data;
		
		// Start from headNode
		Node currNode = this.headNode;
		
		// Traverse through the linkedlist until the currNode is not null and currNode data is not equal to the previous(where to be inserted). This is to find out the node where the previous is existing.
		while(currNode != null && currNode.data != previous){
			currNode = currNode.nextNode;
		}
		
		// After finding out the currNode and checking that it is not null, assign
		// 1. Assign the newNode.nextNode to currNode.nextNode, as the currNode.nextNode should be pointed to the newNode.nextNode
		// 2. And the currNode.nextNode should be pointed to the newNode
		// 3. Increment the size
		if(currNode != null){
			newNode.nextNode = currNode.nextNode;
			currNode.nextNode = newNode;
			size++;
		}
	}
	
	// This is a duplicate of above function written for my understanding
	public void insertAt(T data, T previous){
		Node newNode = new Node();
		newNode.data = data;
		
		Node currNode = headNode;
		
		while(currNode != null  && currNode.data != previous){
			currNode = currNode.nextNode;
		}
		
		if(currNode != null){
			newNode.nextNode = currNode.nextNode;
			currNode.nextNode = newNode;
			size++;
		}
		
	}
	
	public boolean searchNode(T data){
		// If the list is empty, return false
		if(isEmpty()) return false;
		
		// Instatiate a node pointing to headNode
		Node currNode = headNode;
		
		// Traverse through linkedList till end
		while(currNode != null){
			// In each loop check if currNode.data is matching to data searching for, if found, return true
			if(currNode.data == data) return true;
			
			// If the data searching for is not found, move to the nextNode
			currNode = currNode.nextNode;
		}
		// If none of the conditions put above are true, then data searching for is not present in the linked list
		return false;
	}
	
	public void deleteAtHead(){
		// Check if the list is empty
		if(isEmpty()) return;
		
		// Point the headNode to the headNode.nextNode
		headNode = headNode.nextNode;
		size--;
	}
	
	public void deleteByValue(T data){
		// Check if the list is empty
		if(isEmpty()) return;
		
		// currNode to traverse
		Node currNode = headNode;
		// prevNode to keep a track of where to attach the nextNode of the currNode
		Node prevNode = null;
		
		// Traverse through the LinkedList and break the loop when currNode becomes null or currNode.data is equal to the data to be deleted. 
		// Using the AND gate allows to check both conditions simultaneously
		while(currNode != null && currNode.data != data){
			prevNode = currNode;
			currNode = currNode.nextNode;
		}
		
		// After the traversal, if it is not pointing to null, then connect the prevNode.nextNode to the currNode.nextNode;
		if(currNode != null){
			prevNode.nextNode = currNode.nextNode;
			size--;
		}
	}
	
	public void printList(){
		if(size == 0){
			System.out.println("List is empty");
			return;
		}
		
		Node temp = headNode;
		while(temp.nextNode != null){
			System.out.print(temp.data.toString() + " -> ");
			temp = temp.nextNode;
		}
		System.out.println(temp.data.toString() + " -> null");
	}
} 