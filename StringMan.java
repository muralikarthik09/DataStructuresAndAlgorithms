package example;

import java.util.HashSet;
import java.util.regex.Pattern;

public class StringMan {

	public static void main(String[] args) {
		// getPattern("Alpha,Beta,Gamma");
		getUniq("Geeks for Geeks");
	}

	public static void getPattern(String str) {
		String[] words = str.split(Pattern.quote(","));
		for (String word : words) {
			word = word.replace(String.valueOf(word.charAt(0)), "");
			System.out.println(word);
		}
	}

	public static void getUniq(String str) {
		String[] words = str.split("\\W");
		HashSet<String> set = new HashSet();
		for (String word : words) {
			if (!set.contains(word)) {
				set.add(word);
				System.out.println(word);
			}
		}
		// System.out.print(set);

	}
}
