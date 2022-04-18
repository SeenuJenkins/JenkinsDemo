package com.saasant.paytracker.at.amazon;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.saasant.paytracker.at.PTAutomationBase;

public class AmazonUKXero extends PTAutomationBase {

	@BeforeClass
	public void initialize() throws IOException, InterruptedException {
		loadSystemConfigs();
		initializeData("amazon", getProperty("uk.xero.company.name"), "xero", "uk");
	}

	@AfterMethod
	public void undoData() {
		undotransaction();
		clearTestData();
	}

	@AfterClass
	public void clearInitialize() {
		clearData();
	}
/*
	@Test
	public void TC_001() {
		executeTestCase("uk", "tc_001");
	}

	@Test
	public void TC_002() {
		executeTestCase("uk", "tc_002");
	}

	@Test
	public void TC_003() {
		executeTestCase("uk", "tc_003");
	}

	@Test
	public void TC_004() {
		executeTestCase("uk", "tc_004");
	}

	@Test
	public void TC_005() {
		executeTestCase("uk", "tc_005");
	}

	@Test

	public void TC_006() {
		executeTestCase("uk", "tc_006");
	}

	@Test

	public void TC_007() {
		executeTestCase("uk", "tc_007");
	}

	@Test

	public void TC_008() {
		executeTestCase("uk", "tc_008");
	}

	@Test

	public void TC_009() {
		executeTestCase("uk", "tc_009");
	}

	@Test

	public void TC_010() {
		executeTestCase("uk", "tc_010");
	}

	@Test

	public void TC_011() {
		executeTestCase("uk", "tc_011");
	}

	@Test
	public void TC_012() {
		executeTestCase("uk", "tc_012");
	}

	@Test
	public void TC_013() {
		executeTestCase("uk", "tc_013");
	}

	@Test
	public void TC_014() {
		executeTestCase("uk", "tc_014");
	}

	@Test

	public void TC_015() {
		executeTestCase("uk", "tc_015");
	}

	@Test

	public void TC_016() {
		executeTestCase("uk", "tc_016");
	}

	@Test

	public void TC_017() {
		executeTestCase("uk", "tc_017");
	}

	@Test

	public void TC_018() {
		executeTestCase("uk", "tc_018");
	}

	@Test

	public void TC_019() {
		executeTestCase("uk", "tc_019");
	}

	@Test

	public void TC_020() {
		executeTestCase("uk", "tc_020");
	}

	@Test
	public void tc_021() {
		executeTestCase("uk", "tc_021");
	}

	@Test
	public void tc_022() {
		executeTestCase("uk", "tc_022");
	}

	
	@Test
	
	public void TC_023() {
		executeTestCase("uk", "tc_023");
	}

	@Test
	public void TC_024() {
		executeTestCase("uk", "tc_024");
	}

	@Test

	public void TC_025() {
		executeTestCase("uk", "tc_025");
	}

	@Test

	public void TC_026() {
		executeTestCase("uk", "tc_026");
	}

	@Test

	public void TC_027() {
		executeTestCase("uk", "tc_027");
	}

	@Test

	public void TC_028() {
		executeTestCase("uk", "tc_028");
	}
*/
	@Test

	public void TC_029() {
		executeTestCase("uk", "tc_029");
	}
	
	@Test

	public void TC_030() {
		executeTestCase("uk", "tc_030");
	}
	
	@Test

	public void TC_031() {
		executePayoutTestCase("uk", "tc_031" ,getProperty("uk.xero.company.bank.id"));
	}
	
	@Test

	public void TC_032() {
		executePayoutTestCase("uk", "tc_032" ,getProperty("uk.xero.company.bank.id"));
	}

	

	
	
}
