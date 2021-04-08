package Tut_05;


public class Ex1 {
	static void counting_sort(int input[], String name[]) {
		int n = input.length;
		
		
		// create a new array with the same size 
		int output[] = new int[n];
		
		// create name
		String name_to_sort[] = new String[n];
		
		int max = input[0];
		int min = input[0];
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
			
			name_to_sort[count_array[input[i] - min] - 1] = name[i];
			
			count_array[input[i] - min] -= 1;
			
			
		}
		
		// copy output 
		for(int i = 0; i < n; i++) {
            input[i] = output[i];
		}
		
		// copy name
		for (int i = 0; i < n; i++) {
			name[i] = name_to_sort[i];
		}
		
	}
	public static void main(String[] args) {
		int input[] = {1,7,2,5,8,10,6,5,4,6};
		
		String name[] = {"A", "B","C","D","E", "F", "G", "H", "K", "L"};

        counting_sort(input, name);
        
        System.out.println("Top 3 leading students");
        for ( int i = input.length - 1; i >= input.length - 3; i--) {
        	System.out.println(name[i] + " " + input[i]);
        }
        System.out.println();

       
	}

}
