package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public WebDriver driver;
	//constructor
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
	//Identify all my WebElements using @FindBy anontation
	@FindBy(how = How.XPATH, using="//input[@id='vehicleReg']")
	 public static WebElement EnterRegBtn;
	
	
	@FindBy(how = How.XPATH, using="//span[contains(.,'Find vehicle')]")
	  public static WebElement FindVehicleLink;
	
	@FindBy(how = How.XPATH, using="//span[contains(text(),'09 FEB 2022 : 16 : 26')]")
	  public static WebElement Cover_startText;
	
	
	@FindBy(how = How.XPATH, using="//div[contains(text(),'Cover end:')]")
	  public static WebElement Cover_endTxt;
	
	public void type_into_EnterRegBtn(){
		EnterRegBtn.sendKeys("OV12UYY");	
  }
	@FindBy(how = How.XPATH, using="//input[@id='vehicleReg']")
	 public static WebElement EnterReg;

	@FindBy(how = How.CSS, using="#page-container > div.result")
	public static WebElement Sorry_record_not_foundTxt;
	
	//create methods to perform actions on WebElements 
	public void click_Find_Vehicle(){
		FindVehicleLink.click();
	}
	public void verify_cover_start_end_date(){
		  Cover_startText.getText();
		  
		}
	public void verify_cover_end_date(){
		  Cover_endTxt.getText();	
		}
	public void type_into_EnterReg(){
		EnterReg.sendKeys("ytruy");
		}
	 public void verify_Sorry_record_not_foundTxt(){
		 Sorry_record_not_foundTxt.getText();
		
		 
	
		}
	
}
