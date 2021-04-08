package Tut_06;

public class SLListApp {
    /**
     * Constructor for objects of class SLListApp
     */
    public SLListApp()
    {
    }
    
    public static void printList(SLList list)
    {
       SLNode temp = list.get(0);
       while ( temp != null) {
    	   System.out.println(temp.getData() + ", ");
    	   temp = temp.getNext();
       }
    }
    public static void main(String[]args)
    {
        SLList myList=new SLList();
        myList.add(new SLNode("The First String"));
        myList.add(new SLNode("The Second String"));
        myList.add(new SLNode("The Third String"));        
        myList.add(new SLNode("The Forth String")); 
        printList(myList);
        System.out.println("---------------");
        myList.addAt(3,new SLNode("ABC"));    
        printList(myList);
        System.out.println( "Search for Hello" + " " + myList.search("ABC"));
        System.out.println("---------------");
        myList.remove(4);
        printList(myList);
        System.out.println("---------------");
        myList.removeAll();
        System.out.println("---------------");
        myList.add(new SLNode("A new string"));
        printList(myList);      
        System.out.println("---------------");
    }    
}



