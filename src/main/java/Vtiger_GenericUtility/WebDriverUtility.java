package Vtiger_GenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverUtility {
public void maximizeBrowserwindow(WebDriver driver) {
	driver.manage().window().maximize();
}
public void minimizeBrowserwindow(WebDriver driver) {
	driver.manage().window().minimize();
}
	public  void WaitForPageLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
	//Select Class
	public void handleDropDown(WebElement element,int index) {
		Select s= new Select(element);
		s.selectByIndex(index);
	}
	public void handleDropDown(WebElement element,String Value) {
		Select s= new Select(element);
		s.selectByValue(Value);
	}
	public void handleDropDown(String Visibletext, WebElement element) {
		Select s= new Select(element);
		s.selectByVisibleText(Visibletext);
	}
	
	//Action Class
	public void mouseovertoele(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.moveToElement(element).perform();
		}
	public void rightClick(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.contextClick(element).perform();
		}
	public void doubleClick(WebDriver driver,WebElement element) {
		Actions a=new Actions(driver);
		a.doubleClick(element).perform();
		}
	public void dragAndDrop(WebDriver driver,WebElement sreelement,WebElement destelement) {
		Actions a=new Actions(driver);
		a.dragAndDrop(sreelement,destelement).perform();
		}
	//Screen Shot
	public void getScreenshot(WebDriver driver,String sname) {
		TakesScreenshot ts=(TakesScreenshot)driver;
		File sre=ts.getScreenshotAs(OutputType.FILE);
		File dest= new File("C:\\Users\\khasi\\OneDrive\\Desktop\\java programings\\HybridFrameWork\\Screenshot\\"+sname+".png");
		try {
		Files.copy(sre, dest);	
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}


