package PomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import genericLibraries.WebDriverUtility;

public class LeadsPage {

//	Declaration
	
	
	
	@FindBy(xpath="//a[@class='hdrLink']")
	private WebElement pageHeader;
	
	
	

	@FindBy(xpath="//img[@alt='Create Lead...']")
	private WebElement plusButton;
	
	
	

	@FindBy(xpath="//table[@class='lvt small']/tbody/tr[last()]/td[3]/a")
	private WebElement newLeadLink ;
	
	Private String leadCheckboxPath="//a[text()='%s']/parent::td/preceding-sibling::td/input";
	
	private String leadCheckboxpath="//a[text()='%s']/ancestor::tr[@class='lvtColData']/descendant::input";
	
	

	@FindBy(xpath="//input[@value='Delete']")
	private WebElement deleteButton;
	
	
	@FindBy(xpath="//table[@class='lvt small']/tboby/tr/td[3]/a")
	
	
//	Initialization
	
	public  LeadsPage(WebDriver driver)
	{
	PageFactory.initElements(driver,this);
	
	}
	
	
	
//	Utilization
	
	public String getPageHeader()
	{
		return pageHeader.getText();
	}
	
	
	public void clickPlusButton()
	{
		
	
		plusButton.click();
	}

	
	public String getNewLeadName()
	{
		return newLeadLink.getText();
	}

	public void deleteLead(WebDriverUtility web,String leadName)
	{
		web.convertPathToWebElement(leadCheckboxpath,leadName).click();
		deleteButton.click();
	}
 public boolean    serchLead(String leadName)
 {
	 boolean status=false;
	 for(WebElement name:leadName)
		 if(name.getText().equals(leadName))
		 {
			 status=true;
			 break;
		 }
 }
		 }
		 
 }