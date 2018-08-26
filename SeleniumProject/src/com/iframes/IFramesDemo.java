package com.iframes;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.JavascriptExecutor;

import com.helper.BrowserFactory;

public class IFramesDemo {

	public static void main(String[] args) {
		
		WebDriver driver = BrowserFactory.browserOpen("chrome","file:///C:/Users/jyothsna%20kalpam/Documents/jyothsna/myframes.html");
        int frame_size = driver.findElements(By.tagName("iframe")).size(); 
        System.out.println("total number of frames"+frame_size);
       WebElement element = driver.findElement(By.cssSelector("iframe[title='selenium_news']"));
        driver.switchTo().frame(element);
        driver.findElement(By.id("close")).click();
        JavascriptExecutor je = (JavascriptExecutor)driver;
        WebElement element1 = driver.findElement(By.cssSelector("a[href='http://saucelabs.com']"));
        je.executeScript("arguments[0].scrollIntoView(true);",element1);
        System.out.println("the text is"+element1.getText());
        //driver.switchTo().defaultContent();
        //driver.findElement(By.xpath("//a[@href='http://www.learn-automation.com']")).click();
        
       
	}

}
