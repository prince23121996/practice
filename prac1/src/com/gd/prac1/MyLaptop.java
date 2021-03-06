package com.gd.prac1;
//Create A laptop array list and sort by name

public class MyLaptop implements Comparable<MyLaptop>{
	
	
	
	
	@Override
	public String toString() {
		return "MyLaptop [model=" + model + ", name=" + name + "]";
	}
	private int model;
	private String name;
	
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public int compareTo(MyLaptop mt) {
		//return this.getName().compareTo(mt.getName());
		if(this.getModel()<mt.getModel())
			return -1;
		else if(this.getModel()>mt.getModel())
			return 1;
		else
			return 0;
	}
	
	

}
