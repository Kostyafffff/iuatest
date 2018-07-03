package i.uatests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
    public WebDriver driver;

    public loginPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(name = "login")
    private WebElement loginField;

    @FindBy(name = "pass")
    private WebElement passField;

    @FindBy(xpath = "/html/body/div[3]/div[3]/div[3]/div[2]/div[1]/div[3]/form/p/input")
    private WebElement loginButton;


    public void inputLogin(String login)
    {
        loginField.sendKeys(login);
    }

    public void inputPassword(String password)
    {
        passField.sendKeys(password);
    }

    public void clickLoginButton()
    {
        loginButton.click();
    }


}
