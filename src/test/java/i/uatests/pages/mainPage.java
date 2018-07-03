package i.uatests.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class mainPage {
    private static WebDriver driver;

    public mainPage(WebDriver driver)
    {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(className = "user_name")
    private WebElement userNickName;

    public String getNickname()
    {
        String nickName = userNickName.getText();
        return nickName;
    }
}
