import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.Test;

public class AtmTest
{
	ATM atm = new ATM("1234", new BigDecimal(100.00));
	
	@Test
	public void shouldReturnTrueWhenPinsMatch()
	{
		// Arrange
		boolean underTest = atm.isAllowedAccess("1234");
		
		// Act
		
		// Assert
		Assert.assertEquals(true, underTest);
	}
	
	@Test
	public void shouldReturnFalseWhenPinsMatch()
	{
		// Arrange
		boolean underTest = atm.isAllowedAccess("1244");
		
		// Act
		
		// Assert
		Assert.assertEquals(false, underTest);
	}
	
	@Test
	public void shouldDecreaseBalance()
	{
		// Arrange
		BigDecimal underTestWithdrawAmount = atm.withdraw(new BigDecimal(50.00));
		BigDecimal expectedBankBalance = new BigDecimal(50.00);

		// Assert
		Assert.assertEquals(expectedBankBalance, underTestWithdrawAmount);
	}
	
	@Test
	public void shouldIncreaseBalance()
	{
		// Arrange
		BigDecimal underTestDepositAmount = atm.deposit(new BigDecimal(50.00));
		BigDecimal expectedBankBalance = new BigDecimal(150.00);

		// Assert
		Assert.assertEquals(expectedBankBalance, underTestDepositAmount);
	}
	
	@Test
	public void shouldReturnBalance()
	{
		// Arrange
		BigDecimal underTestBalance = atm.getBalance();
		BigDecimal expectedBankBalance = new BigDecimal(100.00);

		// Assert
		Assert.assertEquals(expectedBankBalance, underTestBalance);
	}
	
	@Test
	public void shouldReturnTrueWhenCanWithdraw()
	{
		// Arrange
		boolean underTestWithdraw = atm.canWithdraw(new BigDecimal(100.00));		
		// Act
		
		// Assert
		Assert.assertEquals(true, underTestWithdraw);
	}
	
	@Test
	public void shouldReturnFalseWhenCanWithdraw()
	{
		// Arrange
		boolean underTestWithdraw = atm.canWithdraw(new BigDecimal(101.00));
		
		// Act
		
		// Assert
		Assert.assertEquals(false, underTestWithdraw);
	}
	
	@Test
	public void shouldReturnTrueWhenCanDeposit()
	{
		// Arrange
		boolean underTestDeposit = atm.canDeposit(new BigDecimal(100.00));		
		// Act
		
		// Assert
		Assert.assertEquals(true, underTestDeposit);
	}
	
	@Test
	public void shouldReturnFalseWhenCanDeposit()
	{
		// Arrange
		boolean underTestWithdraw = atm.canWithdraw(new BigDecimal(101.00));
		
		// Act
		
		// Assert
		Assert.assertEquals(false, underTestWithdraw);
	}
}
