package Tut_05;

public class Ex2 {
	
	// using selection sort
	
	static void sort_List_String(String arr[])
    {
       int n = arr.length;
       for ( int i = 0; i < n - 1; i++) {
    	   int min_Index = i ;
    	   String minStr = arr[i];
    	   
    	   for ( int j = i + 1; j < n; j++) {
    		   
    		   if ( arr[j].compareTo(minStr) < 0) {
    			   minStr = arr[j];
    			   min_Index = j;
    		   }
    	   }
    	   
    	   
    		   String temp = arr[min_Index];
    		   arr[min_Index] = arr[i];
    		   arr[i] = temp;
    	   
       }
       
    }
	public static void main(String[] args) {
		String arr[] = {"Hello","Goodb","Hella","Hello"};
		
		sort_List_String(arr);
		
		for(int i = 0; i < arr.length; i++)
	    {
	        System.out.println(i+": "+arr[i]);
	    }
		
	}
        
}
