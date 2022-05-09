package com.gd.dataHiding;

//final : it make the class , method and variable as final

//final class--class cannot be extends
//final variable --you cannot change the value of variable
//final method-- override will not be allowed 

//this class is final now

class A {

	 final int a = 10;

	 public void print() {
		System.out.println("I am base class" + a);
	}

}

class B extends A {

	@Override
	public void print() {
		System.out.println("I am base class"+ a);
	}
}


public class MyFinalKeyword {
	public static void main(String[] args)
	{
		B bb=new B();
		bb.print();
	}
}
