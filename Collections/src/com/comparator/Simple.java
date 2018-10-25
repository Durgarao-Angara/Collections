package com.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

//comparator example program
public class Simple implements Comparator<Student>{  
public static void main(String args[]){  
  
ArrayList<Student> al=new ArrayList<Student>();  
al.add(new Student(101,"Vijay",23));  
al.add(new Student(106,"Ajay",27));
al.add(new Student(106,"Abjay",28)); 
al.add(new Student(106,"Abjai",28)); 
al.add(new Student(105,"Jai",21));  
  
System.out.println("Sorting by Name...");  
Collections.sort(al, new Simple()); 
  
//Collections.sort(al,new NameComparator());  
Iterator itr=al.iterator();  
while(itr.hasNext()){  
Student st=(Student)itr.next();  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  
  
/*System.out.println("sorting by age...");  
  
Collections.sort(al,new AgeComparator());  
Iterator itr2=al.iterator();  
while(itr2.hasNext()){  
Student st=(Student)itr2.next();  
System.out.println(st.rollno+" "+st.name+" "+st.age);  
}  */
  
  
}



@Override
public int compare(Student o1, Student o2) {
/*	if(o1.rollno>o2.rollno)
		return 1;
	else if(o1.rollno<o2.rollno)
		return -1;*/
	if((o1.rollno-o2.rollno)!=0)
	{
		return o1.rollno- o2.rollno;
	}
	else{
		return o1.name.compareTo(o2.name);  
	}
}

}  