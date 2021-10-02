package example;

public class NumSteps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Driver function

		int n = 9;
		System.out.println(findStep(n));
		System.out.println(countWays(n));

	}

	public static int findStep(int n) {
		if (n == 1 || n == 0)
			return 1;
		else if (n == 2)
			return 2;
		else
			return findStep(n - 3) + findStep(n - 2) + findStep(n - 1);
	}

	public static int countWays(int n) {
		int[] res = new int[n + 1];
		res[0] = 1;
		res[1] = 1;
		res[2] = 2;

		for (int i = 3; i <= n; i++)
			res[i] = res[i - 1] + res[i - 2] + res[i - 3];
		return res[n];
	}

}
