package TestFactory;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class FactoryClass 
{
	public static final String ProjectFolder=System.getProperty("user.dir");	
	   public static  WebDriver driver;
        @BeforeTest
	    public void OpenBrowser()
	    {
	    	System.out.println("==============================Opening Browser==============================");
			System.setProperty("webdriver.chrome.driver", ProjectFolder + "/ChromeDriverPath/chromedriver.exe");
			driver = new ChromeDriver();
	    }
        @BeforeTest
	    public void navigateURL()
	    {
	    	driver.get("http://automationpractice.com/index.php");
	    }
        public void scrollup()
        {
        	System.out.println("Scrolling Up");
        	((JavascriptExecutor) driver).executeScript("scroll(0,0);");
        }
        public void scrolldown()
        {
        	System.out.println("Scrolling down");
        	((JavascriptExecutor) driver).executeScript("scroll(0,250);");
        }
        public void closebrowser()
        {
        	driver.quit();
        }
}
