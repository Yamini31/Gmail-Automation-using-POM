import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class POMPrac {

		 static WebDriver driver;
		
		 static By user = By.xpath("//*[@id=\"identifierId\"]");
		 
		 static By btn = By.xpath("//*[@id=\"identifierNext\"]/span/span");
		  
		 static By pass = By.xpath("//input[@class='whsOnd zHQkBf']");
		 
		 static By btn2 = By.cssSelector("#passwordNext > span");
		 
		 
		 public POMPrac(WebDriver driver) throws InterruptedException {
			 POMPrac.driver=driver;
		 }
		 
		 
		 public static void setUserName(){

		        driver.findElement(user).sendKeys("yaminigupta31397");
		    }
		 
		 
		 
		 
		 public static void clickLogin() throws InterruptedException{

	            driver.findElement(btn).click();
	            Thread.sleep(2000);

	    }

		 
		 public static void setPassword(){

	         driver.findElement(pass).sendKeys("yaminigupta");

	    }
		 
		 
		 
		 public static void clickLogin1() throws InterruptedException{

	            driver.findElement(btn2).click();
	            Thread.sleep(5000);

	    }
}
