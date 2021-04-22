package com.automationpractice.questions.logindeusuarios;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static com.automationpractice.userinterfaces.YourOpenSourceCms.*;

public class CreateExitoso implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {


        return (TXT_WELCOME).resolveFor(actor).isPresent() ? true : false;
    }

    public static CreateExitoso withDataLogin(){
        return new CreateExitoso();
    }
}
