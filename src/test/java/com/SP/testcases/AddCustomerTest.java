package com.SP.testcases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.SP.base.TestBase;
import com.SP.utilities.TestUtil;

public class AddCustomerTest extends TestBase {
	
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void addCustomerTest(Hashtable<String,String> data) throws InterruptedException{
		
		if(!data.get("runmode").equals("Y")){
			
			throw new SkipException("Skipping the test case as the Run mode for data set is NO");
		}
		
		
		click("addCustBtn_XPATH");
//		type("firstname_XPATH",data.get("firstname"));
//		type("lastname_XPATH",data.get("lastname"));
//		type("postcode_XPATH",data.get("postcode"));
//		click("addbtn_XPATH");
//		Thread.sleep(2000);
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
//		
//		Assert.assertTrue(alert.getText().contains(data.get("alerttext")));
//		alert.accept();
//		
//		Thread.sleep(2000);
//		
	}
	
	

}
