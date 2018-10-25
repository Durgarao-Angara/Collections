package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
public class CountOccurence {
	
	
	public static void main(String args[])
	{

		String[] a = {"One","Two","Three","One","Two","One"};

		/*Map<String,Integer> n = new HashMap<String,Integer>();
		 
		for(String b :a){

		Integer value=n.get(b);

		if(value==null)

		{

		n.put(b, 1);

		}else{

		n.put(b, value +1);
		}
		System.out.println(n.values());

		}
		}
public static void main(String args[])
{
	CountOccurence oc=new CountOccurence();
	oc.occ();
  
}*/


		ArrayList al=new ArrayList();
		for(String s:a)
		{
			al.add(s);	
		}
		//System.out.println(Collections.frequency(al, "One"));
		
		Set<String> uniqueSet = new HashSet<String>(al);

		for (String temp : uniqueSet) {
			System.out.println(temp + ": " + Collections.frequency(al, temp));
			
			//System.out.println(temp);
			System.out.println(temp);

		}

		
}
}
