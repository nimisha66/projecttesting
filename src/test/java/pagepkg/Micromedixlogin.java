package pagepkg;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class Micromedixlogin {
	WebDriver driver;
	@FindBy(xpath="//input[@id='login.username_index_0']")
	WebElement username;
	@FindBy(xpath="//input[@id='login.password_index_0']")
	WebElement pass;
    @FindBy(xpath="//button[@id='Submit']")
    WebElement login;
    @FindBy(xpath="//a[@href='https://www.micromedexsolutions.com/carenotes/librarian']//button[@id='Submit']//span[@class='arrow-right']")
    WebElement arrow;
    @FindBy(xpath="//a[normalize-space()='Medication Titles']")
    WebElement Medicationtitle;
    @FindBy(xpath="//span[@class='smallerBlue']//following::select[1]")
    WebElement dropdown;
    @FindBy(xpath="//a[normalize-space()='P']")
    WebElement letterp;
    @FindBy(xpath="//a[normalize-space()='Penicillin G Potassium (Injection) (Injectable)']")
    WebElement medicine;
    @FindBy(xpath="//a[@id='lnkDocTypeDropdown']")
    WebElement dropdowncarenotes;
    @FindBy(xpath="//label[normalize-space()='Med Essential Fact S...']")
    WebElement checkbox;
    @FindBy(xpath="//input[@id='btnOK1']")
    WebElement clickok;
    @FindBy(xpath="//input[@id='checkBox_index_D14742']")
    WebElement clicklang;
    @FindBy(xpath="//body[1]/table[1]/tbody[1]/tr[3]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/form[1]/table[2]/tbody[1]/tr[1]/td[3]/input[1]")
    WebElement customize;
    @FindBy(xpath="//input[@id='patientName_index_0']")
    WebElement patientname;
    @FindBy(xpath="//input[@id='caregiverName_index_0']")
    WebElement caregivername ;
    @FindBy(xpath="//input[@id='checkbox_index_721']")
    WebElement checkboxheaders ;
    @FindBy(xpath="//select[@id='sbdocumentFontSize_index_0']")
    WebElement  dropdowndocument;
    @FindBy(xpath="//textarea[@id='docInstructions_index_4742_1_index_0']")
    WebElement  instructions;
    @FindBy(xpath="//input[@id='boldSpInst_index_0']")
    WebElement checkboxinstruction;
    @FindBy(xpath="//a[normalize-space()='MICROMEDEX GATEWAY']")
    WebElement micromedixgateway;
    @FindBy(xpath="//a[1]//button[1]")
    WebElement medemex;
    @FindBy(xpath="//input[@id='IntSearchWordWheel_SearchTerm_index_0']")
    WebElement search;
   @FindBy(xpath="//a[normalize-space()='In-Depth Answers']")
   WebElement depth;
   @FindBy(xpath="//*[@id=\"tbOpt_DC\"]")
   WebElement drugcompare;
   @FindBy(xpath="//div[@class='itemSelected']")
   WebElement hydrocart;
   @FindBy(xpath="//div[@title='A-Methapred.']")
   WebElement metha;
   @FindBy(xpath="//div[@title='A1PI.']")
   WebElement aipi;
   @FindBy(xpath="//input[@dojoattachpoint='btnSubmitDefault']")
   WebElement submit;
   @FindBy(xpath="//img[@dojoattachpoint='btnAdd']")
   WebElement adding;
   @FindBy(xpath="//select[@id='docRightSelector_index_0']")
   WebElement dropdownmedicine;
   @FindBy(xpath="//span[normalize-space()='Update']")
   WebElement update;
   @FindBy(id="calcToolLink")
   WebElement calculator;
    @FindBy(xpath="//a[normalize-space()='R']")
    WebElement alphaR;
    @FindBy(xpath="//*[@id=\"liWrapperR\"]/div/dl/dd[2]/a")
    WebElement renal;
    @FindBy(xpath="//input[@name='Age_param']")
    WebElement age;
    @FindBy(xpath="//input[@id='togel2']")
    WebElement male;
    @FindBy(xpath="//input[@name='Creatinine_param']")
    WebElement creatinine;
    @FindBy(xpath="//input[@id='togel3']")
    WebElement smoking;
    @FindBy(xpath="//input[@id='togel6']")
    WebElement atheroscleoris;
    @FindBy(xpath="//input[@id='togel8']")
    WebElement htn;
    @FindBy(xpath="//input[@id='togel10']")
    WebElement obese;
    @FindBy(xpath="//input[@id='togel11']")
    WebElement abdominal;
    @FindBy(xpath="//input[@id='togel13']")
    WebElement cholesterol;
    @FindBy(xpath="//span[@class='backBtnSpan']")
    WebElement backlink;
   @FindBy(xpath="//div[@id='tbOpt_Home']")
    WebElement home;
     @FindBy(xpath="//a[@id='gatewayLink']")
    WebElement gateway;
    @FindBy(xpath="//a[@href='https://www.micromedexsolutions.com/carenotesadmin/librarian']//button[@id='Submit']")
    WebElement carenotesad;
    @FindBy(xpath="//body[1]/table[1]/tbody[1]/tr[5]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/form[1]/table[3]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[1]")
    WebElement checkbox1;
    @FindBy(xpath="//body[1]/table[1]/tbody[1]/tr[5]/td[1]/table[2]/tbody[1]/tr[1]/td[1]/form[1]/table[3]/tbody[1]/tr[4]/td[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]")
    WebElement radiobutton;
    @FindBy(xpath="//input[@id='loc_checkbox_index_2']")
    WebElement checkbox2;
    @FindBy(xpath="//input[@id='loc_checkbox_index_3']")
    WebElement checkbox3;
    @FindBy(xpath="//input[@id='PFFormActionId_shielded.carenotesadmin.DeleteLocations']")
    WebElement delete;
    @FindBy(xpath="//img[@title='My MICROMEDEX Gateway']")
    WebElement mygateway;
    @FindBy(xpath="//a[@href='https://www.micromedexsolutions.com/formulary/librarian']//button[@id='Submit']")
    WebElement formulary;
    @FindBy(xpath="//*[@id=\"WordWheel_SearchTerm_index_0\"]")
    WebElement  medicinesearch;   
    @FindBy(xpath="//*[@id=\"WordWheel_list\"]/div[1]/span[2]")
    WebElement  azitromycin;   
    @FindBy(xpath="/html/body/table/tbody/tr[2]/td[1]/table/tbody/tr/td[6]/a/img")
    WebElement pharmacyinfo;
    @FindBy(xpath="//*[@id=\"formularyHome\"]")
    WebElement backtohome;
    @FindBy(xpath="/html/body/table[1]/tbody/tr[1]/td[2]/a[2]/img")
    WebElement logout;
    
	public Micromedixlogin(WebDriver driver2) {
		 this.driver=driver2;
		 PageFactory.initElements(driver,this);
    }
    public void loginbtn()
    {
  	  login.click();
    }
    public void setvalues(String UserName,String pwd)
    {
    	username.clear();
  	    username.sendKeys(UserName);
  	    pass.clear();
  	    pass.sendKeys(pwd);
    }
   public void carenotespage() throws InterruptedException
   {
	   arrow.click();
//	   dropdown.click();
	   Medicationtitle.click();
	   Thread.sleep(1000);
	   Select dropdownclick=new Select(dropdown);
	   dropdownclick.selectByIndex(1);
	   letterp.click();
	   medicine.click();
	   dropdowncarenotes.click();
	   checkbox.click();
	   clickok.click();
	   clicklang.click();
	   customize.click();
	   patientname.click();
	   patientname.sendKeys("Nimisha n");
	   caregivername.click();
	   caregivername.sendKeys("sreelakshmi");
	   checkboxheaders.click();
	   dropdowndocument.click();
	   Select dropdown=new Select(dropdowndocument);
	   dropdown.selectByValue("Smaller");
	   instructions.sendKeys(" Penicillin G Potassium for Injection is an antibiotic used to treat severe infections");
	   micromedixgateway.click();
   }

   public void micromedexpage() throws InterruptedException, AWTException
   {
	 medemex.click();
	 search.clear();
	 search.click();
	 Thread.sleep(1000);
	 search.sendKeys("paracetamol");
	 Robot robot=new Robot();
     robot.delay(2000);
	 robot.keyPress(KeyEvent.VK_ENTER);
	 robot.keyRelease(KeyEvent.VK_ENTER);
	 depth.click();
	 drugcompare.click();
	 hydrocart.click();
	 adding.click();
	 metha.click();
	 adding.click();
	 aipi.click();
	 adding.click();
	 submit.click();
	 dropdownmedicine.click();
	 Thread.sleep(1000);
	 Select dropdownmedi=new Select(dropdownmedicine);
	 dropdownmedi.selectByValue("A-Methapred;372800");
	 update.click();
	 calculator.click();
	 alphaR.click();
	 renal.click();
	 age.click();
	 age.clear();
	 age.sendKeys("25");
	 male.click();
	 creatinine.click();
	 creatinine.sendKeys("250");
	 smoking.click();
	 atheroscleoris.click();
	 htn.click();
	 obese.click();
	 abdominal.click();
	 cholesterol.click();
	 backlink.click();
	 home.click();
	 gateway.click();
   }
   public void carenotesadminipage()
   {
	 carenotesad.click();
	 checkbox1.click();
	 radiobutton.click();
	 checkbox2.click();
	 checkbox3.click();
	 delete.click();
	 Alert a=driver.switchTo().alert();
	 String alerttext=a.getText();
	 System.out.println("Are you sure you want to delete all checked items?="+alerttext);
	 a.accept();
	 mygateway.click();
   }
   public void formularypage() throws InterruptedException
   {
	   formulary.click();
	   medicinesearch.click();
	   medicinesearch.clear();
	   Thread.sleep(2000);
	   medicinesearch.sendKeys("Azithromycin");
	   azitromycin.click();
	   pharmacyinfo.click();
	   JavascriptExecutor js = (JavascriptExecutor) driver;
	   js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	   backtohome.click();
	   logout.click();
	    }

	    
   
   
}
