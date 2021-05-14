package Tut_07;


public class Stack_LinkedList <T> {
	Node <T> head = null;
	// print the item
	public void printList() {
		Node temp = this.head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	// isEmpty(): Check if the stack is empty
	public boolean isEmpty() {
		if (this.head == null)
			return true;
		return false;
	}

	// push(itemType newItem): Add a new item to the stack
	public void push(char c) {

		// Create a new node which data = c
		Node newNode = new Node(c);

		// chang the head to it
		newNode.next = this.head;
		this.head = newNode;
	}

	// pop(): Take out an item from the stack
	public void pop() {
		while (this.isEmpty()) {
			System.out.println("Nothing left to pop");
			break;
		}
		
		// Take the head out
		this.head = this.head.next;
	}
	
	//  peek(): Retrive an item from the stack (without deleting it)
	public char peek() {
		if ( this.isEmpty())
			System.out.println("Error. Nothing left to pop");
		
		
		return (char) this.head.data;
	}
	

}
