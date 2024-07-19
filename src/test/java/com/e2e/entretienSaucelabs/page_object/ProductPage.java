package com.e2e.entretienSaucelabs.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2e.entretienSaucelabs.utils.BasePage;
import com.e2e.entretienSaucelabs.utils.Setup;



public class ProductPage extends BasePage  {
	@FindBy(how = How.XPATH, using = "//*[@id=\"header_container\"]/div[1]/div[2]/div")
	private static WebElement elementVerif;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	private static WebElement addtocart;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"shopping_cart_container\"]/a")
	private static WebElement btnPanier;
	
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"checkout\"]")
	private static WebElement btnCheckout;
	
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"first-name\"]")
	private static WebElement firstName;
	

	@FindBy(how = How.XPATH, using = "//*[@id=\"last-name\"]")
	private static WebElement lastName;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"postal-code\"]")
	private static WebElement codePostal;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"continue\"]")
	private static WebElement btnContinue;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"finish\"]")
	private static WebElement btnFinish;
	
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"back-to-products\"]")
	private static WebElement btnBackHome;
	
	public static WebElement getbtnBackHome() {
		return btnBackHome;
	}
	@FindBy(how = How.XPATH, using = "//*[@id=\"react-burger-menu-btn\"]")
	private static WebElement btnBurgerMenu;
	
	
	@FindBy(how = How.XPATH, using = "/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]")
	private static WebElement btnLogout;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"item_4_title_link\"]/div")
	private static WebElement productName;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"checkout_summary_container\"]/div/div[1]/div[3]/div[2]/div[2]/div")
	private static WebElement productPrice;
	
	public ProductPage() {

		super(Setup.getDriver());

	}
	
	/* Create getter */
	
	public static WebElement getElementVerif() {
		return elementVerif;
	}
	public static WebElement getBtnaddtocart() {
		return addtocart;
	}
	public static WebElement getbtnPanier() {
		return btnPanier;
	}
	public static WebElement btnCheckout() {
		return btnCheckout;
	}
	public static WebElement getfirstName() {
		return firstName;
	}
	public static WebElement getlastName() {
		return lastName;
	}
	public static WebElement getcodePostal() {
		return codePostal;
	}
	public static WebElement getbtnContinue() {
		return btnContinue;
	}
	public static WebElement getbtnFinish() {
		return btnFinish;
	}
	public static WebElement btnBurgerMenu() {
		return btnBurgerMenu;
	}
	public static WebElement btnbtnLogout() {
		return btnLogout;
	}
	
	public static WebElement getproductName() {
		return productName ;
	}
	public static WebElement getproductPrice() {
		return productPrice ;
	}
}
