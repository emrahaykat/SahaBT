package project.gittigidiyor;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserAction {
	private WebDriver driver;
	private String baseUrl;
	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "\\gittigidiyor\\resources\\chromedriver.exe");
		driver=new ChromeDriver();
		baseUrl="http://www.gittigidiyor.com/";
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void Login() throws InterruptedException{
		
		driver.get(baseUrl);
		Register.closePopup(driver).click();
		Thread.sleep(2500);
		Register.clickLoginLink(driver).click();
		Register.getLoginEmail(driver, "emrahaykat@gmail.com");
		Register.getLoginPassword(driver, "emrah123");
		Thread.sleep(1000);
		Register.submitLoginForm(driver).click();
		Assert.assertEquals("GittiGidiyor'a Hoşgeldiniz!", driver.getTitle());
		System.out.println("Login success");
		
	}
	
	@Test
	public void Register() throws InterruptedException{
		driver.get(baseUrl);
		Register.closePopup(driver).click();
		Thread.sleep(1000);
		Register.getSignupLink(driver).click();
		Register.Username(driver, "Emrah");
		Register.UserSurname(driver, "Aykat");
		Register.UserEmail(driver, "beta@test.com");
		Register.Nickname(driver, "TTester");
		Thread.sleep(1000);
		Register.selectNickName(driver).click();
		Register.Password(driver, "123456ab");
		Thread.sleep(1000);
		Register.PasswordAgain(driver, "123456ab");
		Register.GsmCode(driver, "530");
		Register.PhoneNumber(driver, "0359882");
		Register.SubmitForm(driver).click();
		Thread.sleep(10000);
		Assert.assertEquals("Üyelik işlemini tamamlamanız için size bir e-posta gönderdik",Register.verifyRegistrationPage(driver));
		System.out.println("Register success");    
	}
	
	@Test
	public void SearchAction() throws InterruptedException{
		driver.get(baseUrl);
		Thread.sleep(1000);
		SearchPage.closePopup(driver).click();
		Thread.sleep(2500);
		Thread.sleep(1000);
		SearchPage.getSearchBox(driver, "Asus");
		SearchPage.tabSearchButton(driver).click();
		Assert.assertEquals("Asus - GittiGidiyor", driver.getTitle());
		System.out.println("Search product success");
		
		
	}
	
    @After
	public void tearDown() throws Exception {
		driver.quit();
	}
    
    
}
