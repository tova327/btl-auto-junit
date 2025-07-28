package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SearchResult extends BtlBasePage {
    public SearchResult(WebDriver driver) {
        super(driver);
    }

    public String getTitle(){

        WebElement titleElement = driver.findElement(By.xpath("//*[@id='results']/h2"));
        return titleElement.getText();
    }

}
