package ProectSwagLabs.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(id = "user-name")
    public WebElement userNameInput;

    @FindBy(id= "password")
    public WebElement userPasswordInput;

    @FindBy(id = "login-button")
    public WebElement loginButton;

}
