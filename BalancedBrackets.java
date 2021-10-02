package example;

import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedBrackets {
	public static void main(String[] args) {

		System.out.print(checkBalnced("[({)]"));
		countPairs("[({(){}[])]}");
	}

	private static boolean checkBalnced(String string) {
		// TODO Auto-generated method stub
		Deque<Character> stack = new ArrayDeque<Character>();
		for (int i = 0; i < string.length(); i++) {
			char x = string.charAt(i);
			if (x == '(' || x == '[' || x == '{') {
				stack.push(x);
				continue;
			}
			if (stack.isEmpty())
				return false;
			char check;
			switch (x) {
			case ')':
				check = stack.pop();
				if (check == ']')
					return false;
				break;
			case ']':
				check = stack.pop();
				if (check == ')')
					return false;
				break;
			}
		}
		return stack.isEmpty();
	}

	private static void countPairs(String string) {
		int countSmall = 0, countSqu = 0, countPair = 0, countcurly = 0;
		for (int i = 0; i < string.length(); i++) {
			char x = string.charAt(i);
			switch (x) {
			case '(':
				countSmall++;
				break;
			case '{':
				countcurly++;
				break;
			case '}':
				if (countcurly > 0) {
					countcurly--;
					countPair++;
				}
				break;
			case '[':
				countSqu++;
				break;
			case ')':
				if (countSmall > 0) {
					countSmall--;
					countPair++;
				}
				break;
			case ']':
				if (countSqu > 0) {
					countSqu--;
					countPair++;
				}
				break;
			}
		}
		System.out.print(countPair);
	}
}
