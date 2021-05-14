package Tut9;

public class ArrayTreeApp
{
    /**
     * Constructor for objects of class ArrayTreeApp
     */
    public ArrayTreeApp()
    {
    }
    
    
    public static void main(String[]args)
    {
        Array_Tree T=new Array_Tree();

        T.addNode("A",-1);

        T.addNode("B",0);
        T.addNode("C",0);
        T.addNode("D",0);
        T.addNode("G",3);        
        T.addNode("E",2);
        T.addNode("H",4);
        T.addNode("I",4);        
        T.addNode("F",2);
        T.addNode("K",5);
       

        T.printTree();

        System.out.println("The left most child of A is: "+T.getData(T.leftMostChild(0)));
        System.out.println("The right sibling of D is: "+T.getData(T.rightSibling(3)));
        
        System.out.println("The degree of F is " + T.getDegree(5));
        System.out.println("The G is leaf? " + T.isLeaf(6));
        System.out.println("The number of leaf is " + T.countLeaves());
        System.out.println("The level of E is " + T.getLevel(4));
        System.out.println("The depth of the tree is " + T.getDepth());
        System.out.println("Searching for H is " + T.search("H"));
        
        
    }
}
