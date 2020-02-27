package com.tekinikhil.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class App 
{
	private static Logger LOGGER=LogManager.getLogger(App.class);
	public static void main(String s[])
	{
		constructionCostStandard();
		constructionCostAboveStandard();
		constructionCostHighStandard();
		constructionCostHighStandardAutoHome();
		testSimpleInterestCalculator();
		testCompoundInterestCalculator();
	}
	public static void constructionCostStandard()
	{
		ConstructionPriceCalculatorApp standardMaterial=new ConstructionPriceCalculatorApp();
		standardMaterial.takeInputParameters(55,"standard",false);
		double constructionPrice=standardMaterial.calculateConstructionCost();
		LOGGER.debug("Construction Cost with Standard Material for area=55 : "+constructionPrice);
	}
	public static void constructionCostAboveStandard()
	{
		ConstructionPriceCalculatorApp aboveStandardMaterial=new ConstructionPriceCalculatorApp();
		aboveStandardMaterial.takeInputParameters(60,"aboveStandard");
		double constructionPrice=aboveStandardMaterial.calculateConstructionCost();
		LOGGER.debug("Construction Cost with AboveStandard Material for area=60 : "+constructionPrice);
	}
	public static void constructionCostHighStandard()
	{
		ConstructionPriceCalculatorApp highStandardMaterial=new ConstructionPriceCalculatorApp();
		highStandardMaterial.takeInputParameters(100,"highStandard",false);
		double constructionPrice=highStandardMaterial.calculateConstructionCost();
		LOGGER.debug("Construction Cost with HighStandard Material and no automation for area=100 : "+constructionPrice);
	}
	public static void constructionCostHighStandardAutoHome()
	{
		ConstructionPriceCalculatorApp highStandardMaterialAuto=new ConstructionPriceCalculatorApp();
		highStandardMaterialAuto.takeInputParameters(400,"highStandard",true);
		double constructionPrice=highStandardMaterialAuto.calculateConstructionCost();
		LOGGER.debug("Construction Cost with HighStandard Material and automation for area=400 : "+constructionPrice);
	}
	public static void testSimpleInterestCalculator()
	{
		InterestCalculatorApp simpleInterest=new InterestCalculatorApp();
		double simpleinterest1=simpleInterest.findSimpleInterest(22000,2,5);
		LOGGER.debug("P=22000 T=2 R=5 Simple Interest : "+simpleinterest1);
	}
	public static void testCompoundInterestCalculator()
	{
		InterestCalculatorApp compoundInterest=new InterestCalculatorApp();
		double compoundinterest1=compoundInterest.findCompoundInterest(12000,1,3);
		LOGGER.debug("P=12000 T=1 n=3 Compound Interest : "+compoundinterest1);
	}
}
