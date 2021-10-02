package example;

public class OddEvenLeftRight {
	public static void main(String args[]) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		int n = arr.length;
		print(arr, n);
		rearrangeEvenAndOdd(arr, n);
		print(arr, n);
		// 2 4 6 1 5 3
	}

	static void print(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}

	static void rearrangeEvenAndOdd(int arr[], int n) {
		// variables
		int j = -1, temp;
		// quick sort method
		for (int i = 0; i < n; i++) {
			// if array of element
			// is odd or ecen then swap
			if (arr[i] % 2 == 0) {
				// increment j by one
				j++;
				// swap the element
				temp = arr[i];// current
				// System.out.println( "current "+temp);
				arr[i] = arr[j];// next
				// System.out.println( "next "+arr[i]);
				arr[j] = temp;
				System.out.println("Swapping " + temp + arr[i] + "");
				print(arr, n);
				// leftRotate(arr,n);
			}
		}
	}

}
