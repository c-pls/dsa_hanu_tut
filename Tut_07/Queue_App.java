package Tut_07;

public class Queue_App {
	public static void main(String[] args) {
		Queue_LinkedList<Integer> q = new Queue_LinkedList<Integer>();
		System.out.println(q.isEmpty());
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(3);
		q.printList();
		System.out.println(q.isEmpty());
		System.out.println(q.peek());
		System.out.println("Dequeue");
		q.dequeue();
		q.printList();
		System.out.println( "\n" + q.peek());
	}

}
