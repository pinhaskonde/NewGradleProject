package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id = "register")
    WebElement regButton;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void goTo(String site_url) {
        wd.get(site_url);
    }

    public void clickRegisterButton() {
        regButton.click();
    }


}
