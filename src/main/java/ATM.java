import java.math.BigDecimal;
import java.text.DecimalFormat;

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
	
		DecimalFormat paddDepositAmount = new DecimalFormat("##,###.00");
		System.out.println("Your deposit of " + paddDepositAmount.format(amount) + " was successful.");
		balance = balance.add(amount);
		System.out.println("Your new balance is now: " + paddDepositAmount.format(balance)+ "\n");	
		
		return balance;
	}

	public BigDecimal withdraw(BigDecimal amount)
	{	
		DecimalFormat paddWithdrawAmount = new DecimalFormat("##,###.00");
		
		System.out.println("Your withdraw of " + paddWithdrawAmount.format(amount) + " was successful.");
		balance = balance.subtract(amount);
		System.out.println("Your new balance is now: " + paddWithdrawAmount.format(balance)+ "\n");	
		return balance;
	}
	
	public BigDecimal getBalance()
	{
		return balance;
	}
}
