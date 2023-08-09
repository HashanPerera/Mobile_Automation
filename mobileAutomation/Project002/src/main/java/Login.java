import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Login {

    public static void login() throws MalformedURLException, InterruptedException {


            //DesiredCapabilities cap = SetUP.caps;
            //AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);

           // SetUP.SetUpData(".MainActivity");

        DesiredCapabilities caps = new DesiredCapabilities();
        AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), caps);

        caps.setCapability("undid", "R58R719N83M"); //DeviceId from "adb devices" command
        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion", "10.0");
        caps.setCapability("appPackage", "lk.tc.finpal");
        caps.setCapability("appActivity", ".SplashScreenActivity");
        caps.setCapability("noReset", "true");
        caps.setCapability("fullReset", "false");


        //cap.setCapability("noReset", "true");
            //cap.setCapability("fullReset", "false");


            //AndroidDriver driver = SetUP.driver1;
            System.out.println("succees");

            //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            Thread.sleep(5000);
            WebElement el13 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.TextView"));
            el13.click();
            Thread.sleep(1000);
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement el14 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[3]"));
            el14.click();
            Thread.sleep(1000);
            //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement el15 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[3]/android.view.ViewGroup[2]/android.widget.TextView"));
            el15.click();
            Thread.sleep(1000);//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement el16 = driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[3]/android.widget.TextView"));
            el16.click();
            System.out.println("Logged");
            Thread.sleep(5000);

           ///log with logout///
            /*
            driver.pressKey(new KeyEvent(AndroidKey.BACK));
            driver.pressKey(new KeyEvent(AndroidKey.BACK));
            Thread.sleep(5000);
            driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup/android.view.ViewGroup[2]/android.widget.TextView")).click();
            */


    }

}
