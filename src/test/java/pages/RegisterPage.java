package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "firstname")
    WebElement xpathFirstName;

    @FindBy(xpath = "//input[@id='lastname']")
    WebElement xpathLastName;
    @FindBy(xpath = "//input[@id='personalId']")
    WebElement xpathPersonalId;
    @FindBy(xpath = "//input[@id='phone']")
    WebElement xpathPhone;
    @FindBy(id = "dateOfBirth")
    WebElement dateOfBirth;
    @FindBy(css = ".gender.male.h5.col-4.py-2.px-0.box-select")
    WebElement genderMale;
    @FindBy(css = ".gender.male.h5.col-4.py-2.px-0.box-select")
    WebElement genderFemale;
    @FindBy(css = ".gender.other.h5.col-4.py-2.px-0.box-select")
    WebElement genderElse;
    @FindBy(xpath = "//input[@id='agreeTerms']")
    WebElement yesAgreeTerms;

    @FindBy(css = ".button-big.button-active")
    WebElement activateButton;

    @FindBy(xpath = "//div[@id='tab-steps-counter']")
    WebElement pagesCount;

    public void type(By element, String text) {
        wd.findElement(By.xpath(String.valueOf(element))).click();
    }

    public RegisterPage fillNameField(String name) {
        xpathFirstName.click();
        xpathFirstName.clear();
        xpathFirstName.sendKeys(name);
        return this;
    }

    public RegisterPage fillLastNameField(String lastName) {
        xpathLastName.click();
        xpathLastName.clear();
        xpathLastName.sendKeys(lastName);
        return this;
    }

    public RegisterPage fillPersonalIdField(String personalId) {
        xpathPersonalId.click();
        xpathPersonalId.clear();
        xpathPersonalId.sendKeys(personalId);
        return this;
    }

    public RegisterPage fillPhoneField(String phone) {
        xpathPhone.click();
        xpathPhone.clear();
        xpathPhone.sendKeys(phone);
        return this;
    }

    public RegisterPage setDateOfBirth(String date) {
        dateOfBirth.click();
        dateOfBirth.sendKeys(date);
        return this;
    }

    public RegisterPage setGender(String gender) {
        if (gender == "Male") {
            genderMale.click();
        } else if (gender == "Famele") {
            genderFemale.click();
        } else {
            genderElse.click();
        }
        return this;
    }

    public RegisterPage setAgreeTerms(Boolean answer) {
        if (answer == true) {
            yesAgreeTerms.click();
        } else {
            return this;
        }
        return this;
    }

    public void clickActivateButton() {
        activateButton.click();
    }

    public String getPageCount() {
        String currentPage = pagesCount.getText();
        return currentPage;
    }

//    public void checkPageNumb(){
//        getPageCount();
//        if (pagesCount)
//    }

}
