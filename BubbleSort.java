package example;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 64, 34, 25, 12, 22, 11, 90 };
		// printArray(a,a.length);
		sortBuble(a);
		printArray(a, a.length);
	}

	private static void sortBuble(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			boolean swapped = false;
			for (int j = 0; j < a.length - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					swapped = true;
				}
			}
			if (swapped == false)
				break;
		}
	}

	private static void printArray(int arr[], int size) {
		int i;
		for (i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
	}
}
