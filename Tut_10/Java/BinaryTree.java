package Tut10;

public class BinaryTree {
	BTNode root;
	BinaryTree leftSubTree;
	BinaryTree rightSubTree;

	public BinaryTree() {
		root = null;
		leftSubTree = rightSubTree = null;
	}

	public void buildTree(String rootValue, BinaryTree left, BinaryTree right) {
		if (rootValue == null) {
			root = null;
			leftSubTree = rightSubTree = null;
		} else {
			root = new BTNode(rootValue);
			leftSubTree = left;
			rightSubTree = right;
		}
	}

	public void buildTreeByValue(String rootValue, String leftValue, String rightValue) {
		if (rootValue == null) {
			root = null;
			leftSubTree = rightSubTree = null;
		} else {
			root = new BTNode(rootValue);

			if (leftValue == null) {
				leftSubTree = null;
			} else {
				leftSubTree = new BinaryTree();
				leftSubTree.buildTree(leftValue, null, null);
			}

			if (rightValue == null)
				rightSubTree = null;
			else {
				rightSubTree = new BinaryTree();
				rightSubTree.buildTree(rightValue, null, null);
			}

		}
	}

	public boolean isEmpty() {
		return ((root == null) && (leftSubTree == null) && (rightSubTree == null));
	}

	public void makeEmpty() {
		root = null;
		leftSubTree = rightSubTree = null;
	}

	public String getTreeValue() {
		return root.getLabel();
	}

	public void setTreeValue(String label) {
		if (!isEmpty())
			root.setLabel(label);
	}

	public boolean isLeaf() {
		return ((root != null) && (leftSubTree == null) && (rightSubTree == null));
	}

	public BinaryTree getLeftSubTree() {
		return leftSubTree;
	}

	public void setLeftSubTree(BinaryTree left) {
		leftSubTree = left;
	}

	public BinaryTree getRightSubTree() {
		return rightSubTree;
	}

	public void setRightSubTree(BinaryTree right) {
		rightSubTree = right;
	}
	
	// depth
	
	public int getDepth(BinaryTree t) {
		if ( t == null) {
			return 0;
		}
		if ( t.isLeaf()) {
			return 0;
		}
		int leftSubTreeDepth = 0;
		leftSubTreeDepth = getDepth(t.getLeftSubTree());
		int rightSubTreeDepth=0;
        rightSubTreeDepth=getDepth(t.getRightSubTree());            
        if (leftSubTreeDepth > rightSubTreeDepth)
            return 1+leftSubTreeDepth;
        else
            return 1+rightSubTreeDepth;
		
	}
	
	 public int countLeaves(BinaryTree t)
	    {
	        if (t==null)
	            return 0;
	            
	        if (t.isLeaf())
	            return 1;
	            
	        return countLeaves(t.getLeftSubTree()) + countLeaves(t.getRightSubTree());    
	    }
	 
	 public int iPathLength(BinaryTree t, int depth)
	    {
	        if (t==null)
	            return 0;                       
	        return depth + iPathLength(t.getLeftSubTree(),depth+1) + iPathLength(t.getRightSubTree(),depth+1);    
	    }
	 
	 public int countNodes(BinaryTree t)
	    {
	        if (t==null)
	            return 0;

	        return 1+ countNodes(t.getLeftSubTree()) + countNodes(t.getRightSubTree());   
	    }    
	 
	 
	 public void preOrderTraversal(BinaryTree t) {
		 if ( t != null) {
			 System.out.print(t.getTreeValue() + " ");
			 preOrderTraversal(t.getLeftSubTree());
			 preOrderTraversal(t.getRightSubTree());
		 }
	 }
	 
	 public void inOrderTraversal(BinaryTree t) {
		 if ( t != null) {
			 inOrderTraversal(t.getLeftSubTree());
			 System.out.print(t.getTreeValue() + " ");
			 inOrderTraversal(t.getRightSubTree());
		 }
	 }
	 
	 public void postOrderTraversal(BinaryTree t) {
		 if ( t != null) {
			 inOrderTraversal(t.getLeftSubTree());
			 inOrderTraversal(t.getRightSubTree());
			 System.out.print(t.getTreeValue() + " ");
		 }
	 }
	 
	 public void clone(BinaryTree t) {
		 if ( t!= null) {
			 System.out.print(t.getTreeValue() + " ");
			 clone(t.getLeftSubTree());
			 clone(t.getRightSubTree());
		 }
	 }
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

	
	
	
	
	
}
