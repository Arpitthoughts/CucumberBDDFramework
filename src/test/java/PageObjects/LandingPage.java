package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LandingPage {
	WebDriver driver;	
By search=By.xpath("//input[@type='search']");
By product=By.cssSelector("h4.product-name");
By topDeals=By.linkText("Top Deals");


public LandingPage(WebDriver driver) {
	this.driver=driver;
}




public void searchItem(String item) {

driver.findElement(search).sendKeys(item);	
}


public String getItem() {
	return driver.findElement(product).getText();
	
}

public void invokeTopDeals() {

	driver.findElement(topDeals).click();	
	
}

public String getTitleLandingPage() {
return driver.getTitle();	
}

}
