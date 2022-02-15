package assignment;

import assignment.DoublyLinkedList.Node;

public class LinkedListOperations {
	
	/* 
	 * Function to reverse the Doubly linked list 
	 * Details of the Doubly Linked List are in the file DoublyLinkedList.java
	 * Reverse the provided list
    */ 
	public void reverseLinkedList(DoublyLinkedList list)
	{
		/*** *** Write YOUR CODE HERE *** ***/
		
		
		Node curr = list.head;
			
			
			while (curr != null ) {
				
				Node temp =   curr.previous;
				curr.previous = curr.next;
			    curr.next = temp;
				
				curr= curr.previous;
						
			}
			
			
			//list.head = curr.previous;
			//list.tail = curr.next;
				
				
			}

		
        
    
	
	
	/*
	 * Function to check if list is palindrome or not
	 * A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as madam or racecar.
	 * Return the boolean result of your implementation
	 */
	public boolean isPalindrome(DoublyLinkedList list)
	{
		/*** *** Write YOUR CODE HERE *** ***/
		
		
		
					
			
	
	}

}
