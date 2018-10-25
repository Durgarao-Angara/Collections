package com.durga.CFW;

import java.util.*;
public class LL
{

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		LinkedList<Integer> ll=new LinkedList<Integer>();
		System.out.println("linkedlist sizeis:"+ ll);
		ll.add(new Integer (12));
		ll.add(new Integer(45));
		ll.add(new Integer(85));
		System.out.println("sizw:"+ll);
		Iterator<Integer> it=ll.iterator();
		while(it.hasNext())
		{
			Object ob=it.next();
			Integer i=(Integer)ob;
			int j=i.intValue();
			System.out.println(j);
		}
		}
		}
