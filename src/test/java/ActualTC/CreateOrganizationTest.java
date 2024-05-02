package ActualTC;



import org.testng.Assert;
import org.testng.annotations.Test;

import VTigers.HomePage;
import VTigers.OrganasationInfPage;
import VTigers.OrganasationNewPage;
import VTigers.OrganasationPage;
import Vtiger_GenericUtility.BaseClass;


public class CreateOrganizationTest extends BaseClass {
@Test
public void createorg() {
	//click On orgmodule
	HomePage hp=new HomePage(driver);
	hp.clickOnOrganizationsLnk();
	//click on lookup image
	OrganasationPage op=new OrganasationPage(driver);
	op.orgLookUpImg();
	//give org name
	OrganasationNewPage onp=new OrganasationNewPage(driver);
	onp.createNewOrganization("Capgemini"+ju.getRandomNum());
	//get the header and verify
	OrganasationInfPage oip=new OrganasationInfPage(driver);
	String header=oip.getHeader();
	//verify
	Assert.assertTrue(header.contains("Capgemini"));
	System.out.println("===ORGANIZATION IS CREATED AND TC IS PASS===");
	System.out.println("SINGER MOULI);
}
}
