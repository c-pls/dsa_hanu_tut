package Tut_07;

public class Stack_App {
	public static void main(String[] args) {
		Stack_LinkedList s = new Stack_LinkedList<Character>();
		s.isEmpty();
		s.push('a');
		s.push('b');
		s.push('c');
		s.push('d');
		System.out.println(s.peek());
		s.printList();
		System.out.println("POP");
		s.pop();
		s.printList();
	}

}
