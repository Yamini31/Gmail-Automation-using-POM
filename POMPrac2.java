import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMPrac2 {

	 WebDriver driv;
	 
	By sendbtn = By.xpath("//a[text()='Sent']");
	 
	By impbtn = By.xpath("//a[text()='Important']");
	 
	public POMPrac2(WebDriver mainDriver){
	 
	  this.driv = mainDriver;
	 
	}
	 
	public void clickOnFundamentals(){
	 
	driv.findElement(sendbtn).click();
	 
	}
	 
	public void clickOnWorkingWithElements(){
	 
	driv.findElement(impbtn).click();
	 
	}

	
	
}
