package Tut_06;

public class LinkedPolynomial {
	private Node head = new Node(0, 0); 
	private Node last = head;

	private static class Node {
		int coef;
		int exp;
		Node next;

		Node(int coef, int exp) {
			this.coef = coef;
			this.exp = exp;
		}
	}

	
	private LinkedPolynomial() {
	}

	// a * x^b
	public LinkedPolynomial(int coef, int exp) {
		last.next = new Node(coef, exp);
		last = last.next;
	}

	// return c = a + b
	public LinkedPolynomial add(LinkedPolynomial b) {
		LinkedPolynomial a = this;
		LinkedPolynomial c = new LinkedPolynomial();
		
		Node x = a.head.next;
		Node y = b.head.next;
		
		while (x != null || y != null) {
			Node t = null;
			if (x == null) {
				t = new Node(y.coef, y.exp);
				y = y.next;
			} else if (y == null) {
				t = new Node(x.coef, x.exp);
				x = x.next;
			} else if (x.exp > y.exp) {
				t = new Node(x.coef, x.exp);
				x = x.next;
			} else if (x.exp < y.exp) {
				t = new Node(y.coef, y.exp);
				y = y.next;
			}

			else {
				int coef = x.coef + y.coef;
				int exp = x.exp;
				x = x.next;
				y = y.next;
				if (coef == 0)
					continue;
				t = new Node(coef, exp);
			}

			c.last.next = t;
			c.last = c.last.next;
		}
		return c;
	}

	// return c = a + b
	public LinkedPolynomial multiply(LinkedPolynomial b) {
		LinkedPolynomial a = this;
		LinkedPolynomial c = new LinkedPolynomial();
		
		for (Node x = a.head.next; x != null; x = x.next) {
			LinkedPolynomial temp = new LinkedPolynomial();
			for (Node y = b.head.next; y != null; y = y.next) {
				temp.last.next = new Node(x.coef * y.coef, x.exp + y.exp);
				temp.last = temp.last.next;
			}
			c = c.add(temp);
		}
		return c;
	}

	// convert to string representation
	public String toString() {
		String s = "";
		for (Node x = head.next; x != null; x = x.next) {
			if (x.coef > 0)
				s = s + " + " + x.coef + "x^" + x.exp;
			else if (x.coef < 0)
				s = s + " - " + (-x.coef) + "x^" + x.exp;
		}
		return s;
	}

	public static void main(String[] args) {
		LinkedPolynomial p1 = new LinkedPolynomial(4, 1);
		LinkedPolynomial p2 = new LinkedPolynomial(3, 3);
		LinkedPolynomial p3 = new LinkedPolynomial(1, 2);
		LinkedPolynomial p4 = new LinkedPolynomial(2, 4);
		LinkedPolynomial p = p1.add(p2).add(p3).add(p4); //2x^4+3x^3+x^2+4x

		LinkedPolynomial q1 = new LinkedPolynomial(3, 2);
		LinkedPolynomial q2 = new LinkedPolynomial(2,1 );
		LinkedPolynomial q3 = new LinkedPolynomial(5,0 );
		LinkedPolynomial q = q1.add(q2).add(q3); // 3x^2 + 2x^1 + 5

		LinkedPolynomial r = p.add(q);
		LinkedPolynomial s = p.multiply(q);
		System.out.println("p(x) =" + p);
		System.out.println("q(x) = " + q);
		System.out.println("p(x) + q(x) = " + r);
		System.out.println("p(x) * q(x) = " + s);

	}

}
