package test.selenium.demo.test.selenium.demo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import TestFactory.FactoryClass;

public class TestSeleniumCase2 extends FactoryClass {
	 WebDriver driver;
	
	    @Test 
	    @Parameters("memail")
	    public void NewsLetterCorrectData(String memail)
	    {
	    	driver.findElement(By.xpath("//a[@title='Contact Us']")).click();
	    	scrolldown();
	    	driver.findElement(By.xpath("//input[@id='newsletter-input']"));
	    	driver.findElement(By.xpath("//input[@id='newsletter-input']")).sendKeys(memail);
	    	driver.findElement(By.xpath("//button[@name='submitNewsletter']"));
	    	scrollup();
	    	String SuccessMsg=driver.findElement(By.xpath("//p[@class='alert alert-danger']")).getText();
	    	System.out.println(SuccessMsg);
	    	closebrowser();
	    }
	    
}
