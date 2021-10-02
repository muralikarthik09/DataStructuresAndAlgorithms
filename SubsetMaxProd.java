package example;

public class SubsetMaxProd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { -1, -1, -2, 4, 3 };
		System.out.println(maxProductSubset(a));

	}

	private static int maxProductSubset(int[] a) {
		if (a.length == 1) {
			return a[0];
		}
		int maxneg = Integer.MIN_VALUE;
		int count_zero = 0, count_neg = 0;
		int prod = 1;
		int n = a.length;
		for (int i = 0; i < n; i++) {
			if (a[i] == 0) {
				count_zero++;
				continue;
			}
			if (a[i] < 0) {
				count_neg++;
				maxneg = Math.max(maxneg, a[i]);
			}
			prod = prod * a[i];
		}
		if (count_zero == n) {
			return 0;
		}
		if (count_neg % 2 == 1) {
			if (count_neg == 1 && count_zero > 0 && count_zero + count_neg == n) {
				return 0;
			}
			prod = prod / maxneg;
		}
		return prod;
	}

}
