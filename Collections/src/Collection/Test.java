import java.util.*;
public class Test
{
	public static void main(String[] args) 
	{
		Test t= new Test();
		System.out.println(t.size());
		int i=100;
		Integer p=new Integer(i);
		t.add(p);
		Iterator it=t.iterator();
		while (it.hasNext())
		{
			Object obj=it.next();
			Integer io=(Integer)obj;
			int c=io.intValue();
			System.out.println(c);
		}
	}
}
