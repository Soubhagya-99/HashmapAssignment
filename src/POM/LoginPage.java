package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Generics.Hashmap;

public class LoginPage {
public WebDriver driver;
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath ="//input[@placeholder='Password']")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement  keepLoggedInCheckBox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(id="toPasswordRecoveryPageLink")
	private WebElement toPasswordRecoveryPageLink;
	
	@FindBy(xpath = "//a[.='actiTIME Inc.']")
	private WebElement actiTIMEinc;
	
public LoginPage(WebDriver driver) 
{
	PageFactory.initElements(driver,this);
	this.driver=driver;
}

public void Username()
{
	usernameTextfield.sendKeys(Hashmap.getUsername("productmanager"));
}
public void Password()
{
	passwordTextfield.sendKeys(Hashmap.getPassword("Seller"));
}
//////////////////////////////////////////////////
//***********************************************//
public void Password1()
{
	System.out.println(passwordTextfield.getText());
}
//********************************************//
//////////////////////////////////////
public void loginbutton()
{
	
	keepLoggedInCheckBox.click();
	loginButton.click();
}

public void forgotpassword() {
	toPasswordRecoveryPageLink.click();
}
public void Actitimeinc()
{
	actiTIMEinc.click();
}
}
