package com.e2e.entretienSaucelabs.step_definition;

import org.openqa.selenium.By;
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
	public SeleniumUtils seleniumUtils;
	public Validations validations;
	private WebDriver driver = Setup.getDriver();

	public ProductStepDefinition() {
		productPage = new ProductPage();
		configFileReader = new ConfigFileReader();
		seleniumUtils = new SeleniumUtils();
		validations = new Validations();

	}

	@Then("Je me rederige vers la page home")
	public void jeMeRederigeVersLaPageHome() {
		boolean isDisplayed = validations.isElementDisplayed(ProductPage.getElementVerif());
	}

	@When("Je clique sur le bouton Add to cart")
	public void jeCliqueSurLeBoutonAddToCart() throws InterruptedException {
		Thread.sleep(3000);

		seleniumUtils.click(ProductPage.getBtnaddtocart());

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
