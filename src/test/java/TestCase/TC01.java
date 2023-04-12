package TestCase;

import org.openqa.selenium.WebDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import Pages.HomePage;

import Pages.LoginPage;
import Pages.MyAccountPage;
import TestBase.WebTestBase;

public class TC01 extends WebTestBase{
	WebDriver driver;
	MyAccountPage myAccountPage;
	HomePage homePage;
	LoginPage loginPage;
	
	
	public TC01() {
		super();
	}
	
	@BeforeMethod
	public void beforeMethod() {
		initialization();
		homePage = new HomePage();
		loginPage = new LoginPage();
		myAccountPage=new MyAccountPage();
		
	}

		
	@Test
	public void verifyLoginWithValidCredential() {
		SoftAssert softAssert =new SoftAssert();
		homePage.userSearchClick();
		loginPage.login(prop.getProperty("email"), prop.getProperty("password"));
		softAssert.assertAll();
	}
	
	
	
	
	
	@Test
	public void verifyMouseHover() {
		SoftAssert softAssert =new SoftAssert();
		myAccountPage.mouseHover();
		softAssert.assertAll();
	}
	
	@Test
	public void verifyCheckTextClick() {
		SoftAssert softAssert =new SoftAssert();
		myAccountPage.conTextClick();
		softAssert.assertAll();
	}
	
	@Test
	public void verifyScrollDown() {
		SoftAssert softAssert =new SoftAssert();
		myAccountPage.scrollDownMethod();
		softAssert.assertAll();
	}
	
	@Test
    public void verifyGetWindowHandle(){
        SoftAssert softAssert = new SoftAssert();
        myAccountPage.windowHandle();
        softAssert.assertAll();
    }
	
	
	@Test
    public void verifyCookiesHandle(){
        SoftAssert softAssert = new SoftAssert();
        myAccountPage.getCookiesHandle();
        softAssert.assertAll();
    }
	
}
	


	