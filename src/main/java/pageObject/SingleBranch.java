package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class SingleBranch extends BtlBasePage{
    public SingleBranch(WebDriver driver) {
        super(driver);
    }
    public boolean checkInformationExistance(){
        // Check for "כתובת"
        boolean isAddressPresent = isElementWithTextPresent("כתובת");

        // Check for "קבלת קהל"
        boolean isReceptionHoursPresent = isElementWithTextPresent("קבלת קהל");

        // Check for "מענה טלפוני"
        boolean isPhoneResponsePresent = isElementWithTextPresent( "מענה טלפוני");

        return isAddressPresent&&isPhoneResponsePresent&&isReceptionHoursPresent;

    }
    private boolean isElementWithTextPresent(String text) {
        // Find elements containing the specified text
        List<WebElement> elements = driver.findElements(By.xpath("//*[contains(text(), '" + text + "')]"));
        return !elements.isEmpty(); // Return true if at least one element is found
    }
}
