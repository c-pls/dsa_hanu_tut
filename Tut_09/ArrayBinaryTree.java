package Tut9;

import java.util.Arrays;

public class ArrayBinaryTree {
	private static final int maxSize = 100; // Maximum possible number of nodes in the tree
	private String[] l;

	/**
	 * Constructor for objects of class ArrayBinaryTree Create an empty Binary Tree
	 */
	public ArrayBinaryTree() {
		l = new String[maxSize];
		Arrays.fill(l, null);
	}

	public void addRoot(String data) {
		if (l[0] == null) {
			l[0] = data;
		}
	}

	public int getLeftChild(int node) {
		return 2 * node + 1;
	}

	public int getRightChild(int node) {
		return 2 * node + 2;
	}

	public int getParent(int node) {
		return (int) Math.floor((node - 1) / 2);
	}

	public String getData(int node) {
		return l[node];
	}

	public void setData(int node, String data) {
		l[node] = data;
	}

	public void addLeftChild(String data, int node) {
		setData(getLeftChild(node), data);

	}

	public void addRightChild(String data, int node) {
		setData(getRightChild(node), data);
	}

	// root left right
	public void preOrderTravel(int node) {
		if (l[node] != null) {
			System.out.print(l[node] + " ");
			preOrderTravel(getLeftChild(node));
			preOrderTravel(getRightChild(node));
		}
	}

	// left root right
	public void inOrderTravel(int node) {
		if (l[node] != null) {
			inOrderTravel(getLeftChild(node));
			System.out.print(l[node] + " ");
			inOrderTravel(getRightChild(node));
		}
	}

	// left right root
	public void postOrderTravel(int node) {
		if (l[node] != null) {
			postOrderTravel(getLeftChild(node));
			postOrderTravel(getRightChild(node));
			System.out.print(l[node] + " ");
		}
	}

	// is Leaf
	public boolean isLeaf(int node) {
		return getData(getLeftChild(node)) == null && getData(getRightChild(node)) == null;
	}

	public int countLeaf() {
		int counter = 0;
		int i = 0;
		while (l[getParent(i)] != null) {
			if (isLeaf(i)) {
				counter += 1;
			}
			i += 1;
		}

		return counter + 1;
	}

	public int getLevel(int node) {
		int level = 0;
		while (node != 0) {
			node = getParent(node);
			level += 1;
		}
		return level ;
	}

	public int getDepth() {
		int i = 0;
		while (l[getParent(i)] != null) {
			i += 1;
		}
		return getLevel(i);
	}

}
