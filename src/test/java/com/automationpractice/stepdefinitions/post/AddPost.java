package com.automationpractice.stepdefinitions.post;

import com.automationpractice.exceptions.Busqueda.notFoundAnswer;
import com.automationpractice.tasks.post.EnterValueCreateNewPost;
import com.automationpractice.tasks.post.EnterValuesLogin;
import com.automationpractice.userinterfaces.OpenOpenSourceCms;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.hamcrest.Matchers;
import org.openqa.selenium.WebDriver;

import java.util.List;

import static com.automationpractice.questions.logindeusuarios.CreateExitoso.withDataLogin;
import static com.automationpractice.utils.constants.IntegerConstants.CERO;
import static com.automationpractice.utils.constants.StringConstants.BUYER;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class AddPost {


    @Managed(driver = "chrome")
    private WebDriver TheNavigator;
    private Actor buyer = Actor.named(BUYER);
    private OpenOpenSourceCms RetoPage;


    @Before
    public void SetUp() {
        buyer.can(BrowseTheWeb.with(TheNavigator));
        TheNavigator.manage().window().maximize();
    }

    @Given("^the user visited your the main page$")
    public void theUserVisitedYourTheMainPage() throws Exception {
        buyer.wasAbleTo(EnterValuesLogin.on(RetoPage));
    }

    @When("^the user enter the data to start to create the posts$")
    public void theUserEnterTheDataToStartToCreateThePosts() throws Exception {
        buyer.attemptsTo(EnterValueCreateNewPost.on());
    }

    @Then("^the user should to see the page created successful$")
    public void theUserShouldToSeeThePageCreatedSuccessful() throws Exception {
        buyer.should(seeThat(withDataLogin(), Matchers.equalTo(true)).orComplainWith(notFoundAnswer.class,notFoundAnswer.notFoundAnswer()));

    }


}
