package com.tekinikhil.logging;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConstructionPriceCalculatorAppTest 
{
	@Test
	void constructionCostStandard()
	{
		ConstructionPriceCalculatorApp standardMaterial=new ConstructionPriceCalculatorApp();
		standardMaterial.takeInputParameters(55,"standard",false);
		double constructionPrice=standardMaterial.calculateConstructionCost();
		assertEquals(66000,constructionPrice,1);
	}
	@Test
	void constructionCostAboveStandard()
	{
		ConstructionPriceCalculatorApp aboveStandardMaterial=new ConstructionPriceCalculatorApp();
		aboveStandardMaterial.takeInputParameters(60,"aboveStandard");
		double constructionPrice=aboveStandardMaterial.calculateConstructionCost();
		assertEquals(90000,constructionPrice,1);
	}
	@Test
	void constructionCostHighStandard()
	{
		ConstructionPriceCalculatorApp highStandardMaterial=new ConstructionPriceCalculatorApp();
		highStandardMaterial.takeInputParameters(100,"highStandard",false);
		double constructionPrice=highStandardMaterial.calculateConstructionCost();
		assertEquals(180000,constructionPrice,1);
	}
	@Test
	void constructionCostHighStandardAutoHome()
	{
		ConstructionPriceCalculatorApp highStandardMaterialAuto=new ConstructionPriceCalculatorApp();
		highStandardMaterialAuto.takeInputParameters(400,"highStandard",true);
		double constructionPrice=highStandardMaterialAuto.calculateConstructionCost();
		assertEquals(1000000,constructionPrice,1);
	}
}
