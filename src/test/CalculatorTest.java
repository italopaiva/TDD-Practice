package test;

import java.lang.Double; 

import junit.framework.Assert;
import junit.framework.AssertionFailedError;
import funtions.Calculator;
import exception.NullArgumentsToSumException;
import exception.OverflowDoubleMaxException;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest{
	
	private final static double DOUBLE_MAX = Double.MAX_VALUE;
	
	// Tests for valid entries
	@Test
	public void shouldSumOnePlusOne() throws OverflowDoubleMaxException,
									  NullArgumentsToSumException {
		Double gottenResult = sumToTest(1,1);
		Double expectedResult = new Double(2);
			
		assertEquals("The sum should be equals to 2", expectedResult, gottenResult);
	}
	
	@Test
	public void shouldSumZeroPlusOne() throws OverflowDoubleMaxException,
									   NullArgumentsToSumException {
		Double gottenResult = sumToTest(0,1);
		Double expectedResult = new Double(1);
		
		assertEquals("The sum should be equals to 1", expectedResult, gottenResult);
	}
	
	/* More tests for valid entries ...*/
	// End of tests for valid entries
	
	// Tests for invalid entries
	@Test (expected = OverflowDoubleMaxException.class)
	public void shouldNotSumMaxDoublePlusOne() 
				throws OverflowDoubleMaxException,
				NullArgumentsToSumException{
		@SuppressWarnings("unused")
		Double gottenResult = sumToTest(DOUBLE_MAX,1);
		Assert.fail("Should throw an exception");
	}
	
	@Test (expected = OverflowDoubleMaxException.class)
	public void shouldNotSumMaxDoublePlusZeroDotZeroOne() 
				throws OverflowDoubleMaxException,
				NullArgumentsToSumException{
		@SuppressWarnings("unused")
		Double gottenResult = sumToTest(DOUBLE_MAX,0.01);
		Assert.fail("Should throw an exception");
	}
	
	/* More tests for invalid entries */
	
	// End of tests for invalid entries
	
	/**
	 * Calls the Calculator method sumTwoNumbers() to sum the numbers
	 * @param firstNumber - First number to sum
	 * @param secondNumber - Second number to sum
	 * @return the result of the sum
	 * @throws NullArgumentsToSumException 
	 */
	private Double sumToTest(final double firstNumber, final double secondNumber)
							 throws OverflowDoubleMaxException, NullArgumentsToSumException {
		Calculator calculator = new Calculator();
		
		Double firstNumberToSum = new Double(firstNumber);
		Double secondNumberToSum = new Double(secondNumber);
		
		Double sumResult = calculator.sumTwoNumbers(firstNumberToSum, secondNumberToSum);
		
		return sumResult;		
	}

}
