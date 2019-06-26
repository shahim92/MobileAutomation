package cricbuzzhome;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CricBuzzHome extends MobileAPI2 {
    @FindBy(xpath = "//*[@id=\"screenshotContainer\"]/div/div/div/div/div/div[50]")
    WebElement FeaturesVideos;
    public void setFeaturesVideos(){
        FeaturesVideos.click();

    }
}
