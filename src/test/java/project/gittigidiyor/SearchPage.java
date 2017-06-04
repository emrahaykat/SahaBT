package project.gittigidiyor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SearchPage {
	WebDriver driver;
	//close popup
	public static WebElement closePopup(WebDriver driver){
    	element=driver.findElement(By.xpath(Paths.StartPopup.getPath()));
    	return element;	
	}
	public static WebElement element=null;
	
	public static WebElement getSearchBox(WebDriver driver,String searchKey){
		element=driver.findElement(By.xpath(Paths.SearchBox.getPath()));
		element.sendKeys(searchKey);
		return element;
	}
	
	public static WebElement tabSearchButton(WebDriver driver) {
		element = driver.findElement(By.xpath(Paths.SearchButton.getPath()));
		return element;
	}
	
	
}
