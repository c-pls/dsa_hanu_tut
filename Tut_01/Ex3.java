package Tut_01;

import java.util.Scanner;

public class Ex3 {
	static void mergeSort( int arr[], int len) {
		if ( len < 2 ) {
			return;
		}
		int mid = len / 2;
		int left_arr[] = new int[mid];
		int right_arr[] = new int[len - mid];
		
		int k = 0;
		for ( int i = 0; i < len; i++) {
			if ( i < mid) {
				left_arr[i] = arr[i];
			} else {
				right_arr[k] = arr[i];
				k = k + 1;
			}
		}
		mergeSort(right_arr, len - mid);
		mergeSort(left_arr, mid);
		merge(arr, left_arr, right_arr, mid, len - mid);
	
	}
	static void merge(int arr[], int left_arr[], int right_arr[], int left_size, int right_size) {
		int i = 0;
		int l = 0;
		int r = 0;
		
		while( l < left_size && r < right_size) {
			if ( left_arr[l] <= right_arr[r] ) {
				arr[i] = left_arr[l];
				l++;
			} else {
				arr[i] = right_arr[r];
				r++;			
			}
			i++;
		}
		while( l < left_size) {
			arr[i] = left_arr[l];
			l++;
			i++;
		}
		while(r < right_size) {
			arr[i] = right_arr[r];
			r++;
			i++;
		}
		
	}

	public static void main(String[] args) {
				Scanner scanner = new Scanner(System.in);
				System.out.println("Enter the size of the list");
				int n = scanner.nextInt();
				int arr[] = new int[n];
				for ( int i = 0; i < n; i++) {
					System.out.printf("Enter arr[%d] = ",i + 1);
					arr[i] = scanner.nextInt();
				}
				mergeSort(arr, n);
				for( int i = 0; i < n; i++) {
					System.out.print(arr[i] + " ");
				}
				scanner.close();
}
}
