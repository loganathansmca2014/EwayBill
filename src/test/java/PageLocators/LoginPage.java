package PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    @FindBy(xpath = "//input[@type='email']")
    public static WebElement email;



    @FindBy(xpath = "//input[@type='password']")
    public static WebElement password;


    @FindBy(xpath = "(//button[@mat-ripple-loader-class-name='mat-mdc-button-ripple']//span)[2]")
    public static WebElement login;
}

