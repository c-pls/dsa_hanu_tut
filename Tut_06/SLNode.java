package Tut_06;

public class SLNode {
		private String data;
		private SLNode next;
		
		/*
		 * Constructor
		 * */
		public SLNode(String data) {
			this.data = data;
		}
	
		
		/*
		 * Set the next reference
		 * */
		public void setNext(SLNode Node) {
			this.next = Node;
		}
		
		
		/*
		 * return the next reference
		 * */
		public SLNode getNext() {
			return this.next;
		}
		
		/*
		 * return the value of the current node */
		public String getData() {
			return this.data; 
		}
		
		/*
		 * Assign data to the node */
		public void setData(String data) {
			this.data = data;
		}


		
		
		
	
}
