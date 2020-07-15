package packagesample;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FetchBestSellers extends BeforeMtd{
	@Test
	public void fetchListOfBestSellers() {
		driver.findElement(By.linkText("Best sellers")).click();
		WebElement ProductList = driver.findElement(By.xpath("//ul[@class='product_list grid row']"));
		List<WebElement> findElements = driver.findElements(By.tagName("img"));
		for(int i=0;i<findElements.size();i++) {
			System.out.println(findElements.get(i).getAttribute("title"));
		}
	}
}
