package example;

import java.lang.reflect.Array;

public class LeftRotate {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		// printArray(arr,arr.length);
		// printArray(arr,arr.length);
		rightRotate(arr, 2);
		printArray(arr, arr.length);
		// printArray(arr,2);
		// printArray(arr,arr.length);
	}

	private static void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}

	private static void leftRotate(int arr[], int n) {
		// For n shifts
		for (int i = 0; i < n; i++) {
			int j, first = arr[0];
			// One shift
			for (j = 0; j < arr.length - 1; j++) {
				arr[j] = arr[j + 1];
			}
			arr[j] = first;
		}
	}

	private static void rightRotate(int arr[], int n) {
		for (int i = 0; i < n; i++) {
			int j, last = arr[arr.length - 1];
			for (j = arr.length - 1; j > 0; j--) {
				arr[j] = arr[j - 1];

			}
			arr[j] = last;

		}
	}

}
