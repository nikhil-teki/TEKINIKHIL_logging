package com.tekinikhil.logging;

public class SimpleInterestCalculator 
{
	double principle,time,rateOfInterest;
	SimpleInterestCalculator(double principle,double time,double rateOfInterest)
	{
		this.principle=principle;
		this.time=time;
		this.rateOfInterest=rateOfInterest;
	}
	public double calculateSimpleInterest()
	{
		return (principle*time*rateOfInterest)/100;
	}
}
