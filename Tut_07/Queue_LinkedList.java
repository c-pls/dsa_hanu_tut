package Tut_07;

public class Queue_LinkedList<T> {
	Node <T> front = null;
	Node <T> rear = null;
	
	// print the item
	public void printList() {
		Node temp = this.front;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	// isEmpty(): Check if the stack is empty
	public boolean isEmpty() {
		if ( front == rear)
			return true;
		return false;
	}
	
	public void enqueue(int data) {
		Node temp = new Node(data);
		
		if ( this.rear == null) {
			this.front = this.rear = temp;
		}
		
		// Add the new node at the end of queue and chagne rear
		this.rear.next = temp;
		this.rear = temp;
	}
	
	public void dequeue() {
		if ( this.front == null) {
			System.out.println("Nothing left to dequeue");
		}
		// Remove the first node
		this.front = this.front.next;
		
		// If front = null, -> rear = null
		if ( this.front == null) {
			this.rear = null;
		}
	}
	
	public int peek(){
		if ( this.isEmpty())
			return -1;
		return (int)this.front.data;
	}

}
