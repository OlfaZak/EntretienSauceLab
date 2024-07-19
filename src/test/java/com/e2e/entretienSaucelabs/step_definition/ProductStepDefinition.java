package com.e2e.entretienSaucelabs.step_definition;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.e2e.entretienSaucelabs.page_object.LoginPage;
import com.e2e.entretienSaucelabs.page_object.ProductPage;
import com.e2e.entretienSaucelabs.utils.BasePage;
import com.e2e.entretienSaucelabs.utils.ConfigFileReader;
import com.e2e.entretienSaucelabs.utils.SeleniumUtils;
import com.e2e.entretienSaucelabs.utils.Setup;
import com.e2e.entretienSaucelabs.utils.Validations;
import com.e2e.entretienSaucelabs.utils.Wait;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProductStepDefinition {
	public ProductPage productPage;
	public ConfigFileReader configFileReader;
	public BasePage basepage;
	public LoginPage loginPage;
	public SeleniumUtils seleniumUtils;
	public Validations validations;
	private WebDriver driver = Setup.getDriver();

	public ProductStepDefinition() {
		productPage = new ProductPage();
		configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils();
		validations = new Validations();
		loginPage = new LoginPage();

	}
	

//	@Then("Je me rederige vers la page home {string}")
//	public void jeMeRederigeVersLaPageHome(String expectedURL) {
//		validations.checkChangedURL(expectedURL);
//	
//	}
	
	@Then("Je me rederige vers la page home {string}")
	public void jeMeRederigeVersLaPageHome(String expectedText) {
		WebElement element = LoginPage.getTitlePage(); 
        validations.assertEquals(element, expectedText);
        System.out.println("The title of page is:" +expectedText);
	}

//
//	@Then("Je me redirige vers la page home {string}")
//	public void jeMeRedirigeVersLaPageHome(String expectedURL) {
//		
//		validations.checkChangedURL(expectedURL);
//		
////	String titlePage = LoginPage.getTitlePage().getText();
////	Assert.assertEquals(titlePage, text);
//	}

	@When("Je clique sur le bouton Add to cart")
	public void jeCliqueSurLeBoutonAddToCart() throws InterruptedException {
		Thread.sleep(3000);

		seleniumUtils.click(ProductPage.getBtnaddtocart());
		

	}
	
	
	@When("Je verifie l'ajout du produit {string}")
	public void jeVerifieLAjoutDuProduit(String expectedProduct) {
		WebElement element = ProductPage.getproductName(); 
        validations.assertEquals(element, expectedProduct);
        System.out.println("The name of the product is:" +expectedProduct);
	}







	@When("je click sur le panier")
	public void jeClickSurLePanier() {
		seleniumUtils.click(ProductPage.getbtnPanier());
	}

	@When("Je clique sur le bouton Chekout")
	public void jeCliqueSurLeBoutonChekout() {
		seleniumUtils.click(ProductPage.btnCheckout());

	}

	@When("Je saisie le Prenom {string}")
	public void jeSaisieLePrenom(String firstName) {
		ProductPage.getfirstName().clear();
		seleniumUtils.writeText(ProductPage.getfirstName(), firstName);

	}

	@When("Je saisie le nom {string}")
	public void jeSaisieLeNom(String lastName) {
		seleniumUtils.writeText(ProductPage.getlastName(), lastName);

	}

	@When("je saisie le code Postal {string}")
	public void jeSaisieLeCodePostal(String postalCode) {
		seleniumUtils.writeText(ProductPage.getcodePostal(), postalCode);

	}

	@When("je clique sur le bouton Continue")
	public void jeCliqueSurLeBoutonContinue() {
		seleniumUtils.click(ProductPage.getbtnContinue());
	}
	
	
	@When("je verifie le prix de produit {string}")
	public void jeVerifieLePrixDeProduit(String productPrice) {
		
		WebElement element = ProductPage.getproductPrice(); 
        validations.assertEquals(element, productPrice);
        System.out.println("The price of product is :" +productPrice);
	   
	}


	@When("Je click sur le bouton finish")
	public void jeClickSurLeBoutonFinish() {
		seleniumUtils.click(ProductPage.getbtnFinish());
	}

	@When("Je clique sur le bouton backhome")
	public void jeCliqueSurLeBoutonBackhome() {
		seleniumUtils.click(ProductPage.getbtnBackHome());
	}

	@When("Je clique sur le burger menu")
	public void jeCliqueSurLeBurgerMenu() {
		seleniumUtils.click(ProductPage.btnBurgerMenu());
	}

	@When("Je clique sur le bouton logout")
	public void jeCliqueSurLeBoutonLogout() {

		WebElement btnLogout = Wait.waitUntilClickable(driver, ProductPage.btnbtnLogout());
		btnLogout.click();

	}

}
