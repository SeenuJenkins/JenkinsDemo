package com.saasant.paytracker.at.amazon;

import java.io.IOException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.saasant.paytracker.at.PTAutomationBase;

public class AmazonCAQBO extends PTAutomationBase {

	@BeforeClass
	public void initialize() throws IOException, InterruptedException {
		loadSystemConfigs();
		initializeData("amazon", getProperty("canada.company.name"), "qbo", "ca");
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

	@Test
	public void TC_001() {
		executeTestCase("ca", "tc_001");
	}

	/*
	@Test
	public void TC_002() {
		executeTestCase("ca", "tc_002");
	}

	@Test
	public void TC_003() {
		executeTestCase("ca", "tc_003");
	}

	@Test
	public void TC_004() {
		executeTestCase("ca", "tc_004");
	}

	@Test
	public void TC_005() {
		executeTestCase("ca", "tc_005");
	}

	@Test

	public void TC_006() {
		executeTestCase("ca", "tc_006");
	}

	@Test

	public void TC_007() {
		executeTestCase("ca", "tc_007");
	}

	@Test

	public void TC_008() {
		executeTestCase("ca", "tc_008");
	}

	@Test

	public void TC_009() {
		executeTestCase("ca", "tc_009");
	}

	@Test

	public void TC_010() {
		executeTestCase("ca", "tc_010");
	}

	@Test

	public void TC_011() {
		executeTestCase("ca", "tc_011");
	}

	@Test
	public void TC_012() {
		executeTestCase("ca", "tc_012");
	}

	@Test
	public void TC_013() {
		executeTestCase("ca", "tc_013");
	}

	@Test
	public void TC_014() {
		executeTestCase("ca", "tc_014");
	}

	@Test

	public void TC_015() {
		executeTestCase("ca", "tc_015");
	}
	*/

}
