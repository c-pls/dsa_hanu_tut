package Tut_11_BFS;

public class ArrayQueue {
	private int[] items;
	private static final int maxSize = 1000;
	private int front;
	private int rear;

	// Constructor
	public ArrayQueue() {
		items = new int[maxSize];
		front = 0;
		rear = 0;
	}

	// Is Empty
	public boolean isEmpty() {
		return front == rear;
	}

	// Is Full
	public boolean isFull() {
		return rear == (front - 1) % maxSize;
	}

	// Enqueue
	public void enqueue(int newItem) {
		if (!isFull()) {
			items[rear] = newItem;
			rear = (rear + 1) % maxSize;
		}
	}

	// Dequeue
	public int dequeue() {
		if (!isEmpty()) {
			int dequeue = items[front];
			front = front + 1;
			return dequeue;
		}
		return -1;
	}

	public int peek() {
		if (!isEmpty()) {
			return items[front];
		}
		return -1;
	}

}
