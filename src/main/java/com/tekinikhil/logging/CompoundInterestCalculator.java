package com.tekinikhil.logging;

public class CompoundInterestCalculator 
{
	double principle,time,rateOfInterest;
	CompoundInterestCalculator(double principle,double time,double rateOfInterest)
	{
		this.principle=principle;
		this.time=time;
		this.rateOfInterest=rateOfInterest;
	}
	public double calculateCompoundInterest()
	{
		return principle*(Math.pow((1+(rateOfInterest/100)),time));
	}
}
