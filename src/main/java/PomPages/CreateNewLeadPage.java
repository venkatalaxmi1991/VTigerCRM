package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class CreateNewLeadPage {

	                                                                                               //input[@value='T']
	//Declaration

			@FindBy(xpath="//span[@class='lvtHeaderText']")
			private WebElement pageHeader;
			
		
			@FindBy(name="lastname")
			private WebElement lastnameTF;
				
			@FindBy(name="company")
			private WebElement companyTF   ;              
			
			
			@FindBy(xpath="//input[normalize-space(@value)='Save']")
			private WebElement saveButton;
				
			
		
				
//			Initialization
			
			public CreateNewLeadPage(WebDriver driver)
			{
			PageFactory.initElements(driver,this);
			
			}
			
			
//			Utilization
			
			public String getPageHeader()
			{
				return pageHeader.getText();
			}
			
			public void setName(String lastname)
			{
				lastnameTF.sendKeys(lastname);
				
			}
		
			public void setcompany(String company)
			{
				companyTF.sendKeys(company);
			}
			
			public void clicksave()
			{
				saveButton.click();
			}
}
			