package Collection.HashMap;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<Integer,String> hm=new HashMap<Integer,String>();
		hm.put(1, "Durga");
		hm.put(1, "Prasad");
        System.out.println(hm);//it will print 1,Prasad as it is overriding
        
        HashMap<String,String> hms=new HashMap<String,String>();
        hms.put("Durga", "A");
        hms.put("Durga", "B");
        System.out.println(hms);//it will print Durga,B as it is overriding
	}

}
