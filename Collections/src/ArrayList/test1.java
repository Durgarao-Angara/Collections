package ArrayList;

import java.util.ArrayList;
import java.util.HashMap;

// Second Largest & Large ,count the repeated values
public class test1 {

public static void main(String[] args) {

ArrayList<Integer> al=new ArrayList<Integer>();
HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
al.add(10);
al.add(19);
al.add(19);
al.add(19);
al.add(6);
al.add(8);
al.add(8);
al.add(8);
al.add(14);
al.add(12);
al.add(11);
al.add(11);
al.add(11);
int secound=0;
int large=0;
for(int a:al)
{
	Integer count=hm.get(a);
	hm.put(a, (count == null) ? 1 : count + 1);
	
	if(a>large)
	{
		secound=large;
		large=a;
	}
	if(a>secound && a!=large)
	{
		secound=a;
	}
}
System.out.println("secound::::::::::"+secound);
System.out.println("large::::::::::"+large);

for(int temp:al)
{
	//Integer count=hm.get(temp);
	//hm.put(temp, (count == null)? 1:count+1);
}
System.out.println("hmmmm::::::::::"+hm);

	}

}
