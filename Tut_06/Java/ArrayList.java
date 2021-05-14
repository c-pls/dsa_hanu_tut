package Tut_06;

public class ArrayList {
	private int[] items;
	private static final int maxSize = 100;
	private int length;
	
	/*
	 * Constructor create a empty list
	 * */
	public ArrayList(){
		items = new int[maxSize];
		length = 0;
	}
	
	/*
	 * The list is empty ?
	 * */
	
	public boolean isEmpty() {
		if ( length == 0) {
		return true;
		}
		return false;
	}
	
	/*
	 * Get the current length of the array
	 * 
	 * */
	public int getLength() {
		return length;
	}
	
	/*
	 * Add a newNode at the pos position of the list
	 * 
	 * */
	
	public void add(int pos, int newItem) {
		if ( length > maxSize) {
			System.out.println("Full can not insert anything");
		}
		 else {
			length += 1;
			for ( int i = length - 1; i >= pos ; --i) {
				items[i] = items[i - 1];	
			}
			items[pos - 1] = newItem;
		}
	}
	
	/*
	 * Delete the node at the pos position */
	
	public void delete(int pos) {
		if ( pos > length) {
			System.out.println("This node is not exist");
		} else {
		
			for ( int i = pos - 1; i < length - 1; i++) {
				items[i] = items[i+1];
			}
			length -= 1;
		}
	}
	
	/**
     * This operation remove all nodes from the list.
     */        
    public void removeAll()
    {
        length=0;
    }

    /**
     * This operation returns the node at the pos position of the list.
     */        
    public int get(int pos)
    {
        return items[pos-1];
    }
}
	
	
	
	
	
	


