package com.pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginNew {
	
	static WebDriver driver;
	
	public LoginNew(WebDriver driver){
		this.driver = driver;
	}
	
	@FindBy(id="email") WebElement emailID;
	@FindBy(how =How.ID,using="pass") WebElement password;
	@FindBy(how=How.ID,using="loginbutton") WebElement Login_Button;
	
	public void facebook_Login() {
		 	emailID.sendKeys("jyothsna.kalpam@gmail.com");
		 	password.sendKeys("9030284325");
		 	Login_Button.click();
	}
	
}
