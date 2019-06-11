package pages;

import base.MobileAPI2;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Homepage extends MobileAPI2 {
    @FindBy(xpath = "//android.widget.TextView[@id=com.cricbuzz.android:id/bb_bottom_bar_title]")
    public WebElement more;

    public void clickMore() {
        more.click();
    }
}
