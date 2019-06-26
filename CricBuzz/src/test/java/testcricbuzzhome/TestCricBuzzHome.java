package testcricbuzzhome;

import base.MobileAPI2;
import cricbuzzhome.CricBuzzHome;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestCricBuzzHome extends MobileAPI2 {
    CricBuzzHome home;
    @BeforeMethod
    public void init(){
        home = PageFactory.initElements(appiumDriver,CricBuzzHome.class);
    }
    @Test
    public void ClickOnFeaturesVideos(){
        home.setFeaturesVideos();
    }

}
