package testpkg;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Micromedixlogin;
import utilitymicro.Microutility;


@SuppressWarnings("unused")
public class Micromedixtest extends Baseclass {
	
@Test
	public void saucedemo() throws Exception

	{
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	            Micromedixlogin ob =new Micromedixlogin(driver);
	            String xl ="C:\\Users\\DELL\\OneDrive\\Documents\\projecthm.xlsx";
	            String Sheet = "Sheet1";
	            int rowCount = Microutility.getRowcount(xl, Sheet);
              
	            for (int i=1;i<=rowCount;i++)
	            	
	            {
                    String UserName=Microutility.getCellValue(xl, Sheet, i, 0);
                    System.out.println("username---"+UserName);
                    String Pwd=Microutility.getCellValue(xl,Sheet, i, 1);
                     System.out.println("password---"+Pwd);
                     ob.setvalues(UserName, Pwd);
                     ob.loginbtn(); 
                    String expectedurl="https://www.micromedexsolutions.com/home/dispatch/CS/871AE8/PFActionId/pf.HomePage";
      			    String actualurl= driver.getCurrentUrl();
      			  
      			     if(actualurl.equals(expectedurl))
      			     {
      			    	System.out.println("pass");
      			     }
      			     else
      			     {
      			    	System.out.println("fail");
      			     }
      			   Thread.sleep(2000);
	            }
	            ob.carenotespage();
	            ob.micromedexpage();
	            ob.carenotesadminipage();
	            ob.formularypage();


	     }
}
