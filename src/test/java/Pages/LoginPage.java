package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import TestBase.WebTestBase;

	public class LoginPage extends WebTestBase{	
		
		 @FindBy(id = "modalusername")
		    WebElement emailTextBox;

		    @FindBy(id = "current-password")
		    WebElement passwordTextBox;

		    @FindBy(xpath="//button[@class='Button_button__URNp+ Button_primary__d2Jt3 Button_fullwidth__0HLEu']")
		    WebElement loginbtn;
		    @ FindBy(xpath="//div[@class='_6S9iN _WHF4f']")
		    WebElement courseTextBox;
	   
		    
		    public LoginPage(){
		        PageFactory.initElements(driver, this);
		    }
	//sending the email and passwrord to the login
		    public void login(String email, String password){
		        emailTextBox.sendKeys(email);
		        passwordTextBox.sendKeys(password);
		        loginbtn.click();
		      
		        
		        
		    }
			
	}


