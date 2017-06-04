package project.gittigidiyor;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	WebDriver driver;
	
	//First Way
	
	@FindBy(xpath="//*[@id='search_word']")
	WebElement searcBbox;
	
	@FindBy(xpath="//*[@id='header_find_button']")
	WebElement searchButton;
	
	public SearchPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void searchProduct(String searchWord){
		
		searcBbox.sendKeys(searchWord);
	}
	
	public void tabSearchButton(){
		searchButton.click();
	}
	
	//close popup
	public static WebElement clossPopup(WebDriver driver){
    	element=driver.findElement(By.xpath(Paths.StartPopup.getPath()));
    	return element;
    }
	
	
	
	///// Second way
	
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
