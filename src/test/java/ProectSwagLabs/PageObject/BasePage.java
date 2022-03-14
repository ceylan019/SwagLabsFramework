package ProectSwagLabs.PageObject;

import ProectSwagLabs.Utils.DriverUtil;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    public BasePage(){PageFactory.initElements(DriverUtil.getDriver(),this); }


}
