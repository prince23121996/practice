package com.gd.day10;

public class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private double salary;
	
	
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee e1) {
		
		//return this.getName().compareTo(e1.getName());
		if(this.getId()>e1.getId())
			return 1;
		else if(this.getId()<e1.getId())
			return -1;
		else
			return 0;
	}
	

}
