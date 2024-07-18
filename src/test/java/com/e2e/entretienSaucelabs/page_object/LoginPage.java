package com.e2e.entretienSaucelabs.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2e.entretienSaucelabs.utils.BasePage;
import com.e2e.entretienSaucelabs.utils.Setup;




public class LoginPage extends BasePage {
	
	/* Retrieve web element */
	@FindBy(how = How.ID, using = "user-name")
	private static WebElement email;

	@FindBy(how = How.ID, using = "password")
	private static WebElement password;

	@FindBy(how = How.XPATH, using = "//*[@id=\"login-button\"]")
	private static WebElement btnLogin;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"header_container\"]/div[1]/div[2]/div")
	private static WebElement text;
	
	public LoginPage() {
    	super(Setup.getDriver()); 
    }
	/* Create getter */
	public static WebElement getEmail() {
		return email;
	}

	public static WebElement getPassword() {
		return password;
	}

	public static WebElement getBtnLogin() {
		return btnLogin;
	}
	
	public static WebElement getTitlePage() {
		return text ;
	}
	
	
	
	

}
