package example;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;

public class LinkedListE {
	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(9999);
		list.add(10);
		list.add(-20);
		Comparator<Integer> order = Integer::compare;
		list.sort(order);
		System.out.print(list);

		LinkedList<String> strin = new LinkedList<String>();
		strin.add("murali");
		strin.add("murali1");
		strin.add("murali2");
		strin.add("apple");

		/*
		 * strin.sort( new Comparator<String>(){
		 * 
		 * @Override public int compare(String o1,String o2){ return
		 * Collator.getInstance().compare(o1,o2); } });
		 */

		// strin.sort(String::compareToIgnoreCase);
		strin.sort((a, b) -> a.compareToIgnoreCase(b));

		System.out.print(strin);
	}
}
