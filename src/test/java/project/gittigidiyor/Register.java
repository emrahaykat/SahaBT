package project.gittigidiyor;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Register {
	public static WebElement element = null;
	
	//Sign Up link
	
	public static WebElement getSignupLink(WebDriver driver){
		element=driver.findElement(By.xpath(Paths.Register.getPath()));
		return element;
	}
	
	//user name
	public static WebElement getUsername(WebDriver driver) {
		element = driver.findElement(By.xpath(Paths.Username.getPath()));
		return element;
	}
	
	public static void Username(WebDriver driver, String username){
		element=getUsername(driver);
		element.sendKeys(username);
	}
	
	//user surname
	public static WebElement getSurname(WebDriver driver) {
		element = driver.findElement(By.xpath(Paths.UserSurname.getPath()));
		return element;
	}
	
	public static void UserSurname(WebDriver driver, String surname){
		element=getSurname(driver);
		element.sendKeys(surname);
	}
	
	//Email
	public static WebElement getEmail(WebDriver driver) {
		element = driver.findElement(By.xpath(Paths.UserEmail.getPath()));
		return element;
	}
	
	public static void UserEmail(WebDriver driver, String email){
		element=getEmail(driver);
		element.sendKeys(email);
	}
	
	//User Nick Name
	public static WebElement getNickName(WebDriver driver) {
		element = driver.findElement(By.xpath(Paths.NickName.getPath()));
		return element;
	}
	
	public static void Nickname(WebDriver driver, String nick){
		element=getNickName(driver);
		element.sendKeys(nick);
	}
	
	//Nickname suggestion
	public static WebElement selectNickName(WebDriver driver)
	{
		element=driver.findElement(By.xpath(Paths.NickNameSuggestion.getPath()));
		return element;
	}
	
	// Password
	public static WebElement getPassword(WebDriver driver) {
		element = driver.findElement(By.xpath(Paths.Password.getPath()));
		return element;
	}
	
	public static void Password(WebDriver driver, String password){
		element=getPassword(driver);
		element.sendKeys(password);
	}
	//Password again
	
	public static WebElement getPasswordAgain(WebDriver driver) {
		element = driver.findElement(By.xpath(Paths.PasswordAgainField.getPath()));
		return element;
	}
	
	public static void PasswordAgain(WebDriver driver, String password){
		element=getPasswordAgain(driver);
		element.sendKeys(password);
	}
	
	//Gsmcode
	public static WebElement getGsmCode(WebDriver driver) {
		element = driver.findElement(By.xpath(Paths.GsmCode.getPath()));
		return element;
	}
	
	public static void GsmCode(WebDriver driver, String gsm){
		element=getGsmCode(driver);
		element.sendKeys(gsm);
	}
	
	//GsmNumber
	public static WebElement getNumber(WebDriver driver) {
		element = driver.findElement(By.xpath(Paths.GsmNumber.getPath()));
		return element;
	}
	
	public static void PhoneNumber(WebDriver driver, String gsmnum){
		element=getNumber(driver);
		element.sendKeys(gsmnum);
	}
	///Submit form
	
	public static WebElement SubmitForm(WebDriver driver)
	{
		element=driver.findElement(By.xpath(Paths.RegisterButton.getPath()));
		return element;
	}
	
	//Login  test case
	
	public static WebElement clickLoginLink(WebDriver driver) {
		element = driver.findElement(By.xpath(Paths.SignInLink.getPath()));
		return element;
	}
	public static WebElement getLoginEmail(WebDriver driver) {
		element = driver.findElement(By.xpath(Paths.UsernameField.getPath()));
		return element;
	}

	public static void getLoginEmail(WebDriver driver, String mail){
		element=getLoginEmail(driver);
		element.sendKeys(mail);
	}
	
	public static WebElement getLoginPassword(WebDriver driver){
		element=driver.findElement(By.xpath(Paths.PasswordField.getPath()));
		return element;
	}
	
	public static void getLoginPassword(WebDriver driver,String password){
		element=getLoginPassword(driver);
		element.sendKeys(password);
	}
	
	public static WebElement submitLoginForm(WebDriver driver){
		element=driver.findElement(By.xpath(Paths.LoginButton.getPath()));
		return element;
	}
	
	
	//close popup
	 public static WebElement closePopup(WebDriver driver){
	    	element=driver.findElement(By.xpath(Paths.StartPopup.getPath()));
	    	return element;
	    }
	public static String verifyRegistrationPage(WebDriver driver)
	{
		return  driver.findElement(By.xpath(Paths.verifyRegistration.getPath())).getText();
	}
}
