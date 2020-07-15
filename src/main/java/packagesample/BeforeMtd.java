package packagesample;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class BeforeMtd {
  static WebDriver driver;
  
  @BeforeMethod
  public void invokeApplication() {
	  System.setProperty("webdriver.chrome.driver", "./drivers/added/chromedriver.exe");
	  driver = new ChromeDriver();
	  driver.get("http://automationpractice.com/index.php");
	  driver.manage().window().maximize();
//	  driver.findElement(By.xpath("//a[text()=' My Account                  ']")).click();
//	  driver.findElement(By.linkText("Login")).click();
//	  driver.findElement(By.name("username")).sendKeys("user@phptravels.com");
//	  driver.findElement(By.name("password")).sendKeys("demouser");
//	  driver.findElement(By.xpath("//button[text()='Login']")).click();
	  
	  
  }

}
