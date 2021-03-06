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
	public static void main(String[] args) {
		Map<String, BAccount> mp = new HashMap<String, BAccount>();
		BAccount b1 = new BAccount();
		int i = 1;
		
		while(i != 0) {
			int choose = 0;
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter 1 for add account");
			System.out.println("Enter 2 for delete account");
			System.out.println("Enter 3 for Update account");

			choose = sc.nextInt();
			switch (choose) {

			case 1:
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Enter bank name:");
				String acoo = sc2.nextLine();
				System.out.println("Please Enter Your Name:");
				String name = sc2.nextLine();
				System.out.println("Please Enter Your Father Name:");
				String fname = sc2.nextLine();
				System.out.println("Please Enter Your Mother Name:");
				String mname = sc2.nextLine();
				System.out.println("Please Enter your account type:");
				String atype = sc2.nextLine();
				System.out.println("Please Enter Amount:");
				int amnt = 500;
				amnt = sc2.nextInt();

				Date d1 = new Date();
				Long acc = d1.getTime();
				String acc_no = "IN" + "HDFC" + acc;

				b1.setAco(acoo);
				b1.setName(name);
				b1.setFname(fname);
				b1.setMname(mname);
				b1.setAtype(atype);
				b1.setMbalance(amnt);

				mp.put(acc_no, b1);

				System.out.println("Account has been created");
				System.out.println(acc_no);
				System.out.println(mp.get(acc_no));
				break;
			case 2:
				Scanner sc3 = new Scanner(System.in);
				System.out.println("Please enter account number to delete:");
				Long acc2 = sc3.nextLong();
				mp.remove(acc2);
				System.out.println("Your account has been removed");
				break;
			case 3:
				System.out.println("Press 1 for update name" + "Press 2 for update fathers name"
						+ "Press 3 for update mothers name");
				Scanner sc4 = new Scanner(System.in);
				int p = sc4.nextInt();
				
				switch (p) {

				case 1:
					System.out.println("Please Enter the updated name:");
					Scanner sc5 = new Scanner(System.in);
					String un = sc5.nextLine();

					System.out.println("Enter account number:");
					String accn = sc5.nextLine();
					b1.setName(un);
					mp.replace(accn, b1);
					System.out.println("Name has been changed");
					break;

				case 2:
					System.out.println("Please Enter father name:");
					Scanner sc6 = new Scanner(System.in);
					String un1 = sc6.nextLine();

					System.out.println("Enter account number:");
					String accn1 = sc6.nextLine();
					b1.setName(un1);
					mp.replace(accn1, b1);
					System.out.println("father Name has been changed");
					break;
					
				case 3:
					System.out.println("Please Enter Mother name:");
					Scanner sc7 = new Scanner(System.in);
					String un2 = sc7.nextLine();

					System.out.println("Enter account number:");
					String accn2 = sc7.nextLine();
					b1.setName(un2);
					mp.replace(accn2, b1);
					System.out.println("Mother Name has been changed");
					break;
					
					default :
						System.out.println("Please enter the right key");

				}

			default:
				System.out.println("Please enter correct number");

			}
			System.out.println("Press 0 for exit");
			System.out.println("Press any key for continue:");
			Scanner sc8=new Scanner(System.in);
			i=sc8.nextInt();
		}
	}
}