package Tut_03;

public class Selection_sort {
	static void selection_sort(int arr[]) {
		
		for ( int i = 0; i < arr.length - 1 ; i++) {
			int min = i;
			for ( int j = i + 1; j < arr.length; j++) {
				if ( arr[j] < arr[min]) {
					min = j;
				}
			}
			// swap
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,5,2,34,12,4,2,4,5,2};
		selection_sort(arr);
		for ( int e : arr) {
			System.out.print(e + " ");
		}
	}

}
