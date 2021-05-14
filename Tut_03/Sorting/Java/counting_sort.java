package Tut_04;

public class counting_sort {
	
	// Counting sort available for negative numbers
	static void counting_sort(int input[]) {
		int n = input.length;
		
		// create a new array with the same size 
		int output[] = new int[n];
		
		
		int max = input[0];
		int min = input[0];
		
		// Finding the min and max of the array
		for (int i = 1; i < n; i++) {
			if (input[i] > max) {
				max = input[i]; // Maximum value
			} 
			else if ( input[i] < min) {
				min = input[i];  // Minimum value
			}
		}
		int k = max - min + 1; // Size of count array
		int count_array[] = new int[k];
		
		// Store the frequency of each element in input
		for ( int i = 0; i < n; i++) {
			count_array[input[i] - min] += 1;
		}
		
		// Count the occurrence
		for ( int i = 1; i < k; i++) {
			count_array[i] += count_array[i - 1];
		}
		
		// Populate output array
		for ( int i = 0; i < n; i++) {
			output[count_array[input[i] - min] - 1] = input[i];
			
			count_array[input[i] - min] -= 1;					
		
		}
		
		// copy output 
		for(int i = 0; i < n; i++) {
            input[i] = output[i];
		}
		
	}
	public static void main(String[] args) {
		int input[] = {1,7,2,5,8,10,6,5,4,6};
		

        counting_sort(input);
        
        for ( int  num : input) {
        	System.out.print(num + " ");
       
}
        

       
	}

}
