import java.math.BigDecimal;

public class ATM
{
	private String requiredPin = "1234";
	private BigDecimal balance;
	
	// sets the required pin permanently
	public ATM(String pin, BigDecimal balance)
	{
		requiredPin = pin;
		this.balance = balance;
	}
	
	// call for the true pin number
//	public String getPin() 
//	{
//		return requiredPin;
//	}
	
	// returns true if the passed pin is correct
	public boolean isAllowedAccess(String pin)
	{
		if (!pin.equals(requiredPin))
		{
			return false;
		}
		else
		{
			return true;
		}
		
	}
	
	public boolean canWithdraw(BigDecimal amount)
	{
		if (balance.compareTo(amount) < 0)
		{
			return false;
		}
		
		return true;
	}
	
	public BigDecimal deposit(BigDecimal amount)
	{
		balance = balance.add(amount);
		return balance;
	}

	public BigDecimal withdraw(BigDecimal amount)
	{	
		System.out.println("Your withdraw of " + amount + " was successful.");
		balance = balance.subtract(amount);
		System.out.println("Your new balance is now: " + balance + "\n");	
		return balance;
	}
	
	public BigDecimal getBalance()
	{
		return balance;
	}
}
