package com.automationpractice.tasks.post;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.automationpractice.utils.constants.StringConstants.DATA;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.*;

import static com.automationpractice.userinterfaces.YourOpenSourceCms.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterValuesLogin implements Task {

    private PageObject page;

    public EnterValuesLogin(PageObject page){
        this.page=page;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Open.browserOn(page));
        actor.attemptsTo(
                WaitUntil.the(TXT_USERNAMES,isCurrentlyVisible()),
                Enter.theValue(DATA).into(TXT_USERNAMES),
                Enter.theValue(DATA).into(TXT_PASSWORD),
                Click.on(BTN_LOGINS));



    }
    public static EnterValuesLogin on(PageObject page){
        return instrumented(EnterValuesLogin.class,page);
    }


}
