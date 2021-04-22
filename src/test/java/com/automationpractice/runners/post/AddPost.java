package com.automationpractice.runners.post;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/post/add_post.feature",
        glue = "com.automationpractice.stepdefinitions",
        snippets = SnippetType.CAMELCASE

)

public class AddPost {
}
