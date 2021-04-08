package Tut_05;

public class Ex4 {
	// Sort single character
	
	static void sort(char arr[])
    {
        int n = arr.length;
 
        // The output character array that will have sorted arr
        char output[] = new char[n];
 
        // Create a count array to store count of inidividual
        // characters and initialize count array as 0
        int count[] = new int[256];
        for (int i = 0; i < 256; ++i)
            count[i] = 0;
 
        // store count of each character
        for (int i = 0; i < n; ++i)
            ++count[arr[i]];
 
        // Change count[i] so that count[i] now contains actual
        // position of this character in output array
        for (int i = 1; i <= 255; ++i)
            count[i] += count[i - 1];
 
        // Build the output character array
        // To make it stable we are operating in reverse order.
        for (int i = n - 1; i >= 0; i--) {
            output[count[arr[i]] - 1] = arr[i];
            count[arr[i]] -= 1;
        }
 
        // Copy 
        
        for (int i = 0; i < n; ++i)
            arr[i] = output[i];
    }
	public static void main(String[] args) {
		
		
		char arr[] = { 'd', 'j', 'a', 'b', 's', 'd', 'o',
                'g', 'f', 't', 'e', 'k', 'c' };
		
		sort(arr);

        System.out.print("Sorted character array is ");
        for (int i = 0; i < arr.length; ++i) {
            System.out.print(arr[i]);
	}
        }
}

