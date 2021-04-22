package com.automationpractice.stepdefinitions.page;

import com.automationpractice.tasks.page.EnterValueCreateNewPage;
import cucumber.api.java.Before;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static com.automationpractice.utils.constants.IntegerConstants.CERO;
import static com.automationpractice.utils.constants.StringConstants.BUYER;

public class AddPage {

    @Managed(driver = "chrome")
    private WebDriver TheNavigator;
    private Actor buyer = Actor.named(BUYER);


    @Before
    public void SetUp() {
        buyer.can(BrowseTheWeb.with(TheNavigator));
        TheNavigator.manage().window().maximize();
    }


    @When("^the user enter the data to start to create the pages")
    public void theUserEnterTheDataToStartToCreateThePages() throws Exception {
        buyer.attemptsTo(EnterValueCreateNewPage.on());
    }






}
