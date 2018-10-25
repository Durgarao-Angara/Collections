package Collection.HashMap;

import java.util.HashMap;

public class HashTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<employee,Address> hs =new HashMap<employee,Address>();

employee e=new employee();
employee e1=new employee();
Address a=new Address();
Address a1=new Address();
hs.put(e, a);
hs.put(e1, a1);
System.out.println(hs.size());

	}

}

class employee
{
	
}


class Address
{
	
}