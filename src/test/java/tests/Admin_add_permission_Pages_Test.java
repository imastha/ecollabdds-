package tests;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import eCollabDDSPages.Admin_Add_Permission;
import eCollabDDSPages.Admin_HospitalUsers_Pages;

public class Admin_add_permission_Pages_Test extends TestBase {
	
	 @Test(priority = 54, enabled = true)
	public void Admin_add_permission_Pages_Test() {
		SoftAssert Assert = new SoftAssert();
		Admin_Add_Permission appages = new Admin_Add_Permission(driver);
		try {
			appages.Open_Add_Permission(Assert);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Assert.assertAll();
	}
	
    @Test(priority = 55, enabled = true)
    public void select_client_application() {
	SoftAssert Assert = new SoftAssert();
	Admin_HospitalUsers_Pages appages =new Admin_HospitalUsers_Pages(driver);
	appages.open_HosUsers_Tests(Assert);
	Assert.assertAll();
}
	}
