package Tut_01;
import java.util.Scanner;

public class MergeSort {
	static void mergeSort(int arr[], int len) {
		if ( len > 1) {
			int mid = len / 2;
			int left[] = new int[mid];
			int right[] = new int[len - mid];
			
			int k = 0;
			for ( int i = 0; i < len; i++) {
				if ( i < mid) {
					left[i] = arr[i];
				} else {
					right[k] = arr[i];
					k = k + 1;
				}
			}
			
			mergeSort(left, mid);
			mergeSort(right, len - mid);
			
			int l = 0;
			int r = 0;
			int in = 0;
			while ( l < left.length && r < right.length) {
				if ( left[l] <= right[r]) {
					arr[in] = left[l];
					l++;
				} else {
					arr[in] = right[r];
					r++;
				}
				in++;
			}
			while(l < left.length) {
				arr[in] = left[l];
				l++;
				in++;
			}
			while(r < right.length) {
				arr[in] = right[r];
				r++;
				in++;
				
			}
			
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for ( int i = 0; i < n; i++) {
			System.out.printf("arr[%d] = ", i + 1);
			arr[i] = scanner.nextInt();
		}
		mergeSort(arr, n);
		for ( int i = 0; i < n; i++) {
			System.out.printf(arr[i] + " ");
		}
		scanner.close();
 	}

}
