package com.gd.prac1;

/*Create a Bank Account class to store the account information as follow : name , father name , Mother name ,
 *  Account number , Account type and minimum balance .
User should be able to add new account holder
User should be able to modify the account information and update. 
User should be able to delete any account using unique id  and account number.

While Add the new Account Holder make sure minimum balance of 
500 is added otherwise throw MinimumBalanceLimitedException.

If user does not have last name while adding the account throw User defined Exception LastNameRequired
Application Should be Menu Based like
Press 1 : Press 1 for Add new Account 
Press 2 : Press 2 for  Delete Account
Press 3: Update Account and then ask option update 1 : Press One for Update Name ,
Press 2 for Update Father Name  
Press 3 : Update Mother Name , 
Press 4 : Update Account Number 
Press 5 Account type , 
Press 6 For minimum balance 
Press 4 For Sort the data : then ask again Press 1 for sort by name ,
Press 2 for sort by account number

Business Logic  : There should not be any duplicate account number  
and account number should be generated as : "IN"+BankName+CurrentDateandTime
example : INHDFC20220905114712
CurrentDateandTime = date and time and second also 

ENUM : Saving, Current and Others

java.sql.date

*/
import java.util.*;

public class MyClass5 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		List<BAccount> ba = new ArrayList<BAccount>();

		BAccount b1 = new BAccount();
		System.out.println("Enter your name:");
		b1.setName(sc.nextLine());
		System.out.println("Enter your Father name:");
		b1.setFname(sc.nextLine());
		System.out.println("Enter your Mother name:");
		b1.setMname(sc.nextLine());
		System.out.println("Enter Account Type:");
		b1.setAtype(sc.nextLine());
		System.out.println("Minimum balance should be 500");
		int amnt = sc.nextInt();
		if (amnt >= 500) {
			b1.setMbalance(amnt);
		} else // throw new Exception("sorry device error");
		{
			System.out.println("Amount should be >=500 Please re-enter the amount");
			amnt = sc.nextInt();
		}
		
		Date d1=new Date();
		System.out.println(d1);

		ba.add(b1);
		System.out.println(b1);

	}
}