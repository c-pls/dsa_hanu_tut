package Tut9;

public class ArrayBinaryTreeApp
{
    /**
     * Constructor for objects of class ArrayBinaryTreeApp
     */
    public ArrayBinaryTreeApp()
    {
    }

    public static void main(String[]args)
    {
        ArrayBinaryTree T=new ArrayBinaryTree();
        T.addRoot("A");
        T.addLeftChild("B",0);
        T.addRightChild("C",0);
        T.addLeftChild("D",1);
        T.addLeftChild("E",2);        
        T.addRightChild("F",2);
        T.addLeftChild("G",3);
        T.addLeftChild("H",5);        
        T.addRightChild("I",5);        
        T.addRightChild("K",6);
        System.out.println("Pre order traversal");
        T.preOrderTravel(0);
        System.out.println();
        System.out.println("In order traversal");
        T.inOrderTravel(0);
        System.out.println();
        System.out.println("Post order traversal");
        T.postOrderTravel(0);
        System.out.println("hello");
        System.out.println("Is leaf H " + T.isLeaf(11));
        System.out.println("How many leaf? " + T.countLeaf());
        System.out.println("Helooooo");
        int x = T.getLevel(5);
        System.out.println("Get level of E " + x);
        System.out.println("Get the depth of the tree" + T.getDepth());
        System.out.println();
    }    
}

