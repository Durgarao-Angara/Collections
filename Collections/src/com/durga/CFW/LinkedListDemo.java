package com.durga.CFW;

class  LinkedListDemo
{
	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		System.out.println("Size:"+ ll.size());
			System.out.println("Content is " +ll);
			ll.add(new Integer(10));
			ll.add(new Integer(50));
			ll.add(new Float(45.5f));
				System.out.println("content:"+ll);
					System.out.println("After adding the elements Size:" +ll.size());
					
					if(ll.contains(45.5f))
					{
						System.out.println("::::::::::::element found::::::");
					}
					else System.out.println("::::::::::::NOT found::::::");
				
						
// retriving the values from linkedlist...
/*Iterator itr=ll.iterator();
while (itr.hasNext())
{
	Object obj=itr.next();
		System.out.println("durga");
		System.out.println("values....."+ obj);
		Integer i= (Integer)obj;
		int a=i.intvalue();
		System.out.println("value...:"+a);
}*/
	}
}
