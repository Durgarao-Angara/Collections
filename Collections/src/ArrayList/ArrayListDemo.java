package ArrayList;

import java.util.ArrayList;

// Array list Operations
public class ArrayListDemo {
	public static void main(String[] args) {

		ArrayList list = new ArrayList(5);
		System.out.println("size is" + list.size());
		list.add("one");
		list.add(new Integer(20));
		list.add(new Float(45.6));
		list.add(new Boolean(true));
		list.add("two");
		list.add("three");

		System.out.println("values are" + list);
		list.remove(2);
		System.out.println("After removing index 2 value ::" + list);
		list.set(3, new Integer(100));
		System.out.println("After adding index 3 value 100::" + list);
		System.out.println("second value is (get the index 1 value)::" + list.get(1));

		if (list.contains("one")) {
			System.out.println(":::ONE Available in the list");
		} else
			System.out.println("one NOT Available in the list");

		if (list.contains(30)) {
			System.out.println(":::30 Available in the list");
		} else
			System.out.println(":::30 NOT Available in the list");

		System.out.println("size is" + list.size());
		for (int i = 0; i < list.size(); ++i) {
			System.out.println(list.get(i));
		}
	}
}