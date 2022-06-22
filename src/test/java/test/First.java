package test;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.RegisterPage;
import pages.User;

public class First extends TestBase {

    RegisterPage registerPage;
    HomePage homePage;

    @BeforeMethod
    public void initTest() {
        registerPage = PageFactory.initElements(wd, RegisterPage.class);
        homePage = PageFactory.initElements(wd, HomePage.class);
    }

    User firstUser = new User("Tomas", "Edison",
            "555991211", "+1185021345",
            "04121988", "Male", "true");

    @Test
    public void fillRegFormNegativePhone() throws InterruptedException {
        homePage.goTo(SITE_URL);
        homePage.clickRegisterButton();
        Thread.sleep(1100);
        char pageNumbBeforeClick = registerPage.getPageCount().charAt(0);
        registerPage.fillNameField(firstUser.getFirstName())
                .fillLastNameField(firstUser.getLastName())
                .fillPersonalIdField(firstUser.getId())
                .fillPhoneField(firstUser.getPhone())
                .setDateOfBirth(firstUser.getDateOfBirth())
                .setGender(firstUser.getGender())
                .setAgreeTerms(firstUser.getTerms());
        registerPage.clickActivateButton();
        char pageNumbAfterClick = registerPage.getPageCount().charAt(0);

        System.out.println("pageNumbAfterClick: " + pageNumbAfterClick + "\n>>char " + pageNumbAfterClick);

        Assert.assertTrue(pageNumbBeforeClick == pageNumbAfterClick);

        Thread.sleep(2500);

        System.out.println(">>> User's data: " + firstUser.toString());

    }


}




