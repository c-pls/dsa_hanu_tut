package Tut9;

import java.util.Arrays;

public class Array_Tree {
	int maxSize = 10;
	private int n ;
	private String [] l;
	private int[] p;
	
	// Constructor
	public Array_Tree() {
		n = 0;
		l = new String[maxSize];
		p = new int[maxSize];
		Arrays.fill(p, -2);
	}
	
	 public void printTree()
	    {
	    	System.out.println("Tree currently: ");
	    	for (int i=0;i<n;i++)
	    	{
	    		System.out.print(l[i]+" ");		
	    	}
	    	System.out.println();
	    	for (int i=0;i<n;i++)
	    	{
	    		System.out.print(p[i]+" ");	
	    	}
	    	System.out.println();
	    }
	
	 
	// isFull
	public boolean isFull() {
		return n == maxSize;
	}
	
	// isEmpty
	public boolean isEmpty() {
		return n == 0;
	}
	
	// Add node
	public void addNode(String data, int parent ) {
		if(  ! isFull() ) {
			
			// Checking if the tree is empty
			if (n==0) {
				l[0] = data;
				p[0] = -1;
			} else {
				int pos = parent + 1;
				while ( pos < n && getParent(pos) <= parent) {
					pos++;
				}
				
				// Shift all element from pos one slot to the right
				for ( int i = n; i > pos; i--) {
					l[i] = l[i - 1];
					p[i] = p[i - 1];
				}
				l[pos] = data;
				p[pos] = parent;
				
			}
			n++;
			System.out.println("Added node " + data);
			
		}
		
	}
	
	// getParent
	public int getParent(int node) {
		return p[node];
	}
	
	public String getData(int node) {
		if ( node != -1) {
			return l[node];
		}
		return null;
	}
	
	public void setNode(int node, String data) {
		l[node] = data;
	}
	
	public int leftMostChild(int node) {
		int i = node + 1;
		// Find the first node i that i's parent is that node
		while ( i < n - 1 && getParent(i) != node) {
			i++;
		}
		if (getParent(i) == node) {
			return i;
		}
		return - 1;
	}
	
	public int rightSibling(int node) {
		int i = node + 1;
		// Find the first that have the same parent
		while ( i < n - 1 && getParent(i) != getParent(node)) {
			i++;
		}
		if ( getParent(i) == getParent(node)) {
			return i;
		}
		return - 1;
	}
	
	
	
	// Get degree
	public int getDegree(int node) {
		int deg = 0;
		for ( int i = node + 1; i < n; i++) {
			if ( p[i] == node ) {
				deg += 1;
			}
		}
		return deg;
	}
	
	// isLeaf
		public boolean isLeaf(int node) {
			return getDegree(node) == 0;		
		}
		
	// Count Leaves return the number of leaf in the tree
		
		public int countLeaves() {
			int counter = 0;
			for ( int i = 0; i < n; i++) {
				if ( isLeaf(i)) {
					counter += 1;
				}
			}
			
			return counter;
		}
		
		// getLevel return the level of current node
		public int getLevel(int node) {
			int level = 0;
			while (node != -1) {
				node = getParent(node);
				level += 1;
			}
			return level - 1;
		}
		
		public int getDepth() {
			return getLevel(n - 1);
		}
		
		public int search(String data) {
			for (int i = 0; i < n; i++) {
				if ( data == getData(i)) {
					return i;
				}
			}
			return -1;
		}
	
	 

	
	
	
	
	
	
	
	
	
	
	
}
