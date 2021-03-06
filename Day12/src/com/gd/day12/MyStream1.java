package com.gd.day12;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStream1 {
	public static void main(String[] args) {
		List<Integer> ls=new ArrayList<Integer>();
		ls.add(21);
		ls.add(12);
		ls.add(7);
		ls.add(8);
		ls.add(1);
		ls.add(4);
		ls.add(2);
		ls.add(9);
		
		Stream<Integer> st=ls.stream();
		
		ls.stream().forEach((num)->{
			//System.out.println(num);
		});
		
		List<Integer> newlst=ls.stream().filter(num -> num>0)
				.map(num -> num*num)
				.sorted(Collections.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println(newlst);
	}

}
