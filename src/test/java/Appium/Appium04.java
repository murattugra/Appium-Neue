package Appium;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Appium03 {


    @Test
    public void test() throws MalformedURLException, InterruptedException {

        DesiredCapabilities capabilities = new DesiredCapabilities();


        //    capabilities.setCapability(("platformNAme","Android");              Ayni
        //   capabilities.setCapability(CapabilityType.PLATFORM_NAME,"Android");   Ayni

        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"RealDevice");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\Dell\\IdeaProjects\\AppiumProject01\\src\\Apps\\gestureTool.apk");
        capabilities.setCapability("appPackage","com.davemac327.gesture.tool");
        capabilities.setCapability("appActivity","com.davemac327.gesture.tool.GestureBuilderActivity");

       capabilities.setCapability("noReset",true);//   app deki izinleri atlayarak ana sayfasinin acilmasi icin yazilir

        AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);

     //   Thread.sleep(3000);
 // driver.findElementById("com.android.permissioncontroller:id/continue_button").click();
     //   Thread.sleep(3000);
      MobileElement popup01=driver.findElementById("android:id/button1");
     popup01.click();
        Thread.sleep(3000);
  //MobileElement okButton= driver.findElementByXPath("//android.widget.Button[@text='OK']");
     //   Thread.sleep(3000);
  MobileElement homeScreenTitle=driver.findElementById("android:id/title");
        Thread.sleep(3000);
        Assert.assertTrue(homeScreenTitle.isDisplayed());

    }


}
