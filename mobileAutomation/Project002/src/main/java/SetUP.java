import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class SetUP {

     static DesiredCapabilities caps = new DesiredCapabilities();

    public SetUP() throws MalformedURLException {
    }

    public static void SetUpData(String activity) throws MalformedURLException {

           DesiredCapabilities caps = new DesiredCapabilities();
           AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

            caps.setCapability("undid", "R58R719N83M"); //DeviceId from "adb devices" command
            caps.setCapability("platformName", "Android");
            caps.setCapability("platformVersion", "10.0");
            caps.setCapability("appPackage", "lk.tc.finpal");
            caps.setCapability("appActivity", activity);
            //caps.setCapability("appWaitActivity", ".SplashScreenActivity");
            //caps.setCapability("appActivity", ".MainActivity");
            //caps.setCapability("noReset", "false");

        }

}
