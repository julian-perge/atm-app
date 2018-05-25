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
		BigDecimal underTestBalance = atm.withdraw(new BigDecimal(101.00));
		BigDecimal expectedBankBalance = new BigDecimal(100.00);

		// Assert
		Assert.assertEquals(expectedBankBalance, underTestBalance);
	}
	
	@Test
	public void shouldIncreaseBalance()
	{
		// Arrange
		BigDecimal underTestBalance = atm.deposit(new BigDecimal(50.00));
		BigDecimal expectedBankBalance = new BigDecimal(150.00);

		// Assert
		Assert.assertEquals(expectedBankBalance, underTestBalance);
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
}
