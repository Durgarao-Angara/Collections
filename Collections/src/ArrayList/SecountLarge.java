package ArrayList;
import java.util.ArrayList;

public class SecountLarge {

	public static void main(String[] arg)
	{
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(14);
	list.add(12);
	list.add(11);
	list.add(15);
	list.add(9);
	list.add(13);
	list.add(9);
	list.add(23);
	list.add(19);
	list.add(23);
	
	secountLarge(list);

	}

	private static void secountLarge(ArrayList<Integer> list) {
		int secondLargest = (int) list.get(0);
		int largest = list.get(0);
		for (int i = 1; i < list.size(); i++) {
		  if(list.get(i) > largest) {
		    secondLargest = largest;
		    largest = list.get(i);
		  }
		  else if(list.get(i) > secondLargest && list.get(i) != largest) {
		    secondLargest = list.get(i);
		  }
		}

        System.out.print("Second biggest number " +secondLargest);
		
	}
}