package Tut_06;

public class SLList {
	private SLNode head;

	// Constructor
	public SLList() {
		this.head = null;
	}

	// isEmpty
	public boolean isEmpty() {
		if (head == null)
			return true;
		return false;
	}

	// Add at the beginning
	public void add(SLNode newNode) {
		newNode.setNext(head);
		head = newNode;
	}

	// Traversing
	public SLNode traverse(int pos) {
		int count = 1;
		SLNode temp = head;
		while (count < pos) {
			count += 1;
			temp = temp.getNext();
		}
		return temp;
	}

	// Add a newNode at the pos
	public void addAt(int pos, SLNode newNode) {

		SLNode temp = traverse(pos - 1);
		newNode.setNext(temp.getNext());
		temp.setNext(newNode);
	}

	// remove
	public void remove(int pos) {
		if (!isEmpty()) {
			if (pos == 1) { // remove at the beginning
				head = head.getNext();
			}

			SLNode prevNode = traverse(pos - 1);
			SLNode currNode = prevNode.getNext();
			prevNode.setNext(currNode.getNext());

		}
	}
	
	public void removeAll() {
		head = null;
	}
	
	// Return the node at the pos
	public SLNode get(int pos) {
		if (!isEmpty()) {
			return traverse(pos);
		} 
			return null;					
	}
	
	// Return the current length of the node
	public int getLength() {
		int count = 1;
		SLNode temp = this.head;
		while ( temp != null) {
			count += 1;
			temp = temp.getNext();
		}
		return count;
	}
	
	
	// search for a string
	
	public int search(String data) {
		int count = 1;
		SLNode temp = head;
		while ( temp != null) {
			if ( temp.getData() == data) {
				return count;
			}
			count += 1;
			temp = temp.getNext();
		}
		return -1;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
