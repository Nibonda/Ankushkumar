package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A {
 @FindBy(xpath = "//img[@class='inventory_details_img']")private WebElement Selectbtn0;
 @FindBy(xpath = "//img[@class='inventory_details_img']")private WebElement Selectbtn1;
  @FindBy(xpath = "//img[@class='inventory_details_img']")private WebElement Selectbtn2;
  @FindBy(xpath = "//img[@class='inventory_details_img']")private WebElement Selecctbtn3;
  @FindBy(xpath = "//img[@class='inventory_details_img']")private WebElement Selection4;
  @FindBy(xpath = "//img[@class='inventory_details_img']")private WebElement Selection5;
  public void LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
public WebElement getSelectbtn0() {
	return Selectbtn0;
}
public WebElement getSelectbtn1() {
	return Selectbtn1;
}
public WebElement getSelectbtn2() {
	return Selectbtn2;
}
public WebElement getSelecctbtn3() {
	return Selecctbtn3;
}
public WebElement getSelection4() {
	return Selection4;
}
public WebElement getSelection5() {
	return Selection5;
}
	}


