package com.guardian.example1;

class A
{
	final int a=20;
}
class B extends A
{
	public void print()
	{
		System.out.println(this.a);
	}
}

public class MyClass {
	public static void main(String[] args)
	{
		B bb=new B();
		bb.print();
	}

}
