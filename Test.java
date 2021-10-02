package example;

public class Test {

	public static void main(String[] args) {
		int start = 100;
		int end = 0;
		spirslprint(start, true, 0, end);

	}

	private static void spirslprint(int start, boolean decremental, int count, int end) {
		if (start > end) {
			if (decremental) {
				System.out.print(start + ",");
				start = start - 1;
				count = count + 1;
				if (count == 10) {
					System.out.println("");
					if (start > 10)
						spirslprint(start - 10, false, count = 0, end);
					else
						spirslprint(start, false, count = 0, end);
				} else {
					spirslprint(start, true, count, end);
				}
			} else {
				start = start + 1;
				count = count + 1;
				System.out.print(start + ",");
				if (count == 10) {
					System.out.println("");
					if (start > 10)
						spirslprint(start - 10, true, count = 0, end);
					else
						spirslprint(start, true, count = 0, end);
				} else {
					spirslprint(start, false, count, end);
				}
			}
		}
	}
}
