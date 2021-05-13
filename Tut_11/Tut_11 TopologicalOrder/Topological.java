package Tut11_TopologicalOrder;

import java.util.Stack;

import Tut_11_BFS.GVertex;

public class Topological {
	public Topological() {
		
	}
	private static GVertex[] v;
	public static int[][]a = {
			{0, 0, 0, 1, 1, 0, 0, 0},
			{0, 0, 0, 1, 0, 0, 0, 0},
			{0, 0, 0, 0, 1, 0, 0, 1},
			{0, 0 ,0, 0, 0, 1, 1, 1},
			{0, 0, 0, 0, 0, 0, 1, 0},
			{0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0}
	};
	public static int n = 8;
	
	
	public static void Top_Order(int index) {
		v[index].setColor('Y');
		
		Stack<Integer> s = new Stack<>();
		s.push(index);
		while (! s.isEmpty() ) {
			int u  = s.pop();
			for (int w = 0; w != n; w++) {
				if(a[u][w]== 1 && v[w].getColor() == 'B') {
					Top_Order(w);
				}
			}
		}
		System.out.println(v[index].getLabel());
		
	}
	public static void main(String[] args) {
		v = new GVertex[n];     //Create an empty list of n vertices
        // Initialize vertex's label
        v[0]=new GVertex('A');
        v[1]=new GVertex('B');
        v[2]=new GVertex('C');
        v[3]=new GVertex('D');
        v[4]=new GVertex('E');
        v[5]=new GVertex('F');
        v[6]=new GVertex('G');
        v[7]=new GVertex('H');
        
        Top_Order(0);
     


        
	}

}
