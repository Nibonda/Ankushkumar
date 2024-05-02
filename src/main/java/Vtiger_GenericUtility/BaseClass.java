package Vtiger_GenericUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import VTigers.HomePage;
import VTigers.LoginPage;

public class BaseClass {
 public PropertyFileUtility pu=new PropertyFileUtility();
 public ExcelFileUtility eu=new ExcelFileUtility();
 public WebDriverUtility wu=new WebDriverUtility();
 public JavaUtility ju=new JavaUtility();
 public WebDriver driver=null;
 //returntime polimorphism
 
 @BeforeSuite
 public void bsconfig() {
	System.out.println("===DB CONNECTION==="); 
	
 }
 @AfterSuite
 public void asconfig() {
	 System.out.println("===DB DISCONNECTION===");
 }
 @BeforeClass
 public void bcconfig() throws Throwable {
	 String BROWSER = pu.readDataFromPropertyFile("browser");
	 String URL = pu.readDataFromPropertyFile("url");
	 if(BROWSER.equalsIgnoreCase("Edge")) {
		driver= new EdgeDriver();
		System.out.println("===Edgedriver is Launched===");
	 }
	 else if(BROWSER.equalsIgnoreCase("chrome")) {
		 driver=new ChromeDriver();
		 System.out.println("===Chrome is Launched===");
	 }
	 else {
		 System.out.println("===INVALID BROSWER NAME===");
	 }
	 wu.maximizeBrowserwindow(driver);
	 wu.WaitForPageLoad(driver);
	 driver.get(URL);
	 System.out.println("===BROWSER IS OPENED===");
	 wu.getScreenshot(driver,"Login");
 }
 @AfterClass
 public void tearDown() {
	 driver.quit();
	 System.out.println("===BROWSER IS CLOSED===");
 }
 @BeforeMethod
 public void bmconfig() throws Throwable {
	 String UN=pu.readDataFromPropertyFile("un");
	 String PWD=pu.readDataFromPropertyFile("pwd");
	 LoginPage lp= new LoginPage(driver);
	 lp.loginToApp(UN, PWD);
	 System.out.println("===LOGIN IS DONE SUCCESSFULy===");
	 wu.getScreenshot(driver, "Homepage");
 }
 @AfterMethod
 public void amconfig() {
	 HomePage hp= new HomePage(driver);
	 hp.logoutfromApp(driver);
	 System.out.println("===LOGOUT IS DONE SUCCESSFULY===");
 }
}
 