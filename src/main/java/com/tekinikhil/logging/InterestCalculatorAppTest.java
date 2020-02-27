package com.tekinikhil.logging;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class InterestCalculatorAppTest 
{

	@Test
	public void testSimpleInterestCalculator()
	{
		InterestCalculatorApp simpleInterest=new InterestCalculatorApp();
		double simpleinterest1=simpleInterest.findSimpleInterest(22000,2,5);
		assertEquals(2200,simpleinterest1,1);
	}
	@Test
	public void testCompoundInterestCalculator()
	{
		InterestCalculatorApp compoundInterest=new InterestCalculatorApp();
		double compoundinterest1=compoundInterest.findCompoundInterest(12000,1,3);
		assertEquals(12360,compoundinterest1,1);
	}
}
