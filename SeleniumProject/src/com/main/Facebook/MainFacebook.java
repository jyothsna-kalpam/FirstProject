package com.main.Facebook;
import com.helper.BrowserFactory;
import com.pagefactory.LoginNew;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainFacebook {
	
public static void main(String args[]){

	WebDriver driver;	
	
	driver = BrowserFactory.browserOpen("chrome","https://www.facebook.com");
	LoginNew login_new = PageFactory.initElements(driver, LoginNew.class);
	login_new.facebook_Login();
	//driver.close();
	}

}
