package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class Person implements Comparator <Person> {
	
	public  String name;
	public  int age;
	public  String address;
	
	public static void main(String[] args) {
		
          ArrayList <Person> al=new ArrayList <Person>();
          Person m1=new Person();
          m1.setAddress("kapavaram");
          m1.setAge(26);
          m1.setName("Rames");
          Person m2=new Person();
          m2.setAddress("kapavaram");
          m2.setAge(25);
          m2.setName("Ramesh");
          Person m3=new Person();
          m3.setAddress("kapavaram");
          m3.setAge(24);
          m3.setName("Ramesh");
          Person m4=new Person();
          m4.setAddress("Palakol");
          m4.setAge(24);
          m4.setName("Durg");
          Person m5=new Person();
          m5.setAddress("Palakol");
          m5.setAge(24);
          m5.setName("Durgarao");
          Person m6=new Person();
          m6.setAddress("Palakol");
          m6.setAge(24);
          m6.setName("Durga");
          Person m7=new Person();
          m7.setAddress("Palakol");
          m7.setAge(21);
          m7.setName("Durga");
          al.add(m1);
          al.add(m2);
          al.add(m3);
          al.add(m4);
          al.add(m5);
          al.add(m6);
          al.add(m7);

          System.out.println(":::::::::::::::::::::::::Before Sorting::::::::::::::::::::::");
          for(Person m:al)
          {
        	  System.out.println( m.getName()+ "::"+ m.getAge()+"::"+ m.getAddress());
          }
          
          Collections.sort(al, new Person());
          Iterator<Person> itr=al.iterator();
          System.out.println(":::::::::::::::::::::::::After Sorting::::::::::::::::::::::");
        while(itr.hasNext())
        {
        	Person m=itr.next();
        	System.out.println( m.getName()+ "::"+ m.getAge()+"::"+ m.getAddress());
        } 

}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public int compare(Person o1, Person o2) {
		int namesort=o1.getName().compareTo(o2.getName());
		if(namesort!=0){
		return namesort;
		}
		else if((o1.getAge()-o2.getAge())!=0)
		{
			return o1.getAge()-o2.getAge();
		}
		return o1.getAddress().compareTo(o2.getAddress());
	}}
