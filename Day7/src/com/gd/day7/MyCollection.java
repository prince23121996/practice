package com.gd.day7;

import java.util.ArrayList;
import java.util.Iterator;

public class MyCollection {
	public static void main(String[] args)
	{
		ArrayList ar=new ArrayList();
		ar.add("hello");
		ar.add(2);
		ar.add(33.44);
		ar.add(23);
		ar.add("A");
		ar.add(99);
		ar.add(23.2);
		
		//it will add the value at index value 1
		ar.add(1,"hello sumit");
		
		//it will orverride the value at location 1
		ar.set(1, "hello ajay");
		
		
		System.out.println(ar.contains(2));
		System.out.println(ar.remove(0));
		System.out.println(ar.get(1));
		System.out.println(ar.isEmpty());
		System.out.println(ar.set(4, "hy everyone"));
		
		Iterator it=ar.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		
		System.out.println(ar);
	}

}
