package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Strudent> al = new ArrayList<Strudent>();
		al.add(new Strudent("Vijay", 23, "4"));
		al.add(new Strudent("Ajay", 27, "5"));
		al.add(new Strudent("Jai", 21, "6"));
		al.add(new Strudent("Jauuui", 21, "6"));
		Collections.sort(al);

		for (Strudent st : al) {
			System.out.println(st.StName + " " + st.sNo + " " + st.sclass);
		}
	}

}
