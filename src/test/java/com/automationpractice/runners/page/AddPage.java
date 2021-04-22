package com.automationpractice.runners.page;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/page/add_page.feature",
        glue = "com.automationpractice.stepdefinitions",
        snippets = SnippetType.CAMELCASE

)

public class AddPage {
}
