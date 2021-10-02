package example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MaxMeetings {

	public static void main(String[] args) {

		int s[] = { 1, 3, 0, 5, 8, 5 };

		// Finish time
		int f[] = { 2, 4, 6, 7, 9, 9 };
		ArrayList<Meet> meetList = new ArrayList();
		for (int i = 0; i < s.length; i++) {
			meetList.add(new Meet(s[i], f[i], i));
		}
		findMaxMeetings(meetList);
	}

	public static class MyComparator implements Comparator<Meet> {

		@Override
		public int compare(Meet o1, Meet o2) {
			// TODO Auto-generated method stub
			if (o1.end < o2.end)
				return -1;
			else if (o1.end > o2.end)
				return 1;
			return 0;
		}
	}

	private static void findMaxMeetings(ArrayList<Meet> al) {
		Collections.sort(al, new MyComparator());
		ArrayList<Integer> m = new ArrayList<>();
		m.add(al.get(0).pos);
		int last_finished_time = al.get(0).end;
		for (int i = 1; i < al.size(); i++) {
			if (al.get(i).start > last_finished_time) {
				m.add(i);
				last_finished_time = al.get(i).end;
			}
		}
		for (int i = 0; i < m.size(); i++) {
			System.out.println(" Meet " + m.get(i) + "strt" + al.get(i).start + "end" + al.get(i).end);

		}
	}
}

class Meet {
	int start, end, pos;

	Meet(int s, int e, int p) {
		this.start = s;
		this.end = e;
		this.pos = p;
	}
}
