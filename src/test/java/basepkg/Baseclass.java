package basepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class Baseclass {
	protected WebDriver driver;
	   @BeforeTest
	   public void setup()
	   {
		   driver=new ChromeDriver();
		  driver.get("https://www.micromedexsolutions.com/home/dispatch");
		  driver.manage().window().maximize();
	   }
      @AfterTest
      public void close()
	   {
		  driver.quit(); 
	   }
	   
}
