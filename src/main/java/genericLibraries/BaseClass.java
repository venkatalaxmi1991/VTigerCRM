package genericLibraries;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import PomPages.ContactsPage;
import PomPages.CreateNewContactPage;
import PomPages.CreateNewEventPage;
import PomPages.CreateNewLeadPage;
import PomPages.CreateNewOrganizationPage;
import PomPages.DuplicatingLeadPage;
import PomPages.DuplicatingleadPage;
import PomPages.HomePage;
import PomPages.LeadsPage;
import PomPages.LoginPage;
import PomPages.NewContactDetailsPage;
import PomPages.NewContactsDetailPage;
import PomPages.NewEventDetailPage;
import PomPages.NewEventDetailsPage;
import PomPages.NewLeadDetailsPage;
import PomPages.NewOrgDetailsPage;
import PomPages.OganizationPage;
import PomPages.OrganizationPage;
import PomPages.createNewContactPage;

public class BaseClass {
	//@BeforeSuite
	//@BeforeTest
	protected PropertiesUtility property;
	protected ExcelUtility excel;
	protected WebDriverUtility web;
	protected JavaUtility jutil;
	 
	protected WebDriver driver;
	
	protected LoginPage login;
	protected HomePage home;
	protected OrganizationPage org;
	protected ContactsPage contact;
    protected LeadsPage lead;
    protected CreateNewOrganizationPage createorg;
    protected CreateNewContactPage createContact;
    protected CreateNewLeadPage  createLead;
    protected CreateNewEventPage createEvent;
    protected DuplicatingLeadPage duplicateLead;
    protected  NewOrgDetailsPage newOrg;
    protected NewContactDetailsPage newContact;
    protected NewLeadDetailsPage newLead;
    protected NewEventDetailsPage newEvent;
    
	
	@BeforeClass
	public void classSetup() {
		property=new PropertiesUtility();
		excel=new ExcelUtility();
		web=new WebDriverUtility();
		jutil= new JavaUtility();
		
		
		property.propertiesInit(IConstantPath.PROPERTIES_PATH);
		driver=web.launchBrowserAndMaximize(property.readFromProperties("browser"));
		web.waitTillElementFound(Long.parseLong(property.readFromProperties("timeouts")));
	}
	@BeforeMethod
	public void methodsetup() {
		login=new LoginPage(driver);
		home=new HomePage(driver);
		org=new OrganizationPage(driver);
		contact=new ContactsPage(driver);
		lead=new LeadsPage(driver);
		createorg=new CreateNewOrganizationPage(driver);
		createContact=new CreateNewContactPage(driver);
		createLead=new CreateNewLeadPage(driver);
		createEvent=new CreateNewEventPage(driver);
	    newOrg=new NewOrgDetailsPage(driver);
	    newContact=new NewContactDetailsPage(driver);
	    newLead=new NewLeadDetailsPage();
	    newEvent=new NewEventDetailsPage(driver);
	    duplicateLead=new DuplicatingLeadPage(driver);
	    excel.excelInit(IConstantPath.EXCEL_PATH);
	    
	    web.navigateToApp(property.readFromProperties("url"));
	    login.loginToVtiger(property.readFromProperties("username"),property.readFromProperties("properties"));
	}
	@AfterMethod
	@AfterClass
	public void classTeardown() {
		home.signOutOfApp(web);
		excel.closeExcel();
	}

}