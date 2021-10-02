package example;

import java.util.Arrays;

public class Triplets {
	public static void main(String[] args) {
		int[] array = { 1, 5, 7, 8, 9, 7, 3, 4, 100, 99 };
		tripllets(array);
	}

	static void tripllets(int[] array) {
		int maxA = Integer.MIN_VALUE, maxB = Integer.MIN_VALUE, maxC = Integer.MIN_VALUE;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxA) {
				maxC = maxB;
				maxB = maxA;
				maxA = array[i];
			} else if (array[i] > maxB) {
				maxC = maxB;
				maxB = array[i];
			} else if (array[i] > maxC) {
				maxC = array[i];
			}
		}
		System.out.println("tripplets" + maxA * maxB * maxC);
	}

}
