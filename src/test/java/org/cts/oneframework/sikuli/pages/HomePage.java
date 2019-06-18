package org.cts.oneframework.sikuli.pages;

import org.cts.oneframework.configprovider.ConfigProvider;
import org.cts.oneframework.sikuli.AbstractClass;
import org.cts.oneframework.sikuliutils.SikuliUtils;
import org.cts.oneframework.utilities.BasePageObject;
import org.cts.oneframework.utilities.WaitUtils;
import org.openqa.selenium.WebDriver;
import org.sikuli.script.Screen;

public class HomePage extends BasePageObject {

	


	public HomePage(WebDriver webDriver) {
		super(webDriver);
		// TODO Auto-generated constructor stub
	}


	private final String chooseFile = "//input[@id='file-upload']";




	public void bookTicket(String from,String to) throws InterruptedException {

		SikuliUtils.sikuliSetText(AbstractClass.path("SearchBox_Google.PNG"), "goibibo");
		
		WaitUtils.sleep(2000);

		SikuliUtils.sikuliClick(AbstractClass.path("Google_Search.PNG"));

		SikuliUtils.sikuliClick(AbstractClass.path("Flights_2.PNG"));

		SikuliUtils.waitUntilImageFound(AbstractClass.path("fromtext.PNG"));
		
		SikuliUtils.sikuliClick(AbstractClass.path("fromtext.PNG"));

		SikuliUtils.sikuliSetText(AbstractClass.path("fromtext.PNG"), from);

		SikuliUtils.sikuliClick(AbstractClass.path("From_Chennai.PNG"));

		SikuliUtils.waitUntilImageFound(AbstractClass.path("To_TextBox.PNG"));

		SikuliUtils.sikuliSetText(AbstractClass.path("To_TextBox.PNG"), to);

		SikuliUtils.sikuliClick(AbstractClass.path("To_Place.PNG"));

		SikuliUtils.sikuliClick(AbstractClass.path("From_Date.PNG"));

		SikuliUtils.sikuliClick(AbstractClass.path("Search_Flight.PNG"));

		WaitUtils.sleep(4000);

	}

	public void uploadFile() {
		try {
			
			clickElement(chooseFile);

			SikuliUtils.sikuliSetText(AbstractClass.path("SaveAs.PNG"), AbstractClass.path("Search_Flight.PNG").replace("/", "\\"));
			
			SikuliUtils.sikuliClick(AbstractClass.path("Open.PNG"));
			
			SikuliUtils.sikuliClick(AbstractClass.path("Upload.PNG"));
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}






	}

}
