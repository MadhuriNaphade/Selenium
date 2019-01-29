package test.selenium.demo.test.selenium.demo;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;
import TestFactory.FactoryClass;


public class TestSeleniumCase1 extends FactoryClass 
{
	
    @Test 
    @Parameters({"memail"})
    public void NewsLetterWrongdata(String memail)
    {
    	driver.findElement(By.xpath("//a[@title='Contact Us']")).click();
    	scrolldown();
    	driver.findElement(By.xpath("//input[@id='newsletter-input']"));
    	driver.findElement(By.xpath("//input[@id='newsletter-input']")).sendKeys(memail);
    	driver.findElement(By.xpath("//button[@name='submitNewsletter']")).click();
    	scrollup();
    	String ErrorMSG=driver.findElement(By.xpath("//p[@class='alert alert-danger']")).getText();
    	System.out.println(ErrorMSG);
    	closebrowser();
    }
   
}
