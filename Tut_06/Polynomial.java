package Tut_06;

public class Polynomial {
	public static Poly_Node addNode(Poly_Node poly, int coeff, int power) {

		Poly_Node newNode = new Poly_Node();
		newNode.coeff = coeff;
		newNode.power = power;
		newNode.next = null;

		if (poly == null)
			return newNode;

		Poly_Node temp = poly;
		while (temp.next != null) {
			temp = temp.next;
		}

		// reach the end
		temp.next = newNode;
		return poly;
	}

	// Display the linked list
	public static void printList(Poly_Node poly) {
		while (poly.next != null) {
			System.out.print(poly.coeff + "x^" + poly.power + " + ");
			poly = poly.next;
		}
		// the last coeff
		System.out.print(poly.coeff + "\n");
	}
	
	// Add coefficient with the same power
	
	public static void addDup(Poly_Node poly) {
		Poly_Node ptr1, ptr2, dup;
		ptr1 = poly;
		
		// Pick
		while ( ptr1.next != null && ptr1 != null) {
						ptr2 = ptr1;

			// Compare with the rest
			while(ptr2.next != null) {
				if ( ptr1.power == ptr2.next.power) {
					
					//add
					ptr1.coeff = ptr1.coeff + ptr2.next.coeff;
					dup = ptr2.next;
					ptr2.next = ptr2.next.next;
				} 
				else {
					ptr2 = ptr2.next;
				}
				
			}
			ptr1 = ptr1.next;
		}			
	}
	
	// Add two poly
	public static Poly_Node add(Poly_Node poly1, Poly_Node poly2, Poly_Node poly3) {
		
		Poly_Node ptr1, ptr2;
		ptr1 = poly1;
		ptr2 = poly2;
		while ( ptr1 != null) {
			int coeff, power;
			coeff = ptr1.coeff;
			power = ptr1.power;
			poly3 = addNode(poly3, coeff, power);
			ptr1 = ptr1.next;
				}
		
		while ( ptr2 != null) {
			int coeff, power;
			coeff = ptr2.coeff;
			power = ptr2.power;
			poly3 = addNode(poly3, coeff, power);
			ptr2 = ptr2.next;
				}
		
		
		
		addDup(poly3);
		
		return poly3;
	}
	
	// Muliply two polynomial
	public static Poly_Node multiply(Poly_Node poly1, Poly_Node poly2, Poly_Node poly3) {
		
		// create two pointer
		
		Poly_Node ptr1, ptr2;
		ptr1 = poly1;
		ptr2 = poly2;
		
		while(ptr1 != null) {
			while(ptr2 != null) {
				int coeff, power;
				// multiply coeff
				coeff = ptr1.coeff * ptr2.coeff;
				
				power = ptr1.power + ptr2.power;
				
				poly3 = addNode(poly3, coeff, power);
				
				ptr2 = ptr2.next;
				
			}
			
			// reset the ptr2
			ptr2 = poly2;
			
			ptr1 = ptr1.next;
			
		}
		
			addDup(poly3);
	
			return poly3;
	}

	public static void main(String[] args) {
		Poly_Node poly1 = null,poly2 = null,poly3 = null; Poly_Node poly4 = null;
		poly1 = addNode(poly1, 3, 2);
		poly1 = addNode(poly1, 5, 1);
		poly1 = addNode(poly1, 6, 0);		
		printList(poly1);
			
		poly2 = addNode(poly2, 6, 1); 
	    poly2 = addNode(poly2, 8, 0);
	    printList(poly2);

	    
	    
	    System.out.println("Adding");
	    poly3 = add(poly1, poly2, poly3);
	    printList(poly3);
	    
	    
	    System.out.println("Multiply");
	    poly4 = multiply(poly1, poly2, poly4);
	    printList(poly4);
	}
}
