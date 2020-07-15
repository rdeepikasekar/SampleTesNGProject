package packagesample;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class BuyWomenTShirt extends BeforeMtd{
	@Test
	public void buyTShirt() {
		driver.findElement(By.xpath("//a[text()='Women']")).click();
		WebElement ProductList = driver.findElement(By.xpath("//ul[@class='product_list grid row']"));
		List<WebElement> findElements = ProductList.findElements(By.tagName("li"));
		
		Actions builder = new Actions(driver);
		builder.moveToElement(findElements.get(0)).build().perform();
		
		driver.findElement(By.xpath("//span[text()='Add to cart']")).click();
		driver.findElement(By.linkText("Proceed to checkout")).click();
		
		
		
	}
}
