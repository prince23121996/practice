package com.gd.prac1;
import java.util.*;
class Person
{
	String name;
	String add;
	String dept;
	int id;
	int age;
	
	
	public Person(String name, String add, String dept, int id, int age) {
		this.name = name;
		this.add = add;
		this.dept = dept;
		this.id = id;
		this.age = age;
	}


	@Override
	public String toString() {
		return "Person [name=" + name + ", add=" + add + ", dept=" + dept + ", id=" + id + ", age=" + age + "]";
	}
	
	
	
}

public class MyClass1 {
	public static void main(String[] args) {
		Person rits=new Person("Rits", "Delhi", "FD", 001, 21);
		System.out.println(rits);
		
		
	}

}
