package Tut_02;

public class Binary_Search {
	static int bs(int arr[], int x) {
		int first = 0;
		int last = arr.length - 1;
		int mid = 0;	
		while (first < last) {

			mid = first + ( last - first)/2;

			if (arr[mid] == x) {
				return mid + 1;
			}

			if (arr[mid] < x) {
				first = mid + 1;

			} else {
				last = mid - 1;

			}
		}

		return -1;

	}

	public static void main(String[] args) {
		int arr[] = { 1, 2, 5, 7, 8, 12, 56, 364, 756, 4345 };
		System.out.println(bs(arr, 12));
		System.out.println(bs(arr, 3));
		System.out.println(bs(arr, 756));
		System.out.println(bs(arr, -12));
	}
}
