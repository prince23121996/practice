package gd.com.day101;
import java.util.*;

public class MyMap {
	public static void main(String[] args) {
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(101, "Prince");
		map.put(109, "Alpesh");
		map.put(102, "Shivendu");
		map.put(108, "Risabh");
		map.put(103, "Aryan");
		map.put(107, "Priyanshi");
		map.put(104, "Saini");
		map.put(106, "Navadit");
		map.put(105, "Taiyab");
		map.put(108, "Rits");
		
		map.remove(101);
		System.out.println(map.containsKey(101));
		System.out.println(map.isEmpty());
		System.out.println(map.replace(109, "ajay"));
		System.out.println(map.size());
		
		
		System.out.println(map.containsKey(102));
		System.out.println(map.containsValue("aryan"));
		//Collections.sort(map);
		System.out.println(map);
		
		
	}
	
}
