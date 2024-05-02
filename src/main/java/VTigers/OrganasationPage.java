package VTigers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Vtiger_GenericUtility.WebDriverUtility;

public class OrganasationPage extends WebDriverUtility {
	
	//Declaration
		@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement orgLookUpImg;
	//Initialization
		public OrganasationPage(WebDriver driver) {
			PageFactory.initElements(driver,this);
		//Getters
			
	}
		public WebElement getOrgLookUpImg() {
			return orgLookUpImg;
		}
		//Business Library
		public void orgLookUpImg() {
			orgLookUpImg.click();
		}
	}

