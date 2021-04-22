package com.automationpractice.tasks.post;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static com.automationpractice.userinterfaces.YourOpenSourceCms.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;


public class EnterValueCreateNewPost implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

                actor.attemptsTo(
                        Click.on(BTN_POST),
                        Click.on(BTN_NEW_)
                );
    }
    public static EnterValueCreateNewPost on(){
        return instrumented(EnterValueCreateNewPost.class);
    }
}
