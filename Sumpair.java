package example;

import java.util.HashSet;

public class Sumpair {
	public static void main(String[] args) {
		findNumbers();
	}

	private static void findNumbers() {
		int mulofSeven = 7;
		int multplay = 2;
		int[] resultArray = null;
		int intial = 0;
		/*
		 * while(satisfyAllCondition(mulofSeven)&& intial<4) {
		 * resultArray[intial]=mulofSeven; System.out.print(intial+"multple of 7");
		 * intial=intial+1; }do { mulofSeven=mulofSeven*multplay; multplay=multplay+1; }
		 */
	}

	private static boolean satisfyAllCondition(int mulofSeven) {
		if (mulofSeven % 2 == 1 && mulofSeven % 3 == 1 && mulofSeven % 4 == 1 && mulofSeven % 5 == 1
				&& mulofSeven % 6 == 1)
			return true;

		return false;

	}
}
