package Tut10;

public class find_dup {
	public static void main(String[] args) {
		BinarySearchTree t=new BinarySearchTree();
		t.insert(12,t);
		int list[] = {1,2,34,1,12,3,4,2,5,2,4,2,4,5,62,65};
		for ( int item : list) {
			if ( ! t.insert(item, t)) {
				System.out.println(item + " is duplicate");
			}
		}
	}

}
