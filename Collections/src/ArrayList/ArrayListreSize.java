package ArrayList;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ArrayListreSize {

	public static void main(String[] args) throws Exception {
		List<Comparable> list=new ArrayList<Comparable>();
		
		
		System.out.println("size is"+list.size() +"Capacity:::::::"+getCapacity(list));
		System.out.println("hashcode 0 ::::::::::"+list.hashCode());
		list.add(new Integer(20));
		System.out.println("hashcode 1::::::::::"+list.hashCode());
		list.add(new Integer(20));
		System.out.println("hashcode 2::::::::::"+list.hashCode());
		list.add(new Float(45.6));
		list.add(new Boolean(true));
		list.add("two");
		list.add("three");
		System.out.println("hashcode 6::::::::::"+list.hashCode());
		list.add(new Boolean(true));
		list.add("two");
		System.out.println("hashcode 8::::::::::"+list.hashCode());
		list.add("three");
		System.out.println("size is"+list.size()+"*****Capacity:::::::"+getCapacity(list));	
		System.out.println("hashcode::::::::::"+list.hashCode());
		list.add("one");
		list.add("one");
		list.add("one");
		System.out.println("values are"+list);
		System.out.println("size is::::::::::::::"+list.size()+"*****Capacity:::::::"+getCapacity(list));
		list.remove(2);
		System.out.println("values are"+list);
		list.set(3,new Integer(100));
		System.out.println("values are"+list);
		System.out.println("size is"+list.size());
		System.out.println("second value is"+list.get(1));
		
		for(int i=0;i<list.size();++i)
		{
			System.out.println(list.get(i));
		}
	}

	static int getCapacity(List al) throws Exception {
        Field field = ArrayList.class.getDeclaredField("elementData");
        field.setAccessible(true);
        return ((Object[]) field.get(al)).length;
    }
}



