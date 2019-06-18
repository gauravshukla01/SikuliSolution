package org.cts.oneframework.sikuli;

import java.util.Map;

import org.apache.poi.util.SystemOutLogger;
import org.cts.oneframework.annotation.ExcelDetails;
import org.cts.oneframework.configprovider.ConfigProvider;
import org.cts.oneframework.seleniumadapter.utils.BaseTest;
import org.cts.oneframework.sikuli.pages.HomePage;
import org.cts.oneframework.sikuliutils.SikuliUtils;
import org.cts.oneframework.utilities.Screenshots;
import org.cts.oneframework.utilities.WaitUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Key;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Pattern;
import org.sikuli.script.Region;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

@ExcelDetails
public class Tests extends BaseTest{
	
	
	
	private HomePage homePage;

	@Test(dataProvider = "data")

	public void verifyTicketBook(Map<String, String> input) throws Exception{

		try {
			
			launchApplication(ConfigProvider.getAsString("url"));
			homePage = new HomePage(getDriver());
			String From  = input.get("From");
			String To =input.get("To");
			homePage.bookTicket(From, To);
			
		} catch(Exception e) {

			e.printStackTrace();
		}

	}


   @Test(priority =1)
   
   public void fileUpload() {
	   homePage = new HomePage(getDriver());
	   
	   launchApplication(ConfigProvider.getAsString("url2"));
	   
	   homePage.uploadFile();
   }






}



