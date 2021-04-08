package Tut_06;

public class ArrayListApp {
	    /**	     * Constructor for objects of class ArrayListApp
	     */
	    public ArrayListApp()
	    {
	    }

	    public static void printList(ArrayList list)
	    {
	        int l=list.getLength();
	        String str="";
	        for (int i=1; i<=l; i++)
	        {
	            str=str+list.get(i)+"  ";
	        }
	        System.out.println(str);
	    }
	    
	    public static void main(String[]args)
	    {
	        ArrayList myList=new ArrayList();
	        myList.add(1,100);
	        myList.add(2,200);
	        myList.add(3,300);
	        myList.add(4,400); 
	        
	        myList.add(2,500);
	        myList.add(1,600);
	        printList(myList);
	        myList.delete(3);
	        System.out.println(myList.getLength());
	        printList(myList);
	        System.out.println("Is the list empty? " + myList.isEmpty());
	        myList.removeAll();
	        System.out.println("Is the list empty? " + myList.isEmpty());        
	        myList.add(1,1000);
	        myList.add(2,2000);        
	        printList(myList);
	    }    
	}


