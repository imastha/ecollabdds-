package eCollabDDSPages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class Admin_Add_Permission {
	WebDriver driver;

	public Admin_Add_Permission(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
		
	
	@FindBy(xpath = "//div[@class='card bg-info text-white h-100 clickPerm']//div[@id='cardbgclient']")
	private WebElement cardbgclient;
	
	@FindBy(xpath = "///body/div/div/form[@name='addupdateform']/div/div/div[1]/div[2]/div[1]/b[1]")
	private WebElement dropdowntitle;
	
	@FindBy(xpath = "(//select[@id='permissionstype']")
	private WebElement selectpermission;
		
//select client application
	
	@FindBy(id = "(permissionstype]")
	private WebElement clientapplication ;
	
	@FindBy(xpath = "(//select[@id='confclientId']]")
	private WebElement clientapplicationdropdown ;
	
	@FindBy(xpath = "(//span[@id='spanselectedstates']")
	private WebElement state_ddown ;
	
	@FindBy(xpath = "(//input[@id='chkstate18']")
	private WebElement selectstate ;
	
	@FindBy(xpath = "(//input[@id='chkhospital181']")
	private WebElement hospital ;
	
	@FindBy(xpath = "(//body[1]/div[1]/div[1]/form[1]/div[3]/div[6]/div[1]/div[3]/div[5]/div[1]/b[1]")
	private WebElement Remark ;
	
	@FindBy(xpath = "(//button[@id='client-permission-save']//i[@class='fa fa-save']")
	private WebElement saveclientapplicationbutton ;
	
	@FindBy(xpath = "(//button[@id='msgclose']")
	private WebElement popupbutton ;
	
// select hospital
	
	@FindBy(xpath = "(//select[@id='permissionstype']")
	private WebElement selecthospital ;
	
	@FindBy(xpath = "(//option[normalize-space()='CDERENDUSER, PHC, Rajasthan']")
	private WebElement EndUserHospital ;
	
	@FindBy(xpath = "//label[normalize-space()='Delhi']")
	private WebElement State ;
	
	@FindBy(xpath = "//body//div//div//div//div[2]//div[2]//label[1]")
	private WebElement Hospitals ;
	
	@FindBy(xpath = "//textarea[@id='enduserhospitalToHospitalRemarks']")
	private WebElement Remarks ;
	
	@FindBy(xpath = "//button[@id='hospital-permission-save']//i[@class='fa fa-save']")
	private WebElement savehospitalpermissionbutton ;
	
	@FindBy(xpath = "//button[@id='msgclose']")
	private WebElement popupclosebutton ;
	
	
	public void Open_Add_Permission(SoftAssert Assert) throws InterruptedException {
		Thread.sleep(7000);
		cardbgclient.click();
		Assert.assertEquals(dropdowntitle.getText(), "Permission Type", "Permission Type");
		selectpermission.click();
		Thread.sleep(6000);
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
	}
		
		public void Client_application(SoftAssert Assert) throws InterruptedException {
			Thread.sleep(10000);
			clientapplication.click();
			Select s = new Select(SelectOrg_ddown);
			s.selectByIndex(1);
			
			
		}
		
		public void Client_application_details(SoftAssert Assert) throws InterruptedException {
			Thread.sleep(10000);
			Assert.assertEquals(clientapplication.getAttribute("id"), "permissionstype",
					"Failed: Add_Client_Organization, Add button should not highlighted. ,");
			
			selectstate.click();
			
		
		
		
	}
	
	
	
	
	
	}


