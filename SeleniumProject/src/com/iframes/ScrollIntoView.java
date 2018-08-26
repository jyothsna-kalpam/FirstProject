package com.iframes;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.helper.BrowserFactory;

public class ScrollIntoView {

	public static void main(String[] args) {
			
		WebDriver driver = BrowserFactory.browserOpen("chrome","file:///C:/Users/jyothsna%20kalpam/Documents/jyothsna/myframes.html");
		driver.get("http://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		JavascriptExecutor je = (JavascriptExecutor) driver;
		WebElement element = driver.findElement(By.xpath(".//*[@id='mCSB_3_container']/p[3]"));
		je.executeScript("arguments[0].scrollIntoView(true);",element);
		System.out.println(element.getText());

		

	}

}
