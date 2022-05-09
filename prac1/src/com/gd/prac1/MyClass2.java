package com.gd.prac1;
class Person1
{
	private String name;
	private String age;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	
	
	
	
}
public class MyClass2 {
	public static void main(String[] args) {
		Person1 p1=new Person1();
		p1.setAge("12");
		p1.setName("Prince");
		System.out.println("Age of Person: "+ p1.getAge());
		System.out.println("Name of Person: "+ p1.getName());
		
	}
}