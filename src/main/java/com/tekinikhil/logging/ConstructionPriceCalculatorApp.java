package com.tekinikhil.logging;

public class ConstructionPriceCalculatorApp 
{
	double houseAreaInSqFeet,estimatedConstructionCost;
	String materialStandard;
	boolean automatedHomeRequirement;
	public void takeInputParameters(double houseAreaInSqFeet,String materialStandard,boolean automatedHomeRequirement)
	{
		this.houseAreaInSqFeet=houseAreaInSqFeet;
		this.materialStandard=materialStandard;
		this.automatedHomeRequirement=automatedHomeRequirement;
	}
	public void takeInputParameters(double houseAreaInSqFeet,String materialStandard)
	{
		this.houseAreaInSqFeet=houseAreaInSqFeet;
		this.materialStandard=materialStandard;
		automatedHomeRequirement=false;
	}
	public double calculateConstructionCost()
	{
		switch(materialStandard)
		{
		case "standard":estimatedConstructionCost=1200*houseAreaInSqFeet;
		                break;
		case "aboveStandard":estimatedConstructionCost=1500*houseAreaInSqFeet;
                             break;
		case "highStandard":if(automatedHomeRequirement)
			                    estimatedConstructionCost=2500*houseAreaInSqFeet;
		                    else
		                    	estimatedConstructionCost=1800*houseAreaInSqFeet;
                            break;
		}
		return estimatedConstructionCost;
	}
}
