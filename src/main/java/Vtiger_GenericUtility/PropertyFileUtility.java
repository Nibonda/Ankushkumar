package Vtiger_GenericUtility;

import java.io.FileInputStream;

import java.util.Properties;

public class PropertyFileUtility {
public String readDataFromPropertyFile(String key) throws Throwable {
	FileInputStream fisp=new FileInputStream("C:\\Users\\khasi\\OneDrive\\Desktop\\java programings\\HybridFrameWork\\src\\test\\resources\\VTigers.properties");
	Properties p=new Properties();
	p.load(fisp);
	return p.getProperty(key);
	
}
}
