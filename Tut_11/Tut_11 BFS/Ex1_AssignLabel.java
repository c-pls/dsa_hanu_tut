package Tut_11_BFS;

public class Ex1_AssignLabel {
	// the matrix given
	public static final int[][] a = {
 /*v0*/ 		{0, 0, 0, 1, 0, 0, 0, 0, 0},
 /*v1*/			{0, 0, 1, 0, 0, 0, 0, 0, 0},
 /*v2*/			{0, 1, 0, 0, 0, 0, 0, 0, 0},
 /*v3*/			{1, 0, 0, 0, 0, 0, 1, 1, 0},
 /*v4*/			{0, 0, 0, 0, 0, 1, 0, 0, 1},
 /*v5*/			{0, 0, 0, 0, 1, 0, 0, 0, 1},
 /*v6*/			{0, 0, 0, 1, 0, 0, 0, 0, 0},
 /*v7*/			{0, 0, 0, 1, 0, 0, 0, 0, 0},
 /*v8*/			{0, 0, 0, 0, 1, 1, 0, 0, 0}
			
	};
	public static int n = 9;
	 private static GVertex[] v;
	 // just the basic example
	 private static char label_data[] = {'A','B','C','D','E'};
	
	/**
	 * @effects: set the label from [A-Z]. The nodes
	 * in the same graph has the same label
	 * */
	public static void setLabel_Based_On_Same_Graph(int s, char label) {
		
		v[s].setLabel(label);
		
		ArrayQueue q = new ArrayQueue();
		q.enqueue(s);
		
		while( !q.isEmpty() ) {
			int u = q.dequeue();
			for ( int w = 0; w != n; w++) {
				if (a[u][w] == 1  && v[w].getLabel() == '\u0000') {
					v[w].setLabel(label);
					q.enqueue(w);
				}
			}
		}
	}
	
	public static void setLabelAll() {
		int k = 0;
		for ( int i = 0; i != n; i++) {
			if ( v[i].getLabel() != '\u0000') {
				continue;
			}
			setLabel_Based_On_Same_Graph(i, label_data[k]);
			k += 1;
		}
	}
	
	
	public static void main(String[] args) {
		v = new GVertex[n];     //Create an empty list of n vertices
        // Initialize vertex's label
        v[0]=new GVertex();
        v[1]=new GVertex();
        v[2]=new GVertex();
        v[3]=new GVertex();
        v[4]=new GVertex();
        v[5]=new GVertex();
        v[6]=new GVertex();
        v[7]=new GVertex();
        v[8]=new GVertex();

        setLabelAll();
       
        for ( int i = 0; i < n; i++) {
        	System.out.println(v[i].getLabel());
        }
        
        
	}
	

}
