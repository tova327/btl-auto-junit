package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Branches extends BtlBasePage{

    public Branches(WebDriver driver) {
        super(driver);
    }
    public SingleBranch getRandomBranch(){
        List<WebElement> branchesLinks = driver.findElements(By.xpath("//li[contains(@id, 'ctl00_SiteHeader_SwitchLanguage')]"));
        branchesLinks.stream().findAny().get().click();
        return new SingleBranch(driver);
    }

}
