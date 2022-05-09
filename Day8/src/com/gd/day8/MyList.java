package com.gd.day8;
import java.util.*;

public class MyList {
	public static void main(String[] args) {
		
		List <Integer> l1=new ArrayList<Integer>();
		
		l1.add(8);
		l1.add(1);
		l1.add(4);
		l1.add(3);
		l1.add(5);
		l1.add(2);
		l1.add(7);
		l1.add(6);
		
		l1.remove(0);
		System.out.println(l1.set(0, 22));
		System.out.println(l1.isEmpty());
		System.out.println(l1.indexOf(8));
		System.out.println(l1.contains(5));
		
		Collections.sort(l1);
		System.out.println(l1);
		Collections.sort(l1, Collections.reverseOrder());
		System.out.println(l1);
		
		for(Integer ls:l1)
		{
			System.out.println(ls);
		}
	}
	
}
