package com.gd.day11;

//write a lambda expression to print 1 to 10 
//write a lambda to sum of 1 to 10 number
//write a lambda expression to find even and odd
//write a lambda expression to find the positive or negative number

interface Mysub {
	public void ss(int d, int e);
}

interface MyStr {
	public void myss(String str);
}

interface MyMult {
	public void mult(int x, int y);
}

interface MyPrint{
	public void print(int s);
}

interface MyPrint1{
	public void sum(int s);
}

interface FindEven{
	public void feven(int u);
}

interface FindPos{
	public void fpos(int n);
}

public class MyLamda1 {
	public static void main(String[] args) {
		//sub(10,5);
		Mysub sub=(int d, int e) -> {
			int f=d-e;
			System.out.println("Sub is: "+f);
		};
		sub.ss(10,5);
		
		//String Length
		String len="Hello_Jimmi";
		
		MyStr lenob = (str) -> {
			System.out.println("Length of String is: "+str.length());
			
		};
		lenob.myss(len);
		
		//Multiplication
		MyMult mul=(int x, int y)->{
			int c=x*y;
			System.out.println("Multiplication is :"+c);
		};
		mul.mult(5, 2);
		
		
		//write a lambda expression to print 1 to 10 
		MyPrint p=(int s) -> {
//			while(s<=10)
//			{
//				System.out.println(s++);
//			}
			for(s=1;s<=10;s++)
			{
				System.out.println(s+"");
			}
		};
		p.print(1);
		
		
		//write a lambda to sum of 1 to 10 number
		
		MyPrint1 ss=(int s) -> {
			int sss=0;
			
			for(s=1;s<=10;s++)
			{
				sss=sss+s;
			}
			System.out.println("Sum is: "+sss);
		};
		ss.sum(1);
		
		//write a lambda expression to find even and odd
		FindEven even=(int u) -> {
			if(u%2==0)
				System.out.println("Number is even");
			else
				System.out.println("Number is not even");
		};
		even.feven(44);
		
		
		//write a lambda expression to find the positive or negative number
		FindPos pos=(int n) -> {
			if(n>=0)
				System.out.println("Number is Positive");
			else 
				System.out.println("number is Negative");
		};
		pos.fpos(-2);
	}
}