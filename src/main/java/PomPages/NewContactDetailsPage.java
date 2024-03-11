package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class NewContactDetailsPage {


	//Declaration

		@FindBy(xpath="//span[@class='dvHeaderText']")
		private WebElement pageHeader;
		
		
		@FindBy(xpath="//a[@class='hdrLink']")
		private WebElement contactsLink;
		
		
	
			
//		Initialization
		
		public NewContactDetailsPage(WebDriver driver)
		{
		PageFactory.initElements(driver,this);
		
		}
		
		
//		Utilization
		
		public String getPageHeader()
		{
			return pageHeader.getText();
		}
		
		
	public void clickContactsLink()
	{
		contactsLink.click();
	}

}