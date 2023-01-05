package pages;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * this class contains the object repository of login page
 * @author vanig
 *
 */
/**
 * @author vanig
 *
 */
public class LoginPage extends BasePage {
	
	
	@FindBy(id= "username")
	public WebElement username;
	
	@FindBy(name = "pw")
	public WebElement password;
	
	@FindBy(id = "Login")
	public WebElement loginButton;
	
	@FindBy(xpath = "//*[@id='rememberUn']")
	public WebElement rememberMe;
	
	@FindBy(css = "#error")
	public WebElement logininErrorMsg;
	
	@FindBy(id = "un")
	public WebElement forgetUsername;
	
	@FindBy(partialLinkText = "Forgot Your")
	public WebElement forgotPassword;
	
	/**
	 * This method enters the user name. Call this when you are on login page
	 * @param username
	 * @param driver webDriver type
	 * @return true if userName is entered
	 */
	public Boolean enterUsername(String username, WebDriver driver) {
		if(this.username.isDisplayed()) {
			this.username.sendKeys(username);
			return true;
		}else {
			return false;
		}
	
		}
	}
	


