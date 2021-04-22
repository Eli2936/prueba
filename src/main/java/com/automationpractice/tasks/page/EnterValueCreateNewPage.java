package com.automationpractice.tasks.page;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.automationpractice.userinterfaces.YourOpenSourceCms.BTN_NEW_;
import static com.automationpractice.userinterfaces.YourOpenSourceCms.BTN_PAGE;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class EnterValueCreateNewPage  implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BTN_PAGE),
                Click.on(BTN_NEW_)
        );
    }
    public static EnterValueCreateNewPage on(){
        return instrumented(EnterValueCreateNewPage.class);
    }
}
