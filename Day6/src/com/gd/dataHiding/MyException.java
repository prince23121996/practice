package com.gd.dataHiding;
import java.io.*;
//demonstrate 5 check exception
//demonstrate 10 unchecked exception
//Example of unchecked exception
public class MyException {
	public static void main(String[] args)
	{
		//MyException ee=new MyException();
		try {
			//arithmeticexception
//			int a=10;
//			int b=0;
//			int c=a/b;
//			System.out.println(c+"");
			
			//nullpointerexception
//			String s=null;
//			System.out.println(s.length());
			
			
			//indexoutofbound exception
//			int[] arr=new int[5];     
//			arr[10]=50;
//			System.out.println(arr);
			
			//Example of checked exception
			FileInputStream st=new FileInputStream("File1.txt");
			
			
		}catch(Exception ex)
		{
			System.out.println(ex.getMessage());
			System.out.println(ex);
			
		}
	}
}
