import java.util.*;
class WithdrawException extends Exception
{
	WithdrawException(String str)
	{
		super(str);
	}
}
class BankAccount
{
	int accno = 202200;
	double balance;
	double d_amount;
	double w_amount;
	
	BankAccount()
	{
		accno=accno+1;
		balance=0;
	}
	
	void deposit(double d_amount)
	{
		balance=balance+d_amount;
	}
	
	void withdraw(double w_amount)
	{
		balance=balance-w_amount;
	}
	
	void show()
	{
		System.out.println("Account number: "+accno);
		System.out.println("Balance: Rs. "+balance);
	}
}
public class BankPrg {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("------Welcome to the bank !!------");
		int c;
		BankAccount b = new BankAccount();
		System.out.println("Welcome! Your account no is: "+b.accno);
		
		do
		{
		System.out.println("Enter your choice:\n1.Deposit\n2.Withdraw\n3.Display account information\n4.Exit");
		c=sc.nextInt();
			switch(c)
			{
			case 1:
				System.out.println("Enter amount to be deposited: ");
				b.d_amount=sc.nextDouble();
				b.deposit(b.d_amount);
				break;
		
			case 2:
				try
				{
					System.out.println("Enter amount to be withdrawn: ");
					b.w_amount=sc.nextDouble();
					if(b.w_amount>b.balance)
					{
						throw new WithdrawException("Withdrawl amount cannot be greater than balance amount.");
					}
					else
					{
						b.withdraw(b.w_amount);
					}	
				}
				catch(WithdrawException e)
				{
					System.out.println("Insufficient balance!!"+e);
					System.exit(0);
				}	
				break;
				
			case 3:
				b.show();
				break;
				
			case 4:
				System.exit(0);
				break;
				
			default:
				System.out.println("Invalid Input! Enter correct choice");
				System.exit(0);
			}
		}while(c!=4);
	}
}