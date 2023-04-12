package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.WebTestBase;
import Utils.Utility;

public class MyAccountPage extends WebTestBase {
	

	 @FindBy(xpath="//h1[@class='learntocodeh1']")
	 WebElement codeTitle;
	
	 @ FindBy(id="navbtn_tutorials")
     WebElement TutorialTab;
	
	

	 
	
	 @FindBy(id="navbtn_references")
     WebElement hover;
    		          
    		          
     @FindBy(xpath="//a[@class='w3-bar-item w3-button w3-hover-white w3-xlarge w3-round w3-right topnav-some']")
     WebElement instagramOption;
     
     
    
     
     @FindBy(id="search2")
     WebElement checktextclick;
     
     
    
     
     public MyAccountPage(){
    	 PageFactory.initElements(driver, this);
     }
     
  
     public String getTextOFMYAccountPage(){
    	 return codeTitle.getText();
    }
     

     
     
    
     
     public void conTextClick() {
    	 Utility.conTextClick(driver,checktextclick);
    	 checktextclick.click();
     }
     
     public void mouseHover(){
	   Utility.mouseHover(driver,hover);
	   hover.click();
	   }

     public void scrollDownMethod() {
       Utility.scrollDownByElement(driver, instagramOption);
       instagramOption.click();
       }



      public void windowHandle(){
        Utility.scrollDownByElement(driver,instagramOption);
        instagramOption.click();
        Utility.switchToWindows(driver);
     }


     public void getCookiesHandle(){
    	 Utility.getCookies();
      }

}



