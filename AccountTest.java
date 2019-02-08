package week3;
import java.util.Scanner;

public class AccountTest
{
	private static Account[] accounts = new Account[10];
	public AccountTest()
	{
		for (int i = 0, k = 100; i < accounts.length; i++)
		{
			accounts[i] = new Account(i, k);
		}
	}
	
	public Account getAccounts(int i)
	{
		return this.accounts[i];
	}
	
	public static void main (String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ID");
		int id = input.nextInt();
		
		while (!((id < 10) && (id >= 0)))
		{
			System.out.println("Enter a correct ID.");
			id = input.nextInt();
		}
		
		int choice = 0;
		
		do {
		System.out.print("Main Menu\n1: Check Balance\n2: Withdraw\n3: Deposit\n4: Exit\nEnter a choice:");
		choice = input.nextInt();
		
		if (choice == 1)
		{
			double balance = accounts[id].getBalance();
			System.out.printf("The balance is $%.2f", balance);
			choice = 0;
			
		}
		else if (choice == 2)
		{
			System.out.println("Enter an amount to withdraw: ");
			double withdraw = input.nextDouble();
			accounts[id].withdraw(withdraw);
			choice = 0;
		}
		else if (choice == 3)
		{
			System.out.println("Enter an amount to deposit: ");
			double deposit = input.nextDouble();
			accounts[id].deposit(deposit);
			choice = 0;
		}
		else
		{
			System.out.println("Enter an ID");
			id = input.nextInt();
			
			while (!((id < 10) && (id >= 0)))
			{
				System.out.println("Enter a correct ID.");
				id = input.nextInt();
			}
		}
			
		}while((id < 10) && (id >= 0));
			
		
	}
}
