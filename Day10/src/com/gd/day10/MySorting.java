package com.gd.day10;
import java.util.*;
public class MySorting {
	public static void main(String[] args) {
		List<Employee> listEmplyoee=new ArrayList<Employee>();
		
		Employee e1=new Employee();
		e1.setId(002);
		e1.setName("Prince");
		e1.setSalary(1200.32);
		
		listEmplyoee.add(e1);
		
		Employee e2=new Employee();
		e2.setId(001);
		e2.setName("Ajay");
		e2.setSalary(1300.44);
		
		listEmplyoee.add(e2);
		
		Employee e3=new Employee();
		e3.setId(004);
		e3.setName("Sumit");
		e3.setSalary(1400.21);
		
		listEmplyoee.add(e3);
		
		Employee e4=new Employee();
		e4.setId(003);
		e4.setName("Ashwani");
		e4.setSalary(1110.98);
		
		listEmplyoee.add(e4);
		
		Employee e5=new Employee();
		e5.setId(005);
		e5.setName("Saurabh");
		e5.setSalary(4322.73);
		
		listEmplyoee.add(e5);
		
		SortId sort=new SortId();
		
		Collections.sort(listEmplyoee, sort);
		
		for(Employee e:listEmplyoee)
		{
			System.out.println(e);
		}
		
		//System.out.println(listEmplyoee);
		
		
	}

}
