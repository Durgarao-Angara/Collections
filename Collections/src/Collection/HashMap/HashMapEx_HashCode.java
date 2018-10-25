package Collection.HashMap;

import java.util.HashSet;
import java.util.Set;

public class HashMapEx_HashCode {
	String name;
	int id;


	public HashMapEx_HashCode(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<HashMapEx_HashCode> hs = new HashSet<HashMapEx_HashCode>();

		HashMapEx_HashCode t1=new HashMapEx_HashCode("hi", 1);
		HashMapEx_HashCode t22=new HashMapEx_HashCode("Hi", 22222222);
		HashMapEx_HashCode t2=new HashMapEx_HashCode("Hi", 2);
		HashMapEx_HashCode t3=new HashMapEx_HashCode("hi", 3);
		HashMapEx_HashCode t4=new HashMapEx_HashCode("hTTi", 4);
		HashMapEx_HashCode t5=new HashMapEx_HashCode("hi", 5);
		HashMapEx_HashCode t6=new HashMapEx_HashCode("hYYYi", 6);
		hs.add(t1);
		hs.add(t22);
		hs.add(t2);
		hs.add(t3);
		hs.add(t4);
		hs.add(t5);
		hs.add(t6);
	//	hs.add(t6);
		
		System.out.println("t1 hash code::"+t1.hashCode());
		System.out.println("t2 hash code::"+t2.hashCode());
		System.out.println("t3 hash code::"+t3.hashCode());
		System.out.println("t4 hash code::"+t4.hashCode());
		System.out.println("t5 hash code::"+t5.hashCode());
		System.out.println("t6 hash code::"+t6.hashCode());
		System.out.println("hs size:::::::::::"+hs.size());
		
		
        for(HashMapEx_HashCode p:hs){
            System.out.println(p+"==>"+p.id +"::::"+p.getName());
        }
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
		//return -1;
	}

	

	@Override
	public boolean equals(Object obj) {

		HashMapEx_HashCode other = (HashMapEx_HashCode) obj;

	if (other.name == null) {
			return false;
		} else if (name.equals(other.name))
			return true;
		else
		return false;
		
	/*	
		if (other.name != null) {
			//return false;
		if (name.equals(other.name))
			return true;
		else
		return false;


		}
		else{
		return false;}*/
		

}
	
}