package com.handleWindows;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;

import com.helper.BrowserFactory;

public class HandlingWindows {
	
	public static void main(String args[])
	{
	
	WebDriver driver = BrowserFactory.browserOpen("Chrome", "https://www.google.com");
	WebDriver driver1 = BrowserFactory.browserOpen("Chrome", "https://www.facebook.com/");
	WebDriver driver2 = BrowserFactory.browserOpen("Chrome", "https://www.naukri.com/");
	Set<String> allWindows = driver2.getWindowHandles();
	ArrayList<String> tabs = new ArrayList<>(allWindows);
	driver2.switchTo().window(tabs.get(2));
	driver2.close();
	driver2.switchTo().window(tabs.get(1));
	driver2.close();
	driver2.switchTo().window(tabs.get(0));
	System.out.println("Parent tttle is"+driver2.getTitle());
	
	}
	
}
