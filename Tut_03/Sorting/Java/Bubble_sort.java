package Tut_03;

public class Bubble_sort {
	static void bubble_sort(int arr[]) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0 ; j < arr.length - 1 - i; j++) {
				if ( arr[j] > arr[j + 1]) {
					int temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,5,2,34,12,4,2,4,5,2};
		bubble_sort(arr);
		for ( int e : arr) {
			System.out.print(e + " ");
		}
	}

}
