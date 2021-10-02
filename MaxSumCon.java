package example;

public class MaxSumCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
		//int a[] = { -1,1,-2,2,-3,3 };
		System.out.println("Maximum contiguous sum is " + maxSubArraySum(a));
	}

	private static int maxSubArraySum(int[] a) {
		// TODO Auto-generated method stub
		int max_so_far = a[0];
		int curr_max = a[0];

		for (int i = 0; i < a.length-1; i++) {
			curr_max = Math.max(a[i], curr_max + a[i]);
			max_so_far = Math.max(max_so_far, curr_max);

		}
		return max_so_far;
	}

}
