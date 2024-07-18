package com.e2e.entretienSaucelabs;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/spec/features"},
		plugin = {"pretty", "html:target/Cucumber_Report.html"},
		tags = ("@ajoutProduit"),
		monochrome = false,
		snippets = CAMELCASE
		)
public class RunWebSuitTest {
	 		


    }
