package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.WebTestBase;

public class HomePage extends WebTestBase{
	@FindBy(id="w3loginbtn")
	WebElement usersearch;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	public void userSearchClick() {
		usersearch.click();
	}

}
