package ProectSwagLabs.TestSteps;

import ProectSwagLabs.Utils.DriverUtil;
import ProectSwagLabs.Utils.PropertiesFileReader;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    @BeforeTest
    public void beforeTest(){
        DriverUtil.getDriver().get(PropertiesFileReader.getProperties("URL"));
        DriverUtil.getDriver().manage().window().maximize();
        DriverUtil.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }
    @AfterTest
    public void afterTest() {DriverUtil.getDriver().quit();}
}
