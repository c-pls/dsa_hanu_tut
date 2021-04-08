package Tut_03;

public class Insertion_Sort {
	static void insertion_sort(int arr[]) {
		
		for ( int i = 1; i < arr.length; i++) {
			int key = arr[i];
			int j = i - 1;
			
		while ( j >= 0 && arr[j] > key) {
			arr[j + 1] = arr[j];
			j = j - 1;
		}
		arr[j + 1] = key;
			
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,5,2,34,12,4,2,4,5,2};
		insertion_sort(arr);
		for ( int e : arr) {
			System.out.print(e + " ");
		}
	}

}
