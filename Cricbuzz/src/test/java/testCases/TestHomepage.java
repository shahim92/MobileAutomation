package testCases;

import base.MobileAPI2;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Homepage;


public class TestHomepage extends MobileAPI2 {
    Homepage homepage;
    @BeforeMethod
    public void init() {
        homepage = PageFactory.initElements(appiumDriver,Homepage.class);

    }
    @Test
    public void testLogIn() {
        //homepage.clickMore();
        appiumDriver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[5]\n")).click();;
    }


}
