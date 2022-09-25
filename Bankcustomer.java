import java.lang.*;
import java.util.*;
class Bankcustomer
{
	public static String bankName=" BANK OF MUMBAI";
	public String name;
	public double balance;
	
	public void customer(String name)
	{
		this.name=name;
		//this.balance=balance;
	
	}
	public void deposit(double amount)
	{
		this.balance=this.balance+amount;
		System.out.println("after deposit  balance :"+this.balance);
		
	}
	public void withdrawa(double amount)
	{
		if(amount>balance)
		{
			System.out.println("Sorry insuficient balance.....");
			System.exit(0);
			
		}	
		else
		{
			balance=balance-amount;
			System.out.println("After withdrawa balance is "+balance);
		}
		
	}
	public static void main(String[] args)
	{
		System.out.println("Welcome to "+customer.bankName);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name:");
		String name=sc.next();
		customer c1=new customer(name);
		System.out.println("hello "+c1.name+" your account got created");
		while(true)
		{
			System.out.println("choose your option to perform ");
			System.out.println("D-deposit\n W-withdrawal\nE-exit");
			String option=sc.next();
			if(option.equalsIgnoreCase("D"))
			{
				System.out.println("Enter amount:");
				double amount=sc.nextDouble();
				c1.deposit(amount);
				
			}
			else if(option.equalsIgnoreCase("W"))
			{
				System.out.println("Enter withdrawal amount");
				double amount=sc.nextDouble();
				c1.withdrawa(amount);
			}
			else if(option.equalsIgnoreCase("E"))
			{
				System.out.println("thanks for bankimg....");
				System.exit(0);
			}
			else
				System.out.println("invalid option....please choose valid option");
			
		}
	
	}


}