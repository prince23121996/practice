package com.gd.prac1;

import java.util.*;

class BankAcount implements Comparable<BankAcount> {
	private String your_name;
	private String father_name;
	private String mother_name;
	private String account_type;
	private int amount = 500;

	public BankAcount(String your_name, String father_name, String mother_name, String account_type, int amount) {
		this.your_name = your_name;
		this.father_name = father_name;
		this.mother_name = mother_name;
		this.account_type = account_type;
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "BankAcount [your_name=" + your_name + ", father_name=" + father_name + ", mother_name=" + mother_name
				+ ", account_type=" + account_type + ", amount=" + amount + "]";
	}

	public String getYour_name() {
		return your_name;
	}

	public void setYour_name(String your_name) {
		this.your_name = your_name;
	}

	public String getFather_name() {
		return father_name;
	}

	public void setFather_name(String father_name) {
		this.father_name = father_name;
	}

	public String getMother_name() {
		return mother_name;
	}

	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}

	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	@Override
	public int compareTo(BankAcount o) {
		return this.getYour_name().compareTo(o.getYour_name());
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

}

public class MyCLass7 {
	public static void main(String[] args) throws Exception {
		Map<String, BankAcount> map = new HashMap<String, BankAcount>();
		int n = 1;
		while(n != 0) {
			Scanner sc1 = new Scanner(System.in);
			System.out.println("Press 1 for add acount");
			System.out.println("Press 2 for delete acount");
			System.out.println("Press 3 for update acount");
			System.out.println("Press 4 for sorted the account list");
			int n1 = sc1.nextInt();
			switch (n1) {
			case 1:
				Scanner sc2 = new Scanner(System.in);
				System.out.println("Enter your name:");
				String s1 = sc2.nextLine();
				System.out.println("Enter your father name:");
				String s2 = sc2.nextLine();
				System.out.println("Enter Your Mother name:");
				String s3 = sc2.nextLine();
				System.out.println("Enter Account type:");
				String s4 = sc2.nextLine();
				System.out.println("Enter amount");
				int s5 = 500;
				s5 = sc2.nextInt();
				if(s5<500)
					throw new Exception("Amount should be more then 500");

				Date d2 = new Date();
				String acc1 = "IN" + "HDFC" + d2.getTime();

				map.put(acc1, new BankAcount(s1, s2, s3, s4, s5));

				System.out.println("Your account has been created");
				System.out.println(map.get(acc1));
				System.out.println("Your account number is: " + acc1);

				break;

			case 2:
				Scanner sc3 = new Scanner(System.in);
				System.out.println("Please enter your account number:");
				String s6 = sc3.nextLine();
				map.remove(s6);
				System.out.println("Your account has been Removed");
				break;

			case 3:
				Scanner sc4 = new Scanner(System.in);
				System.out.println("What you want to update");
				System.out.println("Press 1 for update your name");
				System.out.println("Press 2 for update father name");
				System.out.println("Press 3 for update mother name");

				int i2 = sc4.nextInt();

				switch (i2) {
				case 1:
					Scanner sc5 = new Scanner(System.in);
					System.out.println("Please Enter your updated name:");
					String s7 = sc5.nextLine();
					System.out.println("Please enter your account number:");
					String s8 = sc5.nextLine();
					map.replace(s8, new BankAcount(s8, map.get(s8).getFather_name(), map.get(s8).getMother_name(),
							map.get(s8).getAccount_type(), map.get(s8).getAmount()));
					System.out.println(map.get(s7));

					break;
				case 2:
					Scanner sc6 = new Scanner(System.in);
					System.out.println("Enter Your father updated name:");
					String s9 = sc6.nextLine();
					System.out.println("Please Enter your account number:");
					String s10 = sc6.nextLine();
					map.replace(s10, new BankAcount(s9, map.get(s10).getYour_name(), map.get(s10).getAccount_type(),
							map.get(s10).getMother_name(), map.get(s10).getAmount()));
					break;
				case 3:
					Scanner sc7 = new Scanner(System.in);
					System.out.println("Enter Your Mother updated name:");
					String s11 = sc7.nextLine();
					System.out.println("Please Enter your account number:");
					String s12 = sc7.nextLine();
					map.replace(s12, new BankAcount(s11, map.get(s12).getYour_name(), map.get(s12).getAccount_type(),
							map.get(s12).getMother_name(), map.get(s12).getAmount()));
					break;

				default:
					System.out.println("PLease enter the right key");
				}
			case 4:
				System.out.println("Sorted list:");
				List<String> ls1=new ArrayList<String>(map.keySet());
				Collections.sort(ls1);
				for(String ll:ls1)
				{
					System.out.println("Sorted List:"+ ll);
				}
				break;

			default:
				System.out.println("Please enter the right key");
				break;

			}
			Scanner sc13=new Scanner(System.in);
			System.out.println("Press 1 for continue");
			n=sc13.nextInt();
			
		}
	}
}
