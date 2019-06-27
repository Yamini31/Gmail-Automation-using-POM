import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Final {
 
	
	@Test
  public void f() throws InterruptedException {
		System.setProperty("webdriver.chrome.Driver", "/home/qainfotech/Downloads/chromedriver");
		 
		WebDriver driver = new ChromeDriver();
		 
		driver.manage().window().maximize();
		 
		driver.get("http:www.gmail.com");
		 
		System.out.println("********Login Page********");
		 
		POMPrac p = new POMPrac(driver);
		 
		POMPrac.setUserName();
		POMPrac.clickLogin();
		POMPrac.setPassword();
		POMPrac.clickLogin1();
		 
		System.out.println("********Home Page********");
		 
		POMPrac2 home = new  POMPrac2(driver);
		 
		home.clickOnFundamentals();
		 
		home.clickOnWorkingWithElements();
		 
		//Close the driver
		 
		driver.close();
  }
}
