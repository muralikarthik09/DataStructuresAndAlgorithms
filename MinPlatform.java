package example;

public class MinPlatform {

	public static void main(String[] args) {
		// TODO Auto-generated constructor stub
		int arr[] = { 900, 940, 950, 1100, 1500, 1800 };
		int dep[] = { 910, 1200, 1120, 1130, 1900, 2000 };
		int n = 6;
		System.out.println("Minimum Number of Platforms Required = " + findPlatform(arr, dep, n));
	}

	public static int findPlatform(int arr[], int dep[], int n) {

		// plat_needed indicates number of platforms
		// needed at a time
		int plat_needed = 1, result = 1;
		// run a nested loop to find overlap
		for (int i = 0; i < n; i++) {
			// minimum platform
			plat_needed = 1;
			for (int j = i + 1; j < n; j++) {
				// check for overlap
				if ((arr[i] >= arr[j] && arr[i] <= dep[j]) || (arr[j] >= arr[i] && arr[j] <= dep[i]))
					plat_needed++;
			}
			// update result
			result = Math.max(result, plat_needed);
		}

		return result;
	}
}
