package Tut_04;

import java.util.Scanner;

public class Quick_Sort {
	static Scanner scanner = new Scanner(System.in);

	static int[] enterArray(int n) {
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			System.out.printf("Enter arr[%d] = ", i);
			arr[i] = scanner.nextInt();
		}
		return arr;

	}

	static int partition(int arr[], int left, int right) {
		// Define a pivot
		int pivot = arr[right];
		int i = left - 1; // Index of smaller element
		for (int j = left; j < right; j++) {
			// smaller or equal than the pivot
			if (arr[j] <= pivot) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}

		// Swap arr[i+1] and pivot

		int temp = arr[i+1]; 
		arr[i+1] = arr[right]; 
		arr[right] = temp;

		// return the pivot position
		return i + 1;
	}

	static void sort(int arr[], int left, int right) {
		if (left < right) {
			// Get the pivot's index
			int pi = partition(arr, left, right);

			// sort element before and after pi
			sort(arr, left, pi - 1);
			sort(arr, pi + 1, right);
		}
	}

	static void printArray(int arr[]) {
		int n = arr.length;
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static void main(String[] args) {
		System.out.println("Enter the size of the array");
		int n = scanner.nextInt();
		int arr[] = enterArray(n);
		sort(arr, 0, n - 1);
		printArray(arr);
		
	}

}
