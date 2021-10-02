package example;

public class Sort123 {

	public static void main(String[] args) {
		int arr[] = { 0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1 };
		int n = arr.length;
		sortArr(arr, n);
	}

	static void sort012(int a[], int arr_size) {
		int lo = 0;
		int hi = arr_size - 1;
		int mid = 0, temp = 0;
		while (mid <= hi) {
			switch (a[mid]) {
			case 0: {
				temp = a[lo];
				a[lo] = a[mid];
				a[mid] = temp;
				lo++;
				mid++;
				break;
			}
			case 1:
				mid++;
				break;
			case 2: {
				temp = a[mid];
				a[mid] = a[hi];
				a[hi] = temp;
				hi--;
				break;
			}
			}
		}
	}

	private static void sortArr(int[] arr, int n) {
		int i, cnt0 = 0, cnt1 = 0, cnt2 = 0;

		// Count the number of 0s, 1s and 2s in the array
		for (i = 0; i < n; i++) {
			switch (arr[i]) {
			case 0:
				cnt0++;
				break;
			case 1:
				cnt1++;
				break;
			case 2:
				cnt2++;
				break;
			}
		}

		// Update the array
		i = 0;

		// Store all the 0s in the beginning
		while (cnt0 > 0) {
			arr[i++] = 0;
			cnt0--;
		}

		// Then all the 1s
		while (cnt1 > 0) {
			arr[i++] = 1;
			cnt1--;
		}

		// Finally all the 2s
		while (cnt2 > 0) {
			arr[i++] = 2;
			cnt2--;
		}

		// Print the sorted array
		printArr(arr, n);

	}

	static void printArr(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

}
