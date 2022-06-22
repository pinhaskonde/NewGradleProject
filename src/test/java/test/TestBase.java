package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pages.HomePage;
import pages.RegisterPage;

public class TestBase {

    protected HomePage homePage;
    protected WebDriver wd;
    public First first;

    public RegisterPage registerPage;

    String SITE_URL = "http://students-aid.org:9222/";

    @BeforeSuite
    public void start() {

        wd = new ChromeDriver();
        wd.manage().window().maximize();

        homePage = PageFactory.initElements(wd, HomePage.class);
        registerPage = PageFactory.initElements(wd, RegisterPage.class);
        first = PageFactory.initElements(wd, First.class);

    }

    @AfterSuite
    public void tearDown() {
        wd.quit();
    }


}


