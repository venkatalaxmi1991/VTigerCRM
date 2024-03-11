package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateLeadDetailsPage {

	//Declaration

			@FindBy(xpath="//span[@class='dvHeaderText']")
			private WebElement pageHeader;
			
			
			@FindBy(xpath="//a[@class='hdrLink']")
			private WebElement contactsLink;
			
			
			
			@FindBy(name="Duplicate")
			private WebElement duplicateBuitton;
			
				
		
				
//			Initialization
			
			public CreateLeadDetailsPage(WebDriver driver)
			{
			PageFactory.initElements(driver,this);
			
			}
			
			
//			Utilization
			
			public String getPageHeader()
			{
				return pageHeader.getText();
			}
			
			
		public void clickContactsLink()
		{
			contactsLink.click();
		}

	}


