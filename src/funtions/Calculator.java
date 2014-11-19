/**
 * This file contains the Calculator class.
 * The Calculator class contains methods that...
 * This class was implemented using TDD...
 * 
 * Just do this header...
 */

package funtions;

import java.lang.Double;

import exception.*;

public class Calculator {
	
	// private Double EXPECTED_RESULT; // Created for tests
	
	private final static double DOUBLE_MAX = Double.MAX_VALUE;
	
	/**
	 * Sum two numbers
	 * @param firstNumber - The first number to sum
	 * @param secondNumber - The second number to sum
	 * @return The result of the sum of the two numbers
	 * @throws NullArgumentsToSumException
	 * @throws OverflowDoubleMaxException
	 */
	public Double sumTwoNumbers(final Double firstNumber, final Double secondNumber) 
								throws OverflowDoubleMaxException, NullArgumentsToSumException {
		
		// return null; // Made to fail the first test
		
		
		/*
		EXPECTED_RESULT = new Double(2);
		return EXPECTED_RESULT;
		*/ // Made to pass the first test // Time to commit
		
		
		/*
		if(firstNumber.doubleValue() == 1){
			EXPECTED_RESULT = new Double(2);
		}else{
			EXPECTED_RESULT = new Double(1);
		}
		
		return EXPECTED_RESULT;
		*/
		
		
		/*
		if(firstNumber.doubleValue() == 1){
			EXPECTED_RESULT = new Double(2);
			return EXPECTED_RESULT;
		}else if(firstNumber.doubleValue() == 0){
			EXPECTED_RESULT = new Double(1);
			return EXPECTED_RESULT;
		}else{
			throw new OverflowDoubleMaxException("Went over Double maximum value");
		}
		*/ // Made to pass the third and fourth tests
		
		if(firstNumber != null && secondNumber != null){
			
			// Get this condition better... Using like this just to test
			if(firstNumber.doubleValue() != DOUBLE_MAX
			   && secondNumber.doubleValue() != DOUBLE_MAX){
				
				double firstValue = firstNumber.doubleValue();
				double secondValue = secondNumber.doubleValue();
				double sumResult = firstValue + secondValue;
				
				Double result = new Double(sumResult);
				
				return result;
			}else{
				throw new OverflowDoubleMaxException("Went over Double maximum value");
			}
		}else{
			throw new NullArgumentsToSumException("One of the numbers passed to sum is null");
		}
	}

}
