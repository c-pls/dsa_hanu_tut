package Tut11_DFS;

public class SLList {
	private SLNode head;

	public SLList() {
		head = null;
	}

	public boolean isEmpty() {
		if (head == null)
			return true;
		else
			return false;

	}

	private SLNode traversing(int pos) {
		int count = 1;
		SLNode current = head;
		while (count < pos) {
			count++;
			current = current.getNext();
		}
		return current;
	}

	public void add(SLNode newNode) {
		newNode.setNext(head);
		head = newNode;
	}

	public SLNode get(int pos) {
		if (!isEmpty())
			return traversing(pos);
		else
			return null;
	}

	public int getLength() {
		int count = 0;
		SLNode current = this.head;
		while (current != null) {
			count++;
			current = current.getNext();
		}
		return count;
	}

}
