package week3;
import java.util.Date;

public class Account 
{
	private int id;
	private double balance;
	private double annualInterestRate;
	private Date dateCreated;
	
	public Account()
	{
		dateCreated = new Date();
	}
	
	public Account(int id, double balance)
	{
		this();
		this.id = id;
		this.balance = balance;		
	}
	
	public int getID()
	{
		return id;
	}
	public void setID(int newID)
	{
		id = newID;
	}
	
	public double getBalance()
	{
		return balance;
	}
	public void setBalance(double newBalance)
	{
		balance = newBalance;
	}
	
	public double getInterest()
	{
		return annualInterestRate;
	}
	public void setInterest(double newInterest)
	{
		annualInterestRate = newInterest;
	}
	
	public String getDate()
	{
		return dateCreated.toString();
	}
	
	public double getMonthlyInterest()
	{
		return balance * (annualInterestRate / 100 / 12);
	}
	public void withdraw(double withdraw)
	{
		balance -= withdraw;
	}
	public void deposit(double deposit)
	{
		balance += deposit;
	}
	
	public static void main(String[] args) 
	{
	Account test = new Account(1122, 20000);
	test.setInterest(4.5);
	test.withdraw(2500);
	test.deposit(3000);
	System.out.printf("Balance: $%.2f\nMonthly Interest: $%.2f\nAccount Created: %s", test.getBalance(), test.getMonthlyInterest(), test.getDate());
	}
}
