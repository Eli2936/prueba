package com.automationpractice.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class YourOpenSourceCms {
    public static final Target TXT_USERNAMES =  Target.the("Ingresar Correo").located(By.xpath("//div/form/p/input[@id='user_login']"));
    public static final Target TXT_PASSWORD =  Target.the("Ingresar PassWord").located(By.xpath("//div/input[@id='user_pass']"));
    public static final Target BTN_LOGINS =  Target.the("Boton para redirección al login").located(By.xpath("//p/input[@id='wp-submit']"));
    public static final Target BTN_POST =  Target.the("Boton para las opciones POST").located(By.xpath("//a/div[contains(text(),'Posts')]"));
    public static final Target BTN_PAGE = Target.the("Boton para las opciones PAGE").located(By.xpath("//a/div[contains(text(),'Pages')]"));
    public static final Target BTN_NEW_ = Target.the("Boton para las opciones POST New POST").located(By.xpath("//div/h1/following-sibling::a[contains(text(),'Add New')]"));
    public static final Target TXT_WELCOME = Target.the("Boton para las opciones PAGE New PAGE").located(By.xpath("//div/h1[contains(text(),'Welcome to the block editor')]"));
}
