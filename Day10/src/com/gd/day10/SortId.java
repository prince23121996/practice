package com.gd.day10;

import java.util.Comparator;

public class SortId implements Comparator<Employee>{

	@Override
	public int compare(Employee e11, Employee e22) {
		if(e11.getId()>e22.getId())
			return 1;
		else if(e11.getId()<e22.getId())
			return -1;
		else
			return 0;
	}

}
