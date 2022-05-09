package com.gd.day7;
import java.util.*;

class Num{
	public static int div(int a, int b) throws ArithmeticException{
		int d=a/b;
		return d;
	}
}

public class MyCustom2 {
	public static void main(String[] args) {
		Num n=new Num();
		try {
			System.out.println(n.div(20, 0));
		}catch(ArithmeticException e)
		{
			System.out.println("number cannot divided by 0");
		}
		
		
	}
	
}
