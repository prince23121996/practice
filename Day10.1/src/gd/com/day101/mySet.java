package gd.com.day101;

import java.util.*;

public class mySet {
	public static void main(String[] args) {
		Set<String> set=new HashSet<String>();
		set.add("prince");
		set.add("Navadit");
		set.add("Alpesh");
		set.add("Risabh");
		set.add("Aryan");
		set.add("Saini");
		set.add("Priyanshi");
		set.add("Shivendu");
		set.add("null");
		System.out.println(set);
		System.out.println();
		
		Set<String> set1=new TreeSet<String>();
		set1.add("Prince");
		set1.add("Navadit");
		set1.add("Alpesh");
		set1.add("Risabh");
		set1.add("Aryan");
		set1.add("Saini");
		set1.add("Priyanshi");
		set1.add("Shivendu");
		System.out.println(set1);
		System.out.println();
		
		Set<String> set2=new LinkedHashSet<String>();
		set2.add("prince");
		set2.add("Navadit");
		set2.add("Alpesh");
		set2.add("Risabh");
		set2.add("Aryan");
		set2.add("Saini");
		set2.add("Priyanshi");
		set2.add("Shivendu");
		set2.add("null");
		System.out.println(set2);
		
		System.out.println(set2.contains("prince"));
	}

}
