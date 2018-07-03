package i.uatests.tests;

import i.uatests.pages.loginPage;
import i.uatests.pages.mainPage;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static java.lang.Thread.*;

public class loginTest {
    public static WebDriver driver;
    public static loginPage loginPage;
    public static mainPage mainPage;

    @BeforeClass
    public static void setup()
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tom\\Desktop\\Chromedriver.exe");
        driver = new ChromeDriver();
        loginPage = new loginPage(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://www.i.ua");
    }

    @Test
    public void loginTest(){
        loginPage.inputLogin("kostyaffffff@i.ua");
        loginPage.inputPassword("root210");
        loginPage.clickLoginButton();

    }

    @Test
    public void nicknameCheck() throws NullPointerException{
        String nickNameUser = mainPage.getNickname();
        Assert.assertEquals("kosnssn", nickNameUser);
    }

    @AfterClass
    public static void tearDown()
    {
        driver.quit();
    }
}
