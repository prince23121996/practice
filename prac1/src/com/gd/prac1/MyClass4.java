package com.gd.prac1;
import java.util.*;

public class MyClass4 {
	public static void main(String[] args) {
		List<MyLaptop> lt=new ArrayList<MyLaptop>();
		
		MyLaptop ml1=new MyLaptop();
		ml1.setModel(21);
		ml1.setName("Dell");
		lt.add(ml1);
		
		MyLaptop ml2=new MyLaptop();
		ml2.setModel(11);
		ml2.setName("Hp");
		lt.add(ml2);
	
		
		MyLaptop ml3=new MyLaptop();
		ml3.setModel(15);
		ml3.setName("Lenevo");
		lt.add(ml3);
		
		MyLaptop ml4=new MyLaptop();
		ml4.setModel(03);
		ml4.setName("Apple");
		lt.add(ml4);
		
		MyLaptop ml5=new MyLaptop();
		ml5.setModel(01);
		ml5.setName("Mi");
		lt.add(ml5);
		
		Collections.sort(lt);
		
		for(MyLaptop ll:lt)
		{
			System.out.println(ll+"");
		}
		
		
	}
}
