package com.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	
	static WebDriver driver ;
	public static WebDriver browserOpen(String browserName,String URL){
		
	
		if(browserName.equalsIgnoreCase("firefox")){
			driver = new FirefoxDriver();
		}
		
		if(browserName.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","C:\\Users\\jyothsna kalpam\\Documents\\jyothsna\\tools\\Libraries\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		
	}
		if(browserName.equalsIgnoreCase("IE")){
			driver = new InternetExplorerDriver();

}
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		return driver;
		
}		
}