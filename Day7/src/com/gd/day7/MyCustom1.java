package com.gd.day7;

import java.util.*;

class OnlyPositive extends Exception
{
	public OnlyPositive(String msg)
	{
		super(msg);
	}
}

public class MyCustom1 {
	public static void main(String[] args)  {
		//Class.forName("hello");
		try {
			Scanner sc1=new Scanner(System.in);
			System.out.println("Please enter number:");
			int num=sc1.nextInt();
			
			if(num > 0) {     //in throw keyword only reference varible we can pass
				//throw new OnlyPositive("Enter only Positive Number");
				OnlyPositive on=new OnlyPositive("Enter only Positive Number");
				throw(on);
				
			}
			else
			{
				System.out.println("error");
			}
		}catch(OnlyPositive e) {
			System.out.println(e.getMessage());
		}
		
	}

}
