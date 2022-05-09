package com.gd.day8;
import java.util.*;
class Employee<T,Y,Z>{
	T id;
	Y age;
	Z name;
	
	public Employee(T id, Y age, Z name)
	{
		this.id=id;
		this.age=age;
		this.name=name;
	}
	public void printall()
	{
		System.out.println("Id is:"+this.id);
		System.out.println("Age of Employee:"+this.age);
		System.out.println("Name of Employee:"+this.name);
	}
	
}

public class MyGenric {
	public static void main(String[] args)
	{
		Employee <Integer, Integer, String> e1=new Employee <Integer, Integer, String>(1,21,"Prince");
		e1.printall();
		Employee <String, String, Integer> e2=new Employee<String, String, Integer>("kamal", "bimla", 28764);
		e2.printall();
		
	}

}
